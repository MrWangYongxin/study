package com.wyx.test.study.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RandTest01 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile(new File(""),"r");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
