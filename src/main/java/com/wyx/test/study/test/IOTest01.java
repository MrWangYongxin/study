package com.wyx.test.study.test;

import java.io.*;
import java.util.Arrays;

public class IOTest01 {
    public static void main(String[] args) {
        //1、创建源
        File src = new File("aa");//如果没有则创建
        File dest = new File("out");
        BufferedReader reader=null;
        BufferedWriter writer = null;
        int temp;
        try {
            //2、选择流
            reader = new BufferedReader(new FileReader(src));
            writer = new BufferedWriter(new FileWriter(dest,true));
            String str = null;
            while((str=reader.readLine())!=null){
                writer.write(str);
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4、释放
            try {
                if(reader!=null) {
                    reader.close();
                }
                if(writer != null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
