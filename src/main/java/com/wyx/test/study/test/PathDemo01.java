package com.wyx.test.study.test;

import java.io.File;
import java.io.IOException;

public class PathDemo01 {
        public static void main(String[] args) {
          File file = new File("D:\\","ceshi");
            try {
                boolean iscg = file.createNewFile();
                if(iscg){
                    System.out.println("创建成功！");
                }else{
                    System.out.println("创建失败！");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
