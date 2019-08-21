package com.wyx.test.study.Utils;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.sun.xml.internal.bind.v2.util.ByteArrayOutputStreamEx;

import java.io.*;
import java.util.Arrays;


public class FileUtils {
    static int  wjs = 0;//文件数
    static int mls = -1;//目录数
    public static long getFileSize(File file) {
        int size =0;
        if(file!=null || file.exists()){
            if(file.isFile()){
                size+= file.length();
                wjs +=1;
            }else{
                mls +=1;
                File[] files = file.listFiles();
                for (File file1 : files) {
                     size+=getFileSize(file1);
                }
            }
        }
        return size;

    }


    public static  void fileCopy(String src,String dest){
        File srcFile = new File(src);
        File destFile = new File(dest);
        int len=0;
        if(srcFile.exists()){
            if(srcFile.isFile()){
                try {
                    FileReader reader = new FileReader(srcFile);
                    FileWriter writer = new FileWriter(destFile);
                    char[] ch = new char[1024];
                    while((len=reader.read(ch))!=-1){
                        String str = new String(ch,0,len);
                        System.out.println(str);
                        writer.write(str);
                        writer.flush();
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args){
       File file = new File("D:\\毕业论文.pdf");
       File out = new File("D:\\2.pdf");
        InputStream inputStream = null;
        OutputStream outputStream = null;
        if(file.exists()){
           try {
               inputStream = new FileInputStream(file);
               outputStream = new FileOutputStream(out);
               byte[] flush = new byte[1024];
               ByteArrayOutputStream bao = new ByteArrayOutputStreamEx();
               int len = 0;
               while ((len = inputStream.read(flush)) != -1) {
                   bao.write(flush, 0, len);
               }
               byte[] bytes = bao.toByteArray();
               ByteArrayInputStream bai = new ByteArrayInputStream(bytes);
               while ((len = bai.read(flush)) != -1) {
                   outputStream.write(flush, 0, len);
               }
           }catch (IOException e){
               e.printStackTrace();
           }finally {
               try {
                   inputStream.close();
                   outputStream.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }
    }
}
