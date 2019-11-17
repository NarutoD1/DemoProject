package com.atguigu;

import java.util.ArrayList;
import java.util.Iterator;

public class TestDemo {

    //模板6：prsf
    private static final int SINGLETON=1;
    //psf
    public static final String NAME="AAA";
    //psfi
    public static final int NUM=2;
    //psfs
    public static final String ADDRESS="beijing";


    //模板1：psvm
    public static void main(String[] args) {

        //模板2：sout
        System.out.println("hello");
        //soutp/soutm/soutv/xxx.sout

        System.out.println("args = [" + args + "]");

        System.out.println("TestDemo.main");

        System.out.println("args = " + args);

        //模板3：fori
        for (int i = 0; i <5 ; i++) {

            System.out.println(i);

        }

        String[]arr = new String[]{"AA","bb"};

        //iter增强for循环
        for (String s : arr) {

            System.out.println(s);

        }
        
        //itar普通for循环
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        ArrayList list = new ArrayList();
        list.add(111);
        list.add(222);
        list.add(333);
        
        
        //itco 迭代器遍历
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            Object next =  iterator.next();
            
        }

        //模板4：集合循环遍历
        // list.for
        for (Object o : list) {


        }

        //list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }

        //list.forr逆序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

    }


    public void test(){

        //模板5：ifn 判断是否为空
        ArrayList list = new ArrayList();
        list.add(111);
        list.add(222);
        list.add(333);

        if (list == null) {



        }

    }

}
