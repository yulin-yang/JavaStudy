# JVM̽��

- ����̸̸���JVM����⣿java8�������֮ǰ�ı仯���£�
- ʲô��OOM��ʲô��ջ���StackOverFlowError����ô������
- JVM�ĳ��õ��Ų�������Щ��
- �ڴ�������ץȡ����ô����Dump�ļ���֪����
- ̸̸JVM�У�������������ʶ��

![���������ͼƬ����](jvm�ʼ�.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2ZhbmppYW5oYWk=,size_16,color_FFFFFF,t_70.png)

![���������ͼƬ����](jvm�ʼ�.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2ZhbmppYW5oYWk=,size_16,color_FFFFFF,t_70-1712901080491-1.png)



## 1��JVM��λ��

- java��������jvm���棬jre--jvm��ʾjre�Ͱ�����jvm��jvm �ڲ���ϵͳ֮�ϣ��������Ӳ��ϵͳ��

![���������ͼƬ����](jvm�ʼ�.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2ZhbmppYW5oYWk=,size_16,color_FFFFFF,t_70-1712901080491-2.png)

## 2��JVM����ϵ�ṹ

![image-20240412135251762](jvm�ʼ�.assets/image-20240412135251762.png)

![���������ͼƬ����](jvm�ʼ�.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2MTUzOTQ5,size_16,color_FFFFFF,t_70#pic_center.jpeg)

- [��ϵ�ṹ](https://www.processon.com/view/5ea567b163768974669293f3)

- [jvm�ڴ�ģ��](https://www.processon.com/view/5c31d6e2e4b0fa03ce8d3017)

- jvm����˵���ǡ����������͡��ѡ�������ջ���������ط���ջ�������������������������������һ�¡�

  > ջ�ڴ�������ǰ���"�Ƚ����"��ԭ����й���ģ�ÿ�����������ݶ����ڷ���ִ�н���ʱ�Զ�����ջ����ˣ�ջ�ڴ治��Ҫ����ڴ����������������ա���һ������ִ����ϣ�����ջ�е����ݾͻᱻ�Զ��ͷţ�����ռ���ڴ�ռ䡣������������Ļ��������
  >
  > ���ڴ���Ҫ���ڴ洢����ʵ���Լ�����ȶ�̬������ڴ����ݡ�Java�е��������ջ�����Ҫ��Զ��ڴ棬ͨ��������������Garbage Collector�����ڼ����ڴ��в��ٱ����õĶ��󣬲��ͷ���ռ�õ��ڴ�ռ䣬�Ա��������á�

- >
  > ��Java�У��ѣ�Heap����ջ��Stack�������ֲ�ͬ���ڴ��������ڴ洢��������ʱ�����ݡ�
  >
  > 1. �ѣ�Heap�������������洢����ʵ��������ȶ�̬������ڴ�������Java�У�����ͨ��`new`�ؼ��ִ����Ķ��󶼻ᱻ�洢�ڶ��С������̹߳�����ڴ����������̶߳����Է���ͬһ����ڴ档���ڴ�Ĵ�С�Ƕ�̬����ģ�������������������Garbage Collector������������ڻ��ղ���ʹ�õĶ������ͷ��ڴ�ռ䡣
  > 2. ջ��Stack����ջ�������洢�������õľֲ�������������������������ֵ�Լ��������õ�ִ�������ĵ����ݡ�ÿ���߳�������ʱ����ӵ���Լ���ջ�ռ䣬ջ���߳�˽�еġ�ջ�ڴ�������ǰ���"�Ƚ����"��ԭ����й���ģ�ÿ�����������ݶ����ڷ���ִ�н���ʱ�Զ�����ջ����ˣ�ջ�ڴ治��Ҫ����ڴ����������������ա�
  >
  > �ܵ���˵���Ѻ�ջ��Java�ڴ������������Ҫ�ĸ�������ڴ洢����ʵ���ȶ�̬������ڴ棬������������������ջ���ڴ洢�������õ����ݣ����߳�˽�еģ�����Ҫ�������ա�
  >
  > ������ `Car car1 = new Car()`��ʱ��`car1`�������ã�����ջ���棬�������Ķ���ʵ�����ڶ��
  >
  
- �������ͼʹ������ڴ�Ϊ�����ڴ��1/4, ��jvm��ʼ���ڴ�Ϊ1/64��**-Xms1024m -Xmx1024m -XX:+PrintGCDetails**��

## 3���������

- ���壺 ��ļ���ָ���ǽ����`.class`�ļ��еĶ��������ݶ��뵽�ڴ��У������������ʱ�������ķ������ڣ�Ȼ���ڶ�������һ�� `java.lang.Class`����������װ���ڷ������ڵ����ݽṹ������˵��**�����������Ҫ���þ��Ǽ��� Java ����ֽ��루 `.class` �ļ����� JVM �У����ڴ�������һ���������� `Class` ���󣩡�** 
- ���ã��������ļ���������ջ�У�����ʵ���ڶ���
- �������Դ������������
  - **`BootstrapClassLoader`(�����������)**�����ļ����࣬�� C++ʵ�֣�ͨ����ʾΪ null������û�и�������Ҫ�������� JDK �ڲ��ĺ�����⣨ `%JAVA_HOME%/lib`Ŀ¼�µ� `rt.jar`��`resources.jar`��`charsets.jar`�� jar �����ࣩ�Լ��� `-Xbootclasspath`����ָ����·���µ������ࡣ
  - **`ExtensionClassLoader`(��չ�������)**����Ҫ������� `%JRE_HOME%/lib/ext` Ŀ¼�µ� jar �������Լ��� `java.ext.dirs` ϵͳ������ָ����·���µ������ࡣ
  - **`AppClassLoader`(Ӧ�ó����������)**�����������û��ļ�������������ص�ǰӦ�� classpath �µ����� jar �����ࡣ

��������һ����������ӣ���������������һ��Car�ࡣ��������˵Car���ʱ��˵����һ������ĸ���������ϣ���õ������ʵ������Ҫȥ `new`һ������ʵ������ͺñ�`��`��һ������ĸ���������ᵽ`С��`��`С��`����Ǿ����ʵ����

> `.getClass()`������һ�����ڻ�ȡ����������ķ���������`Object`���ж���ķ�����������Java�����ж�����ʹ�á�
>
> ���磬�����һ������ `obj`������ͨ������ `obj.getClass()` ��������ȡ `obj` ���������`Class`����`Class`��������˹�����ĸ�����Ϣ����������ơ����ࡢʵ�ֵĽӿڡ�������η��ȡ�
>
> ��Ҫע����ǣ�����`.getClass()`�����Ƕ�����`Object`���еģ�������Ҫ��ȡһ�������������͵�����Ϣ����Ҫʹ�ö�Ӧ�İ�װ�࣬��`int`�İ�װ����`Integer`��`double`�İ�װ����`Double`�ȡ�
>
> ���⣬Java�л�����һ�ֻ�ȡ��ķ�ʽ����ͨ������ֱ�ӷ������`.class`���ԣ�����`String.class`�����ַ�ʽҲ���Ի�ȡ���`Class`���󣬵���Ҫ�ڱ���ʱ��֪����������`.getClass()`��������������ʱ��̬��ȡ�����������ࡣ

```java
public class Car {

    public int age;

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        //��Object���У�hashCode()������Ĭ��ʵ���Ƿ��ض�����ڴ��ַ�Ĺ�ϣ�롣
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
		/*
		�õ���ÿ������ʵ�����ǲ�ͬ��
		460141958
        1163157884
        1956725890
		*/
		//���ǿ���ͨ��.getClass()��������ȡ
        Class aClass1 = car1.getClass();
        Class aClass2 = car1.getClass();
        Class aClass3 = car1.getClass();
        System.out.println(aClass1.hashCode());
        System.out.println(aClass2.hashCode());
        System.out.println(aClass3.hashCode());
        /*
        ͨ��.getClass()�õ�����ͬһ����
        685325104
        685325104
        685325104
        */
    }
}
```

![���������ͼƬ����](jvm�ʼ�.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2MTUzOTQ5,size_16,color_FFFFFF,t_70#pic_center-1712902189942-34.png) 

## 4��˫��ί�ɻ��ƣ��ص㣩

- [Java����ػ��ƣ����������](https://baijiahao.baidu.com/s?id=1636309817155065432&wfr=spider&for=pc)

- [���Թ٣�java˫��ί�ɻ��Ƽ�����](https://www.jianshu.com/p/1e4011617650)

- ��ĳ�����������Ҫ����ĳ��`.class`�ļ�ʱ�������Ȱ��������ί�и������ϼ�����������ݹ��������������ϼ����������û�м��أ��Լ��Ż�ȥ��������ࡣ

- ����ػ��Ʋ��裺

  1. ��������յ�����ص�����
  2. �������������ί�и����������ȥ���,һֱ����ί�У�ֱ�������������
  3. ��������������Ƿ��ܹ����ص�ǰ�����,�ܼ��ؾͽ�����ʹ�õ�ǰ�ļ������������׳��쳣��֪ͨ�Ӽ��������м���
  4. �ظ����� 3

  ![���������ι�ϵͼ](jvm�ʼ�.assets/class-loader-parents-delegation-model.png)

```java
package com.xiaofan;

public class Car {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());

        Class<? extends Car> aClass = car1.getClass();

        System.out.println(aClass.getClassLoader());    // Ӧ�ó�������� AppClassLoader
        System.out.println(aClass.getClassLoader().getParent()); // ��չ������� ExtClassLoader       D:\jdk1.8\jre\lib\ext/*.jar
        System.out.println(aClass.getClassLoader().getParent().getParent());  // null   1. �����ڣ� 2. java�����ȡ����  D:\jdk1.8\jre\lib\rt.jar

    }
}
```

### ���Գ���

1. Ϊʲô��Ҫ˫��ί�ɻ��ƣ����ŵ㣩
   - ˫��ί�ɻ���ʹ������س��ֲ㼶��������������ع����࣬��������������ظ����أ����Է�ֹ���ظ����أ�
   - ʹ����ļ��س������ȼ�����ֹ�˺���API���۸ģ������˰�ȫ������Խ��������ͻ�Խ�ϲ���м��أ�����һ���Լ���д���࣬�ͻ���Ӧ�ó����������Application��ֱ�Ӽ��ء�

2. ��δ���˫��ί�ɣ�

   - �Զ��������������дloadClass����

   - ʹ���߳��������������
     

## 5��ɳ�䰲ȫ����

- Java��ȫģ�ͺ���
- ɳ�䣺���Ƴ��������ʱ����
- ��Domain����
- ��java�����޶���������ض������з�Χ�ڣ��ϸ����ƴ���Ա���ϵͳ��Դ�ķ��ʣ�������ʩ��֤�Դ������Ч���룬��ֹ�Ա���ϵͳ���ƻ�

### 5.1��ʲô��ɳ��:

ɳ����һ��`���Ƴ������еĻ���`��ɳ����ƾ��ǽ� Java �����޶��������(JVM)�ض������з�Χ�У������ϸ����ƴ���Ա���ϵͳ��Դ���ʣ�ͨ�������Ĵ�ʩ����֤�Դ������Ч���룬��ֹ�Ա���ϵͳ����ƻ���ɳ����Ҫ����ϵͳ��Դ����

- ��ϵͳ��Դ����ʲô������CPU���ڴ桢�ļ�ϵͳ�����硣
- ��ͬ�����ɳ�����Щ��Դ���ʵ�����Ҳ���Բ�һ����

���е�Java�������ж�����ָ��ɳ�䣬���Զ��ư�ȫ���ԡ�

### 5.2�����ɳ��Ļ������

1. **�ֽ���У������bytecode verifier��**:ȷ��Java���ļ���ѭJava���Թ淶���������԰���Java����ʵ���ڴ汣���������������е����ļ����ᾭ���ֽ���У�飬��������ࡣ

2. **��װ������class loader��**��������װ������3�������Javaɳ��������

   - ����ֹ�������ȥ��������Ĵ��룻

   - ���ػ��˱����ε����߽磻

   - ����������뱣����ȷ���˴�����Խ�����Щ������

�����Ϊ��ͬ�����������������ṩ��ͬ�������ռ䣬�����ռ���һϵ��Ψһ��������ɣ�ÿһ����װ�ص��ཫ��һ�����֣���������ռ�����Java�����Ϊÿһ����װ����ά���ģ����ǻ���֮���������ɼ���

��װ�������õĻ�����˫��ί��ģʽ��

�����ڲ�JVM�Դ����������ʼ���أ�������ͬ����ò������شӶ��޷�ʹ�ã�
�����ϸ�ͨ�����������˷��������������ͨ�����ô���Ҳ�޷����Ȩ�޷��ʵ��ڲ��࣬�ƻ��������Ȼ�޷���Ч��
��ȡ��������access controller������ȡ���������Կ��ƺ���API�Բ���ϵͳ�Ĵ�ȡȨ�ޣ���������ƵĲ����趨���������û�ָ����
��ȫ��������security manager�����Ǻ���API�Ͳ���ϵͳ֮�����Ҫ�ӿڡ�ʵ��Ȩ�޿��ƣ��ȴ�ȡ���������ȼ��ߡ�
��ȫ�������security package����java.security�µ������չ���µ��࣬�����û�Ϊ�Լ���Ӧ�������µİ�ȫ���ԣ�������
��ȫ�ṩ��
��ϢժҪ
����ǩ��
����
����

## 6��Native���ص㣩

**native �����Ǵ���native�ؼ��ֵģ�˵��java�����÷�Χ�ﲻ���ˣ���ȥ���õײ�c���ԵĿ�!**

### 6.1������

1.���뱾�ط���ջ

2.���ñ��ط������ؽӿ� JNI (Java Native Interface)

### 6.2������

���ڴ�������ר�ſ�����һ�������򣺱��ط���ջ(Native Method Stack)�������ǼǱ��Ϊnative�ķ���(����)����(����ִ��)ִ������ִ��(Execution Engine)��ʱ��ͨ�����ñ��ط������ؽӿ� JNI�����ر��ط�����(Native Libraies)�еķ���

### Native Method Stack ���ط���ջ

���ľ���������Native Method Stack�еǼ�native��������( Execution Engine )ִ������ִ�е�ʱ�����Native Libraies��[���ؿ�]

### Native Interface ���ؽӿ�

���ؽӿڵ��������ںϲ�ͬ�ı������ΪJava���ã����ĳ������ں�C/C++����, Java�ڵ�����ʱ����C/C++���е�ʱ����Ҫ���㣬�����е���C��C++�ĳ���**���Ǿ����ڴ�������ר�ſ�����һ�������򣺱��ط���ջ(Native Method Stack)�����ǼǱ��Ϊnative�ķ���(����)����ִ������ִ��(Execution Engine)��ʱ��ͨ�����ñ��ط������ؽӿ� JNI�����ر��ط�����(Native Libraies)�еķ�����**

> Ŀǰ�÷���ʹ�õ�Խ��Խ���ˣ���������Ӳ���йص�Ӧ�ã�����ͨ��Java����������ӡ������Javaϵͳ���������豸������ҵ��Ӧ�����Ѿ��Ƚ��ټ�����Ϊ���ڵ��칹�����ͨ�źܷ���������ʹ��Socketͨ��,Ҳ����ʹ��Web Service�ȵȣ�����������!

![���������ͼƬ����](jvm�ʼ�.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L20wXzQ2MTUzOTQ5,size_16,color_FFFFFF,t_70#pic_center.jpeg)

## 7��PC���������

**���������: Program Counter Register**

**ÿ���̶߳���һ����������������߳�˽�еģ�����һ��ָ��**, ָ�򷽷����еķ����ֽ���(�����洢ָ����һ��ָ��ĵ�ַ�� Ҳ����Ҫִ�е�ָ�����)����ִ�������ȡ��һ��ָ��, ��һ���ǳ�С���ڴ�ռ䣬�������Ժ��Բ���

- pc�Ĵ���
- ���������Program Counter Register
- ÿ���̶߳���һ��������������߳�˽�У�����һ��ָ�룬ָ�򷽷����еķ����ֽ��루�����洢ָ����һ��ָ��ĵ�ַ�� Ҳ������Ҫִ�е�ָ����룩
- �ǳ���С�Ŀռ� --���Ժ��Բ���

## 8��������

- **�������Ǳ������̹߳���**�������ֶκͷ����ֽ��룬�Լ�һЩ���ⷽ�����繹�캯�����ӿڴ���Ҳ�ڴ˶��壬��˵��**���ж���ķ�������Ϣ�������ڸ�����**�����������ڹ������䣻
- ==��̬����(static)������(final)������Ϣ�����췽�����ӿڶ��壩����ʱ�ĳ�����Ҳ���ڷ������У�����ʵ���������ڶ��ڴ��У��ͷ������޹�==

![img](jvm�ʼ�.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MjYwNTk1OA==,size_16,color_FFFFFF,t_70.png)

## 9��ջ

���� = ���ݽṹ+�㷨������
���� = ���+ҵ���߼����Է�

**ջ**���Ƚ����������ȳ�
**����**���Ƚ��ȳ�

Ϊʲômain()��ִ�У�������?����ѹ��java Stack,��󵯳�)

ջ��ջ�ڴ棩�����ܳ�������С��������ں��߳�ͬ��;
==�߳̽�����ջ�ڴ�Ҳ�����ͷţ�����ջ��˵�������������������⡣һ���߳̽�����ջ�ͽ���==

ջ��8���������+��������+ʵ������

> 1. `byte`��1 �ֽڣ���ΧΪ -128 �� 127��
> 2. `short`��2 �ֽڣ���ΧΪ -32768 �� 32767��
> 3. `int`��4 �ֽڣ���ΧΪ -2147483648 �� 2147483647��
> 4. `long`��8 �ֽڣ���ΧΪ -9223372036854775808 �� 9223372036854775807��
> 5. `float`��4 �ֽڣ���ΧΪ��Լ 1.4e-45 �� 3.4e+38������Լ 7 λ��Ч���֡�
> 6. `double`��8 �ֽڣ���ΧΪ��Լ 4.9e-324 �� 1.8e+308������Լ 15 λ��Ч���֡�
> 7. `char`��2 �ֽڣ���ʾ Unicode �ַ�����ΧΪ '\u0000'��0���� '\uffff'��65535����
> 8. `boolean`����ʾ true �� false��

������������ӣ�`main`������Ϊ���������ȱ�ѹ��ջ�У������`test`������`test`����`a`������`a`�ٵ���`test`���������ѭ��������ջ�����

```java
public class Demo {

    public void test(){
        a();
    }

    public void a(){
        test();
    }

    public static void main(String[] args) {
        new Demo().test();
    }
}
//ջ������StackOverflowError
```



![img](jvm�ʼ�.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MjYwNTk1OA==,size_16,color_FFFFFF,t_70-1713250573466-6.png)

![img](jvm�ʼ�.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MjYwNTk1OA==,size_16,color_FFFFFF,t_70-1713250568270-3.png)

1. ջ����Ķ�����������ô��ģ�
2. ��������ʵ�����Ĺ���

## 10������JVM

- SUN ��˾ - HotSpot ��ʹ������Ҫ�о��ģ�
- BEA ��˾ JRocket
- IBM ��˾ J9

## 11����

һ��JVMֻ��һ�����ڴ棬�������������������͵���ʵ����

![���������ͼƬ����](jvm�ʼ�.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2ZhbmppYW5oYWk=,size_16,color_FFFFFF,t_70-1712901080492-3.png)

### 11.1���ѵ���������

#### ������

һ���൮���ͳɳ��ĵط������������ĵط�

������

- ����԰�������еĶ�����������԰��new������!

- �Ҵ�����(0����1�������߽�from����to�������������Խ���)

����԰**����**�ʹ���**��GC**��������GC��������ľ͵����Ҵ�������0��1�໥���棩age++�����Ҵ�����age>=15ʱ������������������������˴���**��GC**����������󻹷Ų��£���OOM��

 **���������о���99%�Ķ�������ʱ����!|**

>  **������ GC (Minor GC)**

���������������������ն�����Ƶ�����ٶȿ졣��ʱ��������Ķ����޷��� Eden ��������Eden ���޷�����) �ͻᴥ��һ��Young GC����ʱ�Ὣ S0 ����Eden ���Ķ���һ����пɴ��Է������ҳ���Ծ�Ķ��󣬽������Ƶ� S1 �����ҽ�S0����� Eden ���Ķ������գ�������Щ���ɴ�Ķ��������������ҽ�S0 �� �� S1��������

ÿ����һ��MinorGC����age++����age>=15ʱ�ͻ������������

>  **Ϊɶ�������� Survivor ����**

��Ϊ��������һ��ֻ��һ�� Survibor �� ��ô���޷�ʵ�ֶ��� S0 ���������ռ����Լ��ִ������������

#### ������

> **����� GC (Major GC)**

�������������GC �������Ϸ�����һ��Major GC �ͻᷢ��һ�� Minor GC������Major GC ���ٶ�������� Minor GC �� 10 ����

> ʲôʱ��ᴥ������GC��

����һ����������ǻ�������Eden ���Դ���������������ˣ��ͻᴥ��Minor GC��������������Eden����ţ�������Ȼ�Ų��£�����ֱ�ӽ���������������Ҳ�Ų��£����� Major GC ����������Ŀռ�

1. �ŵ��� �ɹ�

2. �Ų��� OOM

>  **FULL GC**

����������˵�ģ���������汾��JDK��Ĭ�ϰ����˶����������������Ļ��գ�������ʱ��Ҳ���԰�����FullGC����һ����

>  **ʲôʱ������FULL GC��**

1. System.gc()�����ĵ���
2. ������ռ䲻��
3. �������ռ䲻��
4. ���з���ܴ�Ķ���

#### ���ô�

**�������Ǹ�����ô���ʵ�֡������Ԫ�ռ䣬����ࣻ����ʱ�����أ����ڶ���**

�����򲻴����������գ�����Ҳ����� �����˴���������jar�� -- ��������һ����פ�ڴ��������ڴ��JDK����Я����Class Interface��Ԫ���ݡ��ر�������ͻ��ͷ�����ڴ�

- jdk1.6֮ǰ�����ô�������������`������`
- jdk1.7    ���ô��������˻������ȥ���ô�����������`��`�� 
- jdk1.8     �����ô�����������`Ԫ�ռ�`

![���������ͼƬ����](jvm�ʼ�.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2ZhbmppYW5oYWk=,size_16,color_FFFFFF,t_70-1712901080492-4.png)

![���������ͼƬ����](jvm�ʼ�.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2ZhbmppYW5oYWk=,size_16,color_FFFFFF,t_70-1712901080492-5.png)



- gc����������Ҫ���������������԰������������

  ```java
  public class Code {
      public static void main(String[] args) {
          long max = Runtime.getRuntime().maxMemory();
  
          long init = Runtime.getRuntime().totalMemory();
  
          System.out.println("max=" + max + "�ֽ�\t" + (max/(double)1024/1024) + "MB");
          System.out.println("init=" + init + "�ֽ�\t" + (init/(double)1024/1024) + "MB");
  
          // Ĭ������£���������ڴ棨max��Ϊ�����ڴ��1/4,��ʼ���ڴ�(init)Ϊ�����ڴ��1/64
      }
  }
  ```

  ```shell
  max:981.5M
  init:981.5M
  Heap
   PSYoungGen      total 305664K, used 15729K [0x00000000eab00000, 0x0000000100000000, 0x0000000100000000)
    eden space 262144K, 6% used [0x00000000eab00000,0x00000000eba5c420,0x00000000fab00000)
    from space 43520K, 0% used [0x00000000fd580000,0x00000000fd580000,0x0000000100000000)
    to   space 43520K, 0% used [0x00000000fab00000,0x00000000fab00000,0x00000000fd580000)
   ParOldGen       total 699392K, used 0K [0x00000000c0000000, 0x00000000eab00000, 0x00000000eab00000)
    object space 699392K, 0% used [0x00000000c0000000,0x00000000c0000000,0x00000000eab00000)
   Metaspace       used 2998K, capacity 4496K, committed 4864K, reserved 1056768K
    class space    used 322K, capacity 388K, committed 512K, reserved 1048576K
  
  ```

- **�׳�OOM demo��ʾ**

![���������ͼƬ����](jvm�ʼ�.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2ZhbmppYW5oYWk=,size_16,color_FFFFFF,t_70-1712901080492-6.png)

![���������ͼƬ����](jvm�ʼ�.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2ZhbmppYW5oYWk=,size_16,color_FFFFFF,t_70-1712901080492-7.png)

�������ص�ַ��http://www.downcc.com/soft/290199.html

![���������ͼƬ����](jvm�ʼ�.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2ZhbmppYW5oYWk=,size_16,color_FFFFFF,t_70-1712901080492-8.png)

```java
package com.xiaofan;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String a = "kuangshensayjava";
        while(true) {
            a += a + new Random().nextInt(999999999) + new Random().nextInt(999999999);
        }
    }
}

```

```java
D:\jdk1.8\bin\java.exe -Xms8m -Xmx8m -XX:+PrintGCDetails -javaagent:E:\idea_ultimate\IntelliJ_IDEA_2020_2\lib\idea_rt.jar=50684:E:\idea_ultimate\IntelliJ_IDEA_2020_2\bin -Dfile.encoding=UTF-8 -classpath D:\jdk1.8\jre\lib\charsets.jar;D:\jdk1.8\jre\lib\deploy.jar;D:\jdk1.8\jre\lib\ext\access-bridge-64.jar;D:\jdk1.8\jre\lib\ext\cldrdata.jar;D:\jdk1.8\jre\lib\ext\dnsns.jar;D:\jdk1.8\jre\lib\ext\jaccess.jar;D:\jdk1.8\jre\lib\ext\jfxrt.jar;D:\jdk1.8\jre\lib\ext\localedata.jar;D:\jdk1.8\jre\lib\ext\nashorn.jar;D:\jdk1.8\jre\lib\ext\sunec.jar;D:\jdk1.8\jre\lib\ext\sunjce_provider.jar;D:\jdk1.8\jre\lib\ext\sunmscapi.jar;D:\jdk1.8\jre\lib\ext\sunpkcs11.jar;D:\jdk1.8\jre\lib\ext\zipfs.jar;D:\jdk1.8\jre\lib\javaws.jar;D:\jdk1.8\jre\lib\jce.jar;D:\jdk1.8\jre\lib\jfr.jar;D:\jdk1.8\jre\lib\jfxswt.jar;D:\jdk1.8\jre\lib\jsse.jar;D:\jdk1.8\jre\lib\management-agent.jar;D:\jdk1.8\jre\lib\plugin.jar;D:\jdk1.8\jre\lib\resources.jar;D:\jdk1.8\jre\lib\rt.jar;E:\idea_ultimate\Project\Hello\out\production\Hello com.xiaofan.Main
[GC (Allocation Failure) [PSYoungGen: 1520K->504K(2048K)] 1520K->632K(7680K), 0.0008567 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
[GC (Allocation Failure) [PSYoungGen: 1973K->488K(2048K)] 2101K->1314K(7680K), 0.0006303 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
[GC (Allocation Failure) [PSYoungGen: 1578K->488K(2048K)] 2404K->1619K(7680K), 0.0004381 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
[GC (Allocation Failure) [PSYoungGen: 1576K->224K(2048K)] 3766K->2944K(7680K), 0.0006442 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
[GC (Allocation Failure) [PSYoungGen: 782K->224K(2048K)] 4562K->4004K(7680K), 0.0004239 secs] [Times: user=0.03 sys=0.02, real=0.00 secs] 
[GC (Allocation Failure) [PSYoungGen: 224K->224K(2048K)] 4004K->4004K(7680K), 0.0004558 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
[Full GC (Allocation Failure) [PSYoungGen: 224K->0K(2048K)] [ParOldGen: 3780K->2165K(5632K)] 4004K->2165K(7680K), [Metaspace: 2947K->2947K(1056768K)], 0.0064615 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
[Full GC (Ergonomics) [PSYoungGen: 1134K->0K(2048K)] [ParOldGen: 5345K->2697K(5632K)] 6480K->2697K(7680K), [Metaspace: 2963K->2963K(1056768K)], 0.0057346 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
[GC (Allocation Failure) [PSYoungGen: 39K->160K(2048K)] 4856K->4976K(7680K), 0.0003290 secs] [Times: user=0.02 sys=0.00, real=0.00 secs] 
[GC (Allocation Failure) [PSYoungGen: 160K->160K(2048K)] 4976K->4976K(7680K), 0.0002194 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
[Full GC (Allocation Failure) [PSYoungGen: 160K->0K(2048K)] [ParOldGen: 4816K->3760K(5632K)] 4976K->3760K(7680K), [Metaspace: 2966K->2966K(1056768K)], 0.0020017 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
[GC (Allocation Failure) [PSYoungGen: 0K->0K(2048K)] 3760K->3760K(7680K), 0.0002045 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
[Full GC (Allocation Failure) [PSYoungGen: 0K->0K(2048K)] [ParOldGen: 3760K->3741K(5632K)] 3760K->3741K(7680K), [Metaspace: 2966K->2966K(1056768K)], 0.0064159 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
Heap
 PSYoungGen      total 2048K, used 131K [0x00000000ffd80000, 0x0000000100000000, 0x0000000100000000)
  eden space 1536K, 8% used [0x00000000ffd80000,0x00000000ffda0c38,0x00000000fff00000)
  from space 512K, 0% used [0x00000000fff00000,0x00000000fff00000,0x00000000fff80000)
  to   space 512K, 0% used [0x00000000fff80000,0x00000000fff80000,0x0000000100000000)
 ParOldGen       total 5632K, used 3741K [0x00000000ff800000, 0x00000000ffd80000, 0x00000000ffd80000)
  object space 5632K, 66% used [0x00000000ff800000,0x00000000ffba7700,0x00000000ffd80000)
 Metaspace       used 3075K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 332K, capacity 388K, committed 512K, reserved 1048576K
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at java.util.Arrays.copyOf(Arrays.java:3332)
	at java.lang.AbstractStringBuilder.ensureCapacityInternal(AbstractStringBuilder.java:124)
	at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:674)
	at java.lang.StringBuilder.append(StringBuilder.java:208)
	at com.xiaofan.Main.main(Main.java:10)
```

����JProfiler���߷���OOM��ԭ��

> **������jvm����**

- `-Xms ���ó�ʼ���ڴ��С`
- `-Xmx �����������ڴ�`
- `-XX:+HeapDumpOnOutOfMemoryError `
- ``-XX:+PrintGCDetails`

```java
package com.xiaofan;

import java.util.ArrayList;

public class Main {

    byte [] arr = new byte[1024*1024]; //1m

    public static void main(String[] args) {
        ArrayList<Main> list = new ArrayList<>();
        int count = 0;
        try {
            while(true) {
                list.add(new Main());
                count += 1;
            }
        } catch (Exception e) {
            System.out.println("count: " + count);
            e.printStackTrace();
        }

    }
}
```

## 12�����ڴ����

- ��OOMʱ���״ΰ�����������ڴ�ռ�鿴����������ڴ棬�鿴һ���ĸ��ط��������⣨JProfiler��
- JProfiler���ã�����`DumpN`�ڴ��ļ������ٶ�λ�ڴ�й©����ö��е����ݣ���ȡ��Ķ���
- ������������ò���
  - -Xms ����Java��������ʱ�ĳ�ʼ�Ѵ�С-- ��ʼ���ڴ��С
  - -Xmx ����java�����ܻ�õ����Ѵ�С-- ����ڴ��С
  - -XX:+HeapDumpOnOutOfMemoryError ʹ�øĲ����������ڴ����ʱ�����������Ϣ
  - -XX:+HeapDumpPath�� �������õ����ѵĴ��·��
  - -XX:+PrintGCDetails ��ӡGC����������Ϣ
  - ���� ----- -Xms1m -Xmx1m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=d:/Test3.dump

## 13��GC�㷨

- �������ջ�����Java����Ҫ���ƣ�ֻ���Զ����ֶ�ֻ������
- GCֻ������==�Ѻͷ�����==��jvm�ڽ���GCʱ�������Ƕ���������ͳһ���գ��󲿷�ʱ����ն�������������
- GCһ���Ϊ���֣�
  - ��GC ----- ��ͨGC --- ֻ�����������ż���������Ҵ���
  - ��GC ----- ȫ��GC --- �����ж�������һ�飬�ͷ��ڴ�

Ŀǰ���õ�GC�㷨��Ϊ���¼��ࣺ

### **13.1�����ü����㷨(������)**

**��JVM�м�������**��ÿ�������ڴ�����ʱ�򣬾͸���������һ���������������ģ���ÿ����һ������ָ��ö���ʱ����������һ��ÿ����һ��ָ���������ñ�ɾ��ʱ����������һ����������û������ָ��ö���ʱ���ö���������������Ϊ0����ʱ��Ӧ�ö������������������ղ�����

![�����ͼƬ����](jvm�ʼ�.assets/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5pif57695oGS,size_20,color_FFFFFF,t_70,g_se,x_16.png)

**�ŵ㣺**

- ��
- ������۷�ɢ
- ������ʱ�䡱�̣�����ʱ��ָ�������������յ����ʱ�䣬��������״̬��

**ȱ�㣺**

- ��ȫ�棨����©��ѭ�����õĶ���
- ����֧�ֽ���
- ռ�ö����ڴ�ռ䣨���������ģ�

 

### 13.2��**�����㷨**

[GC�㷨-�����㷨](https://www.cnblogs.com/hujingnb/p/12642079.html)

�������ڴ滮��Ϊ���飬ÿ��ֻʹ�����е�һ�飬�������ڴ������ˣ����������Ķ����Ƶ�����һ�����棬Ȼ��Ͱ�ԭ�������ڴ�ռ�һ�����������

����ʹ��ÿ���ڴ���ն��Ƕ����������Ļ��գ��ڴ����ʱҲ�Ͳ��ÿ����ڴ���Ƭ�ȸ��������ֻҪ�ƶ��Ѷ�ָ�룬��˳������ڴ���У�ʵ�ּ򵥣����и�Ч��

![�����ͼƬ����](jvm�ʼ�.assets/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5pif57695oGS,size_20,color_FFFFFF,t_70,g_se,x_16-1713269399758-11.png) 

һ��ʼEden������ɫ�Ĳ��ֱ�ʾ�������Ҵ�����from��Ҳ�в��ֶ�������ɫ�����ھ���һ��GC�󣬽�Eden����from���Ķ���ȫ��ת�Ƶ�to������ʱԭ����from��Ϊ�գ�ԭ����to�����˶�������ԭ����from��������ڵ�to����ԭ����to��������ڵ�from�����ȵ��Ҵ�������֮����Ǵﵽ��ָ���ĵ����������򽫴�����ת�Ƶ������������Ƕ�����

![image-20240416201349079](jvm�ʼ�.assets/image-20240416201349079.png)



**�ŵ㣺** �ռ�������û���ڴ���Ƭ������Ч�ʸߡ�

**ȱ�㣺** ÿ�����У�����һ���ڴ��ǿյģ�to����Զ�ǿյģ������¿�ʹ�õ��ڴ�ռ�ֻ��ԭ����һ�롣�����ռ��㷨�ڶ������ʸߵ�ʱ��Ч�������½�������������еĶ��󶼴��������������Ҫ�����еĶ����from��ת�Ƶ�to�����������ܴ� **���Ը����㷨��Ҫ�����������Ҵ������е�from����to������Ϊ�������������ʵ͡�**

### 13.3��**�������㷨**

Ϊÿ������洢һ�����λ����¼�����״̬�����Ż�������������Ϊ�����׶Σ�

1. ��ǽ׶Σ�����׶��ڣ�Ϊÿ��������±��λ���������Ƿ�������
2. ����׶Σ��ý׶ζ������Ķ�����������ִ�� GC ������

![�����ͼƬ����](jvm�ʼ�.assets/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5pif57695oGS,size_20,color_FFFFFF,t_70,g_se,x_16-1713270959728-14.png)

**�ŵ㣺**

- ʵ�ּ򵥣���ǡ�����㷨��ÿ�����ŵĶ��������ֻ��Ҫ�ҵ�һ�����ɣ��ҵ�һ���Ϳ����ж���Ϊ��ġ�
- ��������ü�������ȫ�棬��ָ�������Ҳû��̫��Ļ���������Ҫ���ǣ�����㷨�����ƶ������λ�á�

**ȱ�㣺**

- ��Ҫ��������ɨ�趯������ǻ��ŵĶ������������Ķ�������Ч�ʵ͡�
- �����Ķ���GC���ڴ治�����������ڴ���Ƭ��GC�Ĵ���Խ����ƬԽ����(�������ڴ��ж�λ��Ϊ�鷳)

### 13.4��**���ѹ���㷨** 

�Ա������㷨�����Ż�����Ȼ����û�취���ɨ�����⣬�����Խ���ڴ���Ƭ���⡣�����ٽ���һ��ɨ�裬�����Ķ�������ͬһ�ˣ�ʣ�µľ��������Ŀհס���ȱ�����ֶ���һ��ɨ�衣

![image-20240416204026613](jvm�ʼ�.assets/image-20240416204026613.png) 

### 13.5��������ѹ���㷨

 �ȱ����������ٽ���ѹ��������Ƭ����֮����ѹ����

### **�ܽ�**

1. **�ڴ�Ч�ʣ�ʱ�临�Ӷȣ���**�����㷨 > ������ >���ѹ��
2. **�ڴ�����ȣ�**�����㷨=���ѹ��>������
3. **�ڴ������ʣ�** ���ѹ��=������ > �����㷨
4. **�ִ��ռ��㷨��JVM���ţ�**�� **û����õ��㷨��ֻ������ʵ�**
  - ����� ----- ����ʵͣ������㷨
  - ����� ----- ����ʸߣ� ����������ѹ�����ʵ��





### **�����ⳣ��**

- jvm���ڴ�ģ�ͺͷ�������ϸ��ÿ������ʲô��
- ������ķ�������Щ��Eden��from��to����������˵˵���ǵ��ص㡣
- GC�㷨����Щ�� �������������ѹ���������㷨�����ü���������ô�ã�
- ��GC����GC�ֱ���ʲôʱ����



1. JMM

![���������ͼƬ����](jvm�ʼ�.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2ZhbmppYW5oYWk=,size_16,color_FFFFFF,t_70#pic_center-1712901080493-9.png)

- Java Memory Model: Java�ڴ�ģ�� -- ������ ����
- �������̹߳����ڴ�����ڴ�֮��ĳ����ϵ
  - �߳�֮��Ĺ�������洢�����ڴ��� ----MAIN MEMORY
  - ÿ���̶߳���һ��˽�еı����ڴ� ---- LOCAL MEMORY
- �벢�����



16. OOM�������ԭ��

- java.lang.OutOfMemoryError
- �ڴ�й©��memory leak�� ��ָ������һ��̬����Ķ��ڴ�����ĳ��ԭ�����δ�ͷţ����ϵͳ�ڴ���˷ѣ����³������м�������ϵͳ���������غ��
- �ڴ������out of memory����ָ���������ڴ�ʱ�� û���㹻���ڴ湩������ʹ�ã�˵�׾����ڴ治���ã���ʱ�ͻᱨ��OOM,����ν���ڴ����
- OOM�����ԭ��
  - java����� ---- ��Ȼ���Ǵ��ʵ������ģ��Ǿ����޴���ʵ������
  - �����ջ��� ----- �����ջ��������java����ִ�е��ڴ�ģ�ͣ� ÿ��������ִ�е�ʱ�򶼻ᴴ��һ��ջ֡���ڴ洢�ֲ�������������ջ����̬���ӡ��������ڵ���Ϣ�����ط���ջ������ջ�������ǣ������ջΪ���������java�������񣬶����ط���ջΪ������ṩnative���������ڵ��̵߳Ĳ����У�����������ջ̫֡�󣬻�������ջ�ռ�̫С����ռ�ռ��޷�����ʱ��������׳��Ķ���StackOverflowError��������õ�OutOfMemoryError�쳣���ڶ��߳�����£�����׳�OutOfMemoryError�쳣
  - ���ط���ջ�����
  - ������������ʱ��������� - java�Ѻͷ������� java������Ҫ��Ŷ���ʵ��������ȣ���������������Ϣ����̬�����ȵȣ�����ʱ����Ҳ�Ƿ�������һ���֣� �������������̹߳��������ֻ���׳�OutOfMemeryError��
  - �����ڴ�ֱ����� -- NIO�йأ�New input/Output��,������һ�ֻ���ͨ���뻺������I/O��ʽ������native������ֱ�ӷ�������ڴ棬 Ȼ��ͨ��һ���洢��java���еĶ�����Ϊ����ڴ��Ӧ�ý��в�������������һЩ����������������ܣ���Ϊ��������Java�Ѻ�Native�������ظ�������

	1. �ٶ�
