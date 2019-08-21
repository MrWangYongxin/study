package com.wyx.test.study.test;

import java.io.*;
import java.util.zip.ZipOutputStream;

public class IOTest02 {
    public static void main(String[] args) {
      byte[] b = fileToByte("11.jpeg");
        System.out.println(b.length);
        byteToFile(b);
    }

    public static void byteToFile(byte[] bytes){
        File dest = new File("copy.jpeg");
        InputStream os = new BufferedInputStream(new ByteArrayInputStream(bytes));
        byte[] flush = new byte[1024];
        int len =-1;
        try(FileOutputStream fos = new FileOutputStream(dest)) {
            while((len=os.read(flush))!=-1){
                fos.write(flush,0,len);
                fos.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static byte[] fileToByte(String path){
        File src = new File(path);
        try {
            FileInputStream fis = new FileInputStream(src);
            /**
             *toByteArray()是ByteArrayOutputStream自己定义的方法
             *所以这里不能用父类接受其对象（不能使用多态）
             * new ByteArrayOutputStream()不需要给目的数据源
             * 其内置了一个缓冲区
             */
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] bytes;
            byte[] flush = new byte[1024]; //缓冲区
            int len =-1;
            while((len=fis.read(flush))!=-1){
                baos.write(flush,0,len);
            }
            baos.flush();//刷新内存
            bytes = baos.toByteArray();
            System.out.println(bytes.length);
            return bytes;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
