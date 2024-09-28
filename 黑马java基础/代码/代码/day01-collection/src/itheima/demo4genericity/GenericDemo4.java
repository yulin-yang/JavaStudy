package itheima.demo4genericity;

import itheima.demo3genericity.Student;

public class GenericDemo4 {
    public static void main(String[] args) {
        // 目标：学会定义泛型方法，搞清楚作用。
        // 需求：打印任意数组的内容。
        String[] names = {"赵敏", "张无忌", "周芷若", "小昭"};
        Student[] stus = new Student[3];

        normalPrintArray(names);
        //报错
        //normalPrintArray(stus);

        printArray(names);
        printArray(stus);

        Student max = getMax(stus);
        String max2 = getMax(names);
    }

    public static void normalPrintArray(String[] names) {
        System.out.println("无泛型打印");

    }

    public static <T> void printArray(T[] names){
        System.out.println("泛型打印");
    }

    public static <T> T getMax(T[] names){
        return null;
    }
}
