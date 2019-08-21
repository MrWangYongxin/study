package com.wyx.test.study.test;

import java.io.*;

/**
 * 打印流 PrintStream
 */
public class PrintTest {
    public static void main(String[] args){
    //打印到文件中
    PrintWriter ps = null;
    try {
        ps = new PrintWriter(new BufferedOutputStream(new FileOutputStream("log.txt")));
        ps.print("我是PrintWriter跟PrintStream用法一样的");
        ps.flush();
    } catch (FileNotFoundException ex) {
        ex.printStackTrace();
     }
    }
}
