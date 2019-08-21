package com.wyx.test.study.test;

import java.io.UnsupportedEncodingException;

/**
 * 编码：字符串--->字节数组
 * 解码：字节数组--->字符串
 */
public class ContentEncode {
    public static void main(String[] args) {
        String msg ="性命生命使命";
        //编码：字符数组
        byte[] bytes = msg.getBytes();//默认使用工程的字符集
        System.out.println(bytes.length);
        try {
            String str = new String(bytes,"utf-8");
            System.out.println(str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //编码其他字符集
        try {
            bytes = msg.getBytes("UTF-16LE");
            System.out.println(bytes.length);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
