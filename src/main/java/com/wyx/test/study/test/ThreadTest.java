package com.wyx.test.study.test;

import com.wyx.test.study.Entity.People;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
       final People people = new People();
       Thread thread = new Thread(){
           @Override
           public void run() {
               super.run();
               people.setVlues("张三",88);
           }
       };
       thread.setName("A");
       thread.start();
       Thread.sleep(2000);
       Thread thread2 = new Thread(){
           @Override
           public void run() {
               super.run();
               people.print();
           }
       };
       thread2.start();
    }
}
