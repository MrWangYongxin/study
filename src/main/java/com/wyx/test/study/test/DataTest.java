package com.wyx.test.study.test;

import com.sun.xml.internal.bind.v2.util.ByteArrayOutputStreamEx;

import java.io.*;

/**
 * 数据流：
 * 1、先写入后读取
 * 2、读取的顺序和读出一致
 */
public class DataTest {
    public static void main(String[] args) throws IOException {
        byte[] bytes;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        //操作数据类型
        dos.writeUTF("你好啊");
        dos.writeInt(555);
        dos.writeFloat(55.26f);
        bytes = baos.toByteArray();
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(bytes));
        System.out.println(dis.readUTF());
        System.out.println(dis.readInt());
    }
}
