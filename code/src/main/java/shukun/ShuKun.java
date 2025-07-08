package shukun;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

class Person {
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
public class ShuKun {

    public static void main(String[] args) {

        Person p1 = new Person(1, "yyl");
        Person p2= new Person(1, "yyl");

        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);

    }
}
