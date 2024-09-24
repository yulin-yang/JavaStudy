package com.yang;

import java.lang.reflect.Field;

public class Test {


    private int id;
    private String name;

    Test(){

    }

    Test(int id, String name){
        this.id = id;
        this.name = name;
    }

    void testThis() throws NoSuchFieldException {
        Field name = this.getClass().getDeclaredField("name");
    }

    public static void main(String[] args) throws NoSuchFieldException {

        Test test = new Test(1,"yyl");
        test.testThis();

    }
}
