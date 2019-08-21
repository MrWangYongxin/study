package com.wyx.test.study.test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ConvertTest {
    public static void main(String[] args) {
        //操作网络流
        try (InputStream inputStream = new URL("http://www.baidu.com").openStream();
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("D:\\baidu.txt")));) {
            BufferedReader bs = new BufferedReader(new InputStreamReader(inputStream));
            int temp;
            String str = null;
            while ((str = bs.readLine()) != null) {
                bw.write(str);
                bw.flush();
            }
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
