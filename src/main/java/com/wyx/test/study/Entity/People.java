package com.wyx.test.study.Entity;

public  class People {
    private String  username = "李四";
    private Integer age = 99;

   public void setVlues(String username,Integer age){
       this.username=username;
       if(Thread.currentThread().getName().equals("A")){
           System.out.println("A线程停止");
           Thread.currentThread().suspend();
       }
       this.age=age;
   }

    public  void print() {
        System.out.println("People{" +
                "username='" + username + '\'' +
                ", age='" + age + '\'' +
                '}');
    }
}
