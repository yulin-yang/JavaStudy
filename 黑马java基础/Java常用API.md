#### Java常用API方法总结 

 *  [常用API][API]
 *   *  [JavaAPI][]
     *   *  [1 java.lang][]
         *   *  [String][]
             *  [StringBuilder][]
             *  [Integer][]
             *  [parseXxx][]
             *  [Math][]
             *  [Object][]
             *  [System][]
             *  [Throwable][]
             *  [Thread][]
             *  [Runnable/接口][Runnable]
             *  [Class\\][Class]
             *  [\*reflect反射相关][reflect]
             *  [Field][]
             *  [Constructor\\][Constructor]
             *  [Method][]
             *  [ClassLoader][]
         *  [2 java.util][]
         *   *  [Scanner][]
             *  [Obects][]
             *  [Date(瞬时)][Date]
             *  [Calendar(日历)][Calendar]
             *  [Random][]
             *  [\*数据结构相关][Link 1]
             *  [Collection/接口][Collection]
             *  [Iterator/接口][Iterator]
             *  [List/接口][List]
             *  [Arrays][]
             *  [ArrayList][]
             *  [LinkedList][]
             *  [Set/接口][Set]
             *  [HashSet][]
             *  [LinkedHashSet][]
             *  [Collections][]
             *  [Comparator/接口][Comparator]
             *  [Comparable\\/接口][Comparable]
             *  [Map\\/接口][Map]
             *  [Map.Entry][]
             *  [HashMap][]
             *  [LinkedHashMap][]
             *  [TreeMap][]
             *  [Stack栈][Stack]
             *  [Queue队列/接口][Queue]
             *  [PriorityQueue优先级队列][PriorityQueue]
             *  [Deque 双端队列（接口）][Deque]
             *  [Lock/接口][Lock]
             *  [Executors][]
             *  [ExecutorService/接口][ExecutorService]
             *  [Properties][]
             *  [Supplier/接口][Supplier]
             *  [Consumer/接口][Consumer]
             *  [Predicate/接口][Predicate]
             *  [Function/接口][Function]
             *  [Stream\\/接口][Stream]
         *  [3 java.text][]
         *   *  [DateFormat][]
         *  [4 java.io][]
         *   *  [File][]
             *  [Filter/接口][Filter]
             *  [OutputStream][]
             *  [FileOutputStream][]
             *  [InputStream][]
             *  [FileInputStream][]
             *  [Reader][]
             *  [FileReader][]
             *  [Writer][]
             *  [FileWriter][]
             *  [BufferedOutputStream][]
             *  [BufferedInputStream][]
             *  [BufferedWriter][]
             *  [BufferedReader][]
             *  [OutputStreamWriter][]
             *  [InputStreamReader][]
             *  [ObjectOutputStream][]
             *  [ObjectInputStream][]
             *  [PrintStream][]
         *  [5 java.net][]
         *   *  [Socket][]
             *  [ServerSocket][]
         *  [6 java.sql][]
         *   *  [DriverManager][]
             *  [Connection/接口][Connection]
             *  [Statement/接口][Statement]
             *  [ResultSet/接口][ResultSet]
             *  [PreparedStatement/接口][PreparedStatement]
         *  [7 javax.sql][]
         *   *  [DataSource/接口][DataSource]
     *  [其他API][API 1]
     *   *  [\*1 com.mchange.v2.c3p0][1 com.mchange.v2.c3p0]
         *   *  [ComboPooledDataSource][]
         *  [\*2 com.alibaba.druid.pool][2 com.alibaba.druid.pool]
         *   *  [DruidDataSourceFactory][]
         *  [\*3 org.springframework.jdbc.core][3 org.springframework.jdbc.core]
         *   *  [JdbcTemplate][]
 *  [最后][Link 2]

## 常用API 

参考资料：

[WIKI教程][WIKI]

[码工具（推荐）][Link 3]

### JavaAPI 

#### 1 java.lang 

##### String 

构造方法:

 *  `String()`：初始化新创建的String对象，以使其表示空字符序列。
 *  `String(char[] value)`：通过当前参数中的字符数组来构造新的String。
 *  `String(byte[] bytes)`：通过使用平台的默认字符集解码当前参数中的字节数组来构造新的String。
   
    > 双引号直接写的字符串在常量池当中，new的不在池当中。地址值不同。
 *  `String(byte[] bytes, int offset, int length)`：通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String。//把字节数组的一部分转换为字符串。
 *  `String(char[] value, int offset, int count)`：分配一个新的 String，它包含取自字符数组参数一个子数组的字符。//把字符数组的一部分转换为字符串。
   
    > 把字节/字符数组的一部分转换为字符串 offset:数组的开始索引 length:转换的字节个数 count:转换的字符个数

判断功能的方法:

 *  `boolean equals(Objectan Object)`：将此字符串与指定对象进行比较。
 *  `boolean equalsIgnoreCase(String anotherString)`：将此字符串与指定对象进行比较，忽略大小写。
   
    > Object是”对象”的意思，也是一种引用类型。作为参数类型，表示任意对象都可以传递到方法中。

获取功能的方法:

 *  `int length()`：返回此字符串的长度。
 *  `String concat(String str)`：将指定的字符串连接到该字符串的末尾。
 *  `char charAt(int index)`：返回指定索引处的char值。
 *  `int indexOf(String str)`：返回指定子字符串第一次出现在该字符串内的索引。
 *  `String substring(int beginIndex)`：返回一个子字符串，从beginIndex开始截取字符串到字符串结尾。
 *  `String substring(int beginIndex, int endIndex)`：返回一个子字符串，从beginIndex到endIndex截取字符串。含beginIndex，不含endIndex。

转换功能的方法:

 *  `char[] toCharArray()`：将此字符串转换为新的字符数组。
 *  `byte[] getBytes()`：使用平台的默认字符集将该String编码转换为新的字节数组。
 *  `String replaceAll(String regex, String replacement)`：成功则返回替换的字符串，失败则返回原始字符串。其中regex为匹配此字符串的正则表达式；replacement为用来替换每个匹配项的字符串。
 *  `String replace(CharSequence target, CharSequencere placement)`：将与target匹配的字符串使用replacement字符串替换。
   
    > CharSequence是一个接口，也是一种引用类型。作为参数类型，可以把String对象传递到方法中。

分割功能的方法:

 *  `String[] split(String regex)`：将此字符串按照给定的regex（规则）拆分为字符串数组。
   
    > split方法的参数其实是一个“正则表达式”，如果按照英文句点“.”进行切分，必须写"\\."。

将基本数据型态转换成String的static方法：

 *  `String.valueOf(boolean b)` : 将 boolean 变量 b 转换成字符串。
 *  `String.valueOf(char c)` : 将 char 变量 c 转换成字符串。
 *  `String.valueOf(char[] data)` : 将 char 数组 data 转换成字符串。
 *  `String.valueOf(char[] data, int offset, int count)` : 将 char 数组 data 中 由 data\[offset\] 开始取 count 个元素 转换成字符串。
 *  `String.valueOf(double d)` : 将 double 变量 d 转换成字符串。
 *  `String.valueOf(float f)` : 将 float 变量 f 转换成字符串。
 *  `String.valueOf(int i)` : 将 int 变量 i 转换成字符串。
 *  `String.valueOf(long l)` : 将 long 变量 l 转换成字符串。
 *  `String.valueOf(Object obj)` : 将 obj 对象转换成 字符串, 等于 obj.toString()。

将String转换成基本数据型态的方法：

 *  详情参考parseXxx系列方法。

##### StringBuilder 

> java.lang.StringBuilder字符串缓冲区 可变字符序列

构造方法：

 *  `StringBuilder()`：构造一个空的StringBuilder容器。
 *  `StringBuilder(String str)`：构造一个StringBuilder容器，并将字符串添加进去。

常用方法：

 *  `StringBuilder append(...)`：添加任意类型数据的字符串形式，并返回当前对象自身。
   
    > 连锁编程：bu.append(“abc”).append(1).append(true).append(8.8).append(‘中’);
 *  `String toString()`：将当前StringBuilder对象转换为String对象。
   
    > StringBuilder和String可以相互转换：String->StringBuilder：StringBuilder//StringBuilder->String：toString

##### Integer 

> java.lang.Integer 装箱与拆箱（其他类型有类似方法）

装箱(基本类型的数据->包装类)

构造方法：

 *  `Integer(int value)`：构造一个新分配的 Integer 对象，它表示指定的 int 值。（过时）
 *  `Integer(String s)`：构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。

（传递的字符串，必须是基本类型的字符串，否则会抛出异常 “100” 正确 “a” 抛异常）

静态方法:

 *  `static Integer valueOf(int i)`：返回一个表示指定的 int 值的 Integer 实例。
 *  `static Integer valueOf(String s)`：返回保存指定的 String 的值的 Integer 对象。

进制转换静态方法：

 *  `static String toBinaryString(int i)`：返回数字i的二进制数字符串。
 *  `static String toOctalString(int i)`：返回数字i的八进制数字符串。
 *  `static String toHexString(int i)`：返回数字i的十六进制数字符串。
 *  `static int parseInt(String s)`： 将字符串参数s解析为带符号的十进制整数。
 *  `static int parseInt(String s, int radix)`： 将整数字符串s（radix用来指明s是几进制）转换成10进制的整数。

拆箱：(包装类->基本类型的数据)

成员方法:

 *  `int intValue()`：以 int 类型返回该 Integer 的值。

##### parseXxx 

> 静态方法 基本类型与字符串之间的转换

基本类型转换成字符串：

 *  基本类型直接与””相连接即可；如：34+“”
 *  `static String toString(int i)` 返回一个表示指定整数的 String 对象。
   
    > 包装类的静态方法toString(参数),不是Object类的toString() 重载
 *  `static String valueOf(int i)` 返回 int 参数的字符串表示形式。
   
    > String类的静态方法valueOf(参数)

字符串转换成基本类型（Character除外）：

 *  `static byte parseByte(String s)`：将字符串参数转换为对应的byte基本类型。
 *  `static short parseShort(String s)`：将字符串参数转换为对应的short基本类型。
 *  `static int parseInt(String s)`：将字符串参数转换为对应的int基本类型。
 *  `static long parseLong(String s)`：将字符串参数转换为对应的long基本类型。
 *  `static float parseFloat(String s)`：将字符串参数转换为对应的float基本类型。
 *  `static double parseDouble(String s)`：将字符串参数转换为对应的double基本类型。
 *  `static boolean parseBoolean(String s)`：将字符串参数转换为对应的boolean基本类型。

##### Math 

静态常量：

 *  `static final double PI = 3.141……`(精确到19位)
 *  `static double exp(double a)` :返回Euler的数字 e ，其值 double值。

基本运算的方法:

 *  `static double abs(double a)`：返回double值的绝对值。
 *  `static double ceil(double a)`：向上取整，返回大于等于参数的最小的整数。
 *  `static double floor(double a)`：向下取整，返回小于等于参数最大的整数。
 *  `static long round(double a)`：返回最接近参数的long。(相当于四舍五入方法)
 *  `static int max(int a, int b)` ：返回a与b中较大值。
 *  `static int min(int a, int b)`：返回a与b中较小值。
 *  `static double cos(double a)`：返回角度的三角余弦值。
 *  `static double acos(double a)`：返回值的反余弦值; 返回的角度在0.0到pi的范围内。
 *  `static double expm1(double x)`：返回 e^x -1。
 *  `static double log(double a)`：返回 double值的自然对数（基数 e ）。
 *  `static double log10(double a)`：返回 double值的基数10对数。
 *  `static double pow(double a, doubl b)` ：a^b
 *  `static double sqrt(double a)` ：返回 double值的正确舍入正平方根。
 *  `static double toDegrees(double angrad)`：将以弧度测量的角度转换为以度为单位测量的近似等效角度。
 *  `static double toRadians(double angdeg)`：将以度为单位测量的角度转换为以弧度为单位测量的近似等效角度。

##### Object 

 *  `String toString()`：返回该对象的字符串表示。
 *  `boolean equals(Object obj)`：指示其他某个对象是否与此对象“相等”。
 *  `int hasCode()`：返回该对象的哈希码值。
   
    > HashSet集合存放自定义类型元素时，需要重写对象中的hashCode和equals方法
 *  `void wait()`：在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
 *  `void wait(long timeout)`：在其他线程调用此对象的 notify() 方法或 notifyAll() 方法，或者超过指定的时间量前，导致当前线程等待。
 *  `void wait(long timeout, int nanos)`：在其他线程调用此对象的 notify() 方法或 notifyAll() 方法，或者其他某个线程中断当前线程，或者已超过某个实际时间量前，导致当前线程等待。
 *  `void notify()`：唤醒在此对象监视器上等待的单个线程。
 *  `void notifyAll()`：唤醒在此对象监视器上等待的所有线程。
 *  `Class<?> getClass()`：返回此 Object 的运行时类。
 *  `protected Object clone()`：创建并返回此对象的一个副本。
 *  `protected void finalize()`：当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。

##### System 

> java.lang.System含有大量静态方法

静态字段：

 *  `static PrintStream err`：“标准”错误输出流。
 *  `static InputStream in`：“标准”输入流。
 *  `static PrintStream out`：“标准”输出流。

常用方法：

 *  `static long currentTimeMillis()`：返回以毫秒为单位的当前时间。//获取毫秒值形式的当前时间。
   
    > 常用于测试程序效率
 *  `static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)`：将数组中指定的数据拷贝到另一个数组中。
   
    > src Object:源数组（原来的数组）。src Posint:源数组索引起始位置。dest Object:目标数组。dest Posint:目标数组索引起始位置。length int:复制元素个数。
 *  `static void setErr(PrintStream err)`：重新分配“标准”错误输出流。
 *  `static void setIn(InputStream in)`：重新分配“标准”输入流。
 *  `static void setOut(PrintStream out)`：重新分配“标准”输出流。

##### Throwable 

> java.lang.Throwable异常的根类

常用方法：

 *  `void printStackTrace()`：打印异常的详细信息。包含了异常的类型，原因，出现的位置,在开发和调试阶段,都得使用printStackTrace。
 *  `String getMessage()`：获取发生异常的原因。提示给用户的时候，就提示错误原因。
 *  `String toString()`: 获取异常的类型和异常描述信息(不用)。

##### Thread 

构造方法：

 *  `Thread()`：分配一个新的线程对象。
 *  `Thread(String name)`：分配一个指定名字的新的线程对象。//thread
 *  `Thread(Runnable target)`：配一个带有指定目标新的线程对象。
 *  `Thread(Runnable target, String name`)：分配一个带有指定目标新的线程对象并指定名字。

常用方法：

 *  `String getName()`：获取当前线程名称。
 *  `void setName(String name)`：改变线程名称，使之与参数name相同。//main
 *  `void start()`：导致此线程开始执行；Java虚拟机调用此线程的run方法。
 *  `void run()`：此线程要执行的任务在此处定义代码。

静态方法：

 *  `static void sleep(long millis)`：使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
 *  `static Thread currentThread()`：返回对当前正在执行的线程对象的引用。

##### Runnable/接口 

> 接口 java.lang.Runnable

 *  `abstract void run()`：run方法的定义。（只有这一个方法）

##### Class<T> 

> java.lang.Class<T>

获取Class对象的方式：

 *  `static class<?> forName(String className)`：返回与具有给定字符串名称的类或接口关联的 类对象。
 *  `类名.class`：通过类名的属性class获取。
 *  `class<?> getClass()`：返回此 Object的运行时类。 （Object类）

获取成员变量们：

 *  `Field[] getFields()`：获取所有public修饰的成员变量。
 *  `Field getField(String name)`：获取指定名称的 public修饰的成员变量。
 *  `Field[] getDeclaredFields()`：获取所有的成员变量，不考虑修饰符。
 *  `Field getDeclaredField(String name)`：获取指定名称的成员变量。

获取构造方法们：

 *  `Constructor<?>[] getConstructors()`：获取所有public修饰的构造方法。
 *  `Constructor<T> getConstructor(类<?>... parameterTypes)`：获取指定名称的 public修饰的构造方法。
 *  `Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)`：获取所有的构造方法，不考虑修饰符。
 *  `Constructor<?>[] getDeclaredConstructors()`：获取指定名称的构造方法。

获取成员方法们：

 *  `Method[] getMethods()`：获取所有public修饰的成员方法。
 *  `Method getMethod(String name, 类<?>... parameterTypes)`：获取指定名称的 public修饰的成员方法。
 *  `Method[] getDeclaredMethods()`：获取所有的成员方法，不考虑修饰符。
 *  `Method getDeclaredMethod(String name, 类<?>... parameterTypes)`：获取指定名称的成员方法。

获取全类名:

 *  `String getName()`：返回此类对象表示的实体名称（类，接口，数组类，基本类型或void），作为 String 。

获取Class对象的方式：

 *  `Class.forName("全类名")`：将字节码文件加载进内存，返回Class对象
   
     *  多用于配置文件，将类名定义在配置文件中。读取文件，加载类
 *  `类名.class`：通过类名的属性class获取
   
     *  多用于参数的传递
 *  `对象.getClass()`：getClass()方法在Object类中定义着。
   
     *  多用于对象的获取字节码的方式

##### \*reflect反射相关 

##### Field 

> java.lang.reflect.Field

常用方法：

 *  `void set(Object obj, Object value)`：将指定对象参数上此字段对象表示的字段设置为指定的新值。
 *  `Object get(Object obj)`：返回指定对象上此字段表示的字段的值。
 *  `void setAccessible(boolean flag)`：将此反射对象的accessible标志设置为指示的布尔值。 //忽略访问权限修饰符的安全检查，setAccessible(true):暴力反射。

##### Constructor<T> 

> java.lang.reflect.Constructor<T>

常用方法：

 *  `T newInstance(Object... initargs)`：使用此构造器对象表示的构造方法，使用指定的初始化参数创建和初始化构造函数声明类的新实例。
 *  `void setAccessible(boolean flag)`：将此反射对象的accessible标志设置为指示的布尔值。

##### Method 

> java.lang.reflect.Method

常用方法：

 *  `Object invoke(Object obj, Object... args)`：在具有指定参数的指定对象上调用此方法对象表示的基础方法。
 *  `String getName()`：返回此方法对象表示的方法的名称，如 String。

##### ClassLoader 

> 抽象类 java.lang.ClassLoader类加载器

构造方法：

 *  `protected ClassLoader()`：创建使用一个新的类加载器 ClassLoader该方法返回 getSystemClassLoader()作为父类加载器。
 *  `protected ClassLoader(ClassLoader parent)`：使用指定的父类加载器创建新的类加载器以进行委派。
 *  `protected ClassLoader(String name, ClassLoader parent)`：创建具有指定名称的新类加载器，并使用指定的父类加载器进行委派。

成员方法：

 *  `InputStream getResourceAsStream(String name)`：返回用于读取指定资源的输入流。
 *  `URL getResource(String name)`：查找具有给定名称的资源。
 *  `Enumeration<URL> getResources(String name)`：查找具有给定名称的所有资源。
 *  `String getName()`：如果未指定此类加载器，则返回此类加载器的名称或 null 。
 *  `protected Object getClassLoadingLock(String className)`：返回类加载操作的锁定对象。
 *  `protected String findLibrary(String libname)`：返回本机库的绝对路径名
 *  `protected 类<?> findClass(String name)`：查找具有指定的类 binary name 。

#### 2 java.util 

##### Scanner 

构造方法：

 *  `Scanner(InputStream source)`：构造一个新的Scanner，它生成的值是从指定的输入流扫描的。

查看成员方法：

 *  `int nextInt()`：将输入信息的下一个标记扫描为一个int值。
 *  `String next()`：获取键盘输入的一个字符串。

##### Obects 

 *  `static boolean equals(Object a, Object b)`：判断两个对象是否相等。
   
    > Objects类里的静态方法是容忍空指针的。
 *  `static <T> T requireNonNull(T obj)`：查看指定引用对象obj不是null。

##### Date(瞬时) 

> 表示特定的瞬间

构造函数：

 *  `Date()`：分配Date对象并初始化此对象，以表示分配它的时间（精确到毫秒）。//获取英文格式(Date日期)的当前时间。
 *  `Date(long date)`：分配Date对象并初始化此对象，以表示自从标准基准时间（1970年1月1日00:00:00 GMT）以来的指定毫秒数。//毫秒值->Date日期

常用方法：

 *  `long getTime()`：把日期对象转换成对应的时间毫秒值。//Date日期->毫秒值

##### Calendar(日历) 

> 抽象类 java.util.Calendar是日历类

Calendar静态方法：

 *  `static Calendar getInstance()`：使用默认时区和语言环境获得一个日历。（获取日历格式的当前时间。）

常用方法：

 *  `int get(int field)`：返回给定日历字段的值。
 *  `void set(int field, int value)`：将给定的日历字段设置为给定值。
 *  `void set(int year, int month, int date)` 设置日历字段的值 YEAR ， MONTH和 DAY\_OF\_MONTH。
 *  `abstract void add(int field, int amount)`：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
 *  `Date getTime()`：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。//日历->Date日期
   
    > int field：日历类的字段//int field -> Calender.成员常量

<table> 
 <thead> 
  <tr> 
   <th>YEAR</th> 
   <th>MONTH</th> 
   <th>DAY_OF_MONTH</th> 
   <th>HOUR</th> 
   <th>HOUR_OF_DAY</th> 
   <th>MINUTE</th> 
   <th>SECOND</th> 
   <th>DAY_OF_WEEK</th> 
  </tr> 
 </thead> 
 <tbody> 
  <tr> 
   <td>年</td> 
   <td>月（从0开始，可以+1使用）</td> 
   <td>月中的天（几号）</td> 
   <td>时（12小时制）</td> 
   <td>时（24小时制）</td> 
   <td>分</td> 
   <td>秒</td> 
   <td>周中的天（周几，周日为1，可以-1使用）</td> 
  </tr> 
 </tbody> 
</table>

##### Random 

构造方法：

 *  `Random()`：创建一个新的随机数生成器。
 *  `Random(long seed)`：使用单个long种子创建一个新的随机数生成器。

成员方法：

 *  `int nextInt()`：返回下一个伪随机数，从该随机数生成器的序列中均匀分布 int值。
 *  `int nextInt(int n)`：返回一个伪随机数，范围在0（包括）和指定值n（不包括）之间的int值。

##### \*数据结构相关 

##### Collection/接口 

> 接口 java.util.Collection

定义的方法：

 *  `boolean add(E e)`：把给定的对象添加到当前集合中。
 *  `void clear()` ：清空集合中所有的元素。
 *  `boolean remove(E e)`：把给定的对象在当前集合中删除。
 *  `boolean contains(E e)`：判断当前集合中是否包含给定的对象。
 *  `boolean isEmpty()`：判断当前集合是否为空。
 *  `int size()`：返回集合中元素的个数。
 *  `Object[] toArray()`：把集合中的元素，存储到数组中。

获取迭代器的方法：

 *  `Iterator iterator()`: 获取集合对应的迭代器，用来遍历集合中的元素的。

##### Iterator/接口 

> 接口 java.util.Iterator迭代器

常用方法：

 *  `E next()`：返回迭代的下一个元素。
 *  `boolean hasNext()`：如果仍有元素可以迭代，则返回 true。

##### List/接口 

> 接口，继承自Collection接口 java.util.List

常用方法：

 *  `void add(int index, E element)`：将指定的元素，添加到该集合中的指定位置上。
 *  `E get(int index)`：返回集合中指定位置的元素。
 *  `E remove(int index)`：移除列表中指定位置的元素, 返回的是被移除的元素。
 *  `E set(int index, E element)`：用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
 *  `default void retainAll(Collection<?> c)`：将c集合与该集合做交集，并赋给该集合。

静态方法 JDK9新特性（前提:集合中存储的元素个数已经确定）：

 *  `static <E> List<E> of(E… elements)`：返回包含任意数量元素的不可变列表。

##### Arrays 

> 与数组相关的工具类，提供了大量静态方法，实现数组常见操作

操作数组的方法：

 *  `static String toString(E[] a)`：返回指定数组内容的字符串表示形式。
 *  `static void sort(E[] a)`：对指定的数组按数字升序进行排序。
 *  `static void copyOf(E[] a, int newLength)`：用于复制指定的数组内容以达到扩容的目的。
   
    > 如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持。

##### ArrayList 

> java.util.ArrayList<E> 集合 数组结构，元素增删慢，查找快

构造方法：

 *  `ArrayList()`：构造一个内容为空的集合。

基本格式:

 *  `ArrayList<String> list = new ArrayList<>();`

常用方法和遍历：(增、删、查)：

 *  继承自List接口。
 *  `boolean add(E e)`：将指定的元素添加到此集合的尾部。
 *  `E remove(int index)`：移除此集合中指定位置上的元素。返回被删除的元素。
 *  `E get(int index)`：返回此集合中指定位置上的元素。返回获取的元素。
 *  `int size()`：返回此集合中的元素数。遍历集合时，可以控制索引范围，防止越界。

Collections 数组排序：

 *  `Collections.sort(list)`：对链表进行排序可以用这个api，传入 list。

##### LinkedList 

> java.util.LinkedList 链表结构，方便元素添加、删除的集合

首尾操作的方法：

 *  继承自List接口。
 *  `void addFirst(E e)`：将指定元素插入此列表的开头。
 *  `void addLast(E e)`：将指定元素添加到此列表的结尾。
 *  `void push(E e)`：将元素推入此列表所表示的堆栈。
 *  `E getFirst()`：返回此列表的第一个元素。
 *  `E getLast()`：返回此列表的最后一个元素。
 *  `E removeFirst()`：移除并返回此列表的第一个元素。
 *  `E removeLast()`：移除并返回此列表的最后一个元素。
 *  `E pop()`：从此列表所表示的堆栈处弹出一个元素。
 *  `boolean isEmpty()`：如果列表不包含元素，则返回true。

##### Set/接口 

> 接口 继承自Collection接口。

##### HashSet 

> 继承自Set接口。

##### LinkedHashSet 

> 链式哈希表 继承自HashSet类。

##### Collections 

> java.utils.Collections: 集合工具类，用来对集合进行操作

常用功能：

 *  `static <T> boolean addAll(Collection<T> c, T... elements)`：往集合Collection<T> c中添加一些元素T… elements。
 *  `static void shuffle(List<?> list)` ：打乱顺序，打乱集合顺序。
 *  `static <T> void sort(List<T> list)`：将集合中元素按照默认规则（升序）排序。
   
    > 使用前提：被排序的集合里边存储的元素，必须实现Comparable，重写接口中的方法compareTo定义排序的规则
 *  `static <T> void sort(List<T> list，Comparator<? super T> )`：将集合中元素按照指定规则排序。

##### Comparator/接口 

> 接口 java.util.Comparator<T>比较器

抽象方法定义:

 *  `abstract int compare(T o1, T o2)`：o1-o2:升序排序

##### Comparable<T>/接口 

> 接口 java.lang.Comparable比较器

 *  `int compareTo(T o)`：比较此对象与指定对象的顺序。
   
    > 自己"this"-参数：升序排序
    
    > Comparator和Comparable的区别：
    > 
    > Comparable：自己(this)和别人(参数)比较，自己需要实现Comparable接口，重写比较的规则compareTo方法。
    > 
    > Comparator：相当于找一个第三方的裁判，比较两个。

##### Map<T>/接口 

> 接口 java.util.Map集合

常用方法：

 *  `V put(K key, V value)`：把指定的键与指定的值添加到Map集合中。返回被替换的value值。
 *  `V remove(Object key)`：把指定的键所对应的键值对元素在Map集合中删除，返回被删除元素的值。
 *  `V get(Object key)`：根据指定的键，在Map集合中获取对应的值。
 *  `boolean containsKey(Object key)`：判断集合中是否包含键值k的映射关系。
 *  `boolean containsValue(Object value)`：判断集合中是否将一个或多个键映射到指定值。
 *  `Set<K> keySet()`：获取Map集合中所有的键，存储到Set集合中。
 *  `V getOrDefault(Object key, V defaultValue)`：当Map集合中有这个key时，就使用这个key的Value值；如果没有就使用默认值defaultValue。

Map集合中获取所有Entry对象的方法：

 *  `Set<Map.Entry<K,V>> entrySet()`：获取到Map集合中所有的键值对对象的集合(Set集合)。

##### Map.Entry 

> 键值对接口 java.util.Map.Entry<K,V>是Map<T>接口的内部接口

> 当Map集合一创建，那么就会在Map集合中创建一个Map.Entry对象，用来记录键与值（键值对对象，键与之的映射关系

获取对应键和对应值的方法：

 *  `K getKey()`：获取Entry对象中的键。
 *  `V getValue()`：获取Entry对象中的值。

##### HashMap 

> java.util.LinkedHashMap 必须复写对象的hashCode和equals方法
> 
> 实现自Map<T>接口

##### LinkedHashMap 

> 保证有序，还要速度快
> 
> 继承自HashMap集合

##### TreeMap 

> TreeMap 使用红黑树实现 key 有序排列；  
> 继承 AbstractMap 超类(支持 map 基本特性和操作)；实现 NavigableMap(支持有序), Cloneable(支持克隆复制), Serializable(支持序列化) 接口；

构造方法：

 *  `TreeMap()`：构造空 TreeMap。
 *  `TreeMap(Comparator<? super K> comparator)`：按照给定的比较器排序。
 *  `TreeMap(Map<> map)`：根据现有的 map 构造 TreeMap。
 *  `TreeMap(SortedMap<K,? extends V> m)`：根据现有的 SortedMap 构造 TreeMap。

快速搜索符合条件的最近的元素的方法：（由 NavigableMap 接口支持）

 *  `K floorKey(K key)`：返回 小于等于 指定值 key 的键。
 *  `Map.Entry<K,V> floorEntry(K key)`：返回 小于等于 指定值 key 的键值映射 entry。
 *  `K ceilingKey(K key)`：返回 大于等于 指定值 key 的键。
 *  `Map.Entry<K,V> ceilingEntry(K key)`：返回 大于等于 指定值 key 的键值映射 entry。
 *  `K lowerKey(K key)`：返回 小于 指定值 key 的键。
 *  `Map.Entry<K,V> lowerEntry(K key)`：返回 小于 指定值 key 的键值映射 entry。
 *  `K higherKey(K key)`：返回 大于 指定值 key 的键。
 *  `Map.Entry<K,V> higherEntry(K key)`：返回 大于 指定值 key 的键值映射 entry。

操作最小最大键的方法：

 *  `K firstKey()`：返回最小键 key。
 *  `Map.Entry<K,V> firstEntry()`：返回最小键的键值映射 entry。
 *  `K lastKey()`：返回最大键 key。
 *  `Map.Entry<K,V> lastEntry()`：返回最大键的键值映射 entry。
 *  `Map.Entry<K,V> pollFirstEntry()`：删除并返回最小键的键值映射 entry。
 *  `Map.Entry<K,V> pollLastEntry()`：删除并返回最大键的键值映射 entry。

截取一部分 TreeMap 的方法:

 *  给定左右边界截取：
 *  `SortedMap<K,V> subMap(K fromKey, K toKey)`：返回部分排序的 map，其中 key 的范围为 \[fromKey, toKey)。
 *  `NavigableMap<K,V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)`：返回部分排序的 map，其中 key 的范围为 (fromKey, toKey)，是否包含边界由 fromInclusive 和 toInclusive 确定。
 *  给定左边界截取：
 *  `SortedMap<K,V> tailMap(K fromKey)`：返回部分排序的 map，其中 key 大于等于 fromKey。
 *  `NavigableMap<K,V> tailMap(K fromKey, boolean inclusive)`：返回部分排序的 map，其中 key 大于 fromKey，否包含边界由 inclusive 确定。
 *  给定右边界截取：
 *  `SortedMap<K,V> headMap(K toKey)`：返回部分排序的 map，其中 key 小于 toKey。
 *  `NavigableMap<K,V> headMap(K toKey, boolean inclusive)`：返回部分排序的 map，其中 key 小于 toKey，否包含边界由 inclusive确定。

正反序相关：

 *  `NavigableSet<K> navigableKeySet()`：返回键顺序相同的 set。
 *  `NavigableSet<K> descendingKeySet()`：返回键顺序相反的 set。
 *  `NavigableMap<K,V> descendingMap()`：返回键顺序相反的 map。

其他方法：

 *  `void putAll(Map<> map)`：将指定 map 里的所有键值对复制进 TreeMap。
 *  `Collection<V> values()`：返回所有值构成的集合。
 *  
 *  `V replace(K oldKey, V newValue)`：替换指定键 key 的值，返回原值。
 *  `boolean replace(K oldKey, V oldValue, V newValue)`：替换指定键 key 的值，返回 boolean。

##### Stack栈 

> 栈 java.util.Stack<E>

构造方法：

 *  `Stack()`：创建一个空堆栈。

基本格式:

 *  `Stack<Object> stack = new Stack<>();`

成员方法：

 *  `boolean empty()`：测试此堆栈是否为空。
 *  `E peek()`：查看此堆栈顶部的对象，而不将其从堆栈中删除。
 *  `E pop()`：移除此堆栈顶部的对象，并将该对象作为此函数的值返回。
 *  `E push(E item)`：将项目推到此堆栈的顶部。
 *  `int search(Object o)`：返回对象在此堆栈上的从1开始的位置。
 *  `int size()`：返回栈的长度。

##### Queue队列/接口 

> 接口 java.util.Queue<E>

构造方法：

 *  `Queue()`：创建一个空堆栈。

基本格式:

 *  `Queue<Object> queue= new Queue<>();`

成员方法：

 *  `boolean add(E e)`： 将指定的元素插入到此队列中， 如果可以立即执行此操作，而不会违反容量限制 。
 *  `E element()`： 检索但不删除这个队列的头。
 *  `boolean offer(E e)`： 如果在不违反容量限制的情况下立即执行，则将指定的元素插入到此队列中。
 *  `E peek()`： 检索但不删除此队列的头，如果此队列为空，则返回 null。
 *  `E poll()`： 检索并删除此队列的头，如果此队列为空，则返回 null 。
 *  `E remove()`： 检索并删除此队列的头。

##### PriorityQueue优先级队列 

构造方法：

 *  `PriorityQueue()`： 创建一个PriorityQueue ，具有默认的初始容量（11） /默认升序。
 *  `PriorityQueue(Collection<? extends E> c)`： 创建一个 PriorityQueue集合中的元素的PriorityQueue。
 *  `PriorityQueue(Comparator<? super E> comparator)`： 创建具有默认初始容量的PriorityQueue，并根据指定的比较器对其元素进行排序。
 *  `PriorityQueue<>((x, y) -> (int)(y - x))` ：创建一个PriorityQueue，并按照降序排列。

基本格式:

 *  `PriorityQueue<Object> queue= new PriorityQueue<>();`

成员方法：

 *  `boolean add(E e)`： 将指定的元素插入到此队列中， 如果可以立即执行此操作，而不会违反容量限制 。
 *  `void clear()`： 从此优先级队列中删除所有元素。
 *  `boolean contains(Object o)`： 如果此队列包含指定的元素，则返回 `true` 。
 *  `int size()`： 返回此集合中的元素数。
 *  `Object toArray()`： 返回一个包含此队列中所有元素的数组。
 *  `E element()`： 检索但不删除这个队列的头。
 *  `boolean offer(E e)`： 如果在不违反容量限制的情况下立即执行，则将指定的元素插入到此队列中。
 *  `E peek()`： 检索但不删除此队列的头，如果此队列为空，则返回 null。
 *  `E poll()`： 检索并删除此队列的头，如果此队列为空，则返回 null 。
 *  `E remove()`： 检索并删除此队列的头。

##### Deque 双端队列（接口） 

构造方法：

 *  `ArrayDeque<>()`：非线程安全，实现了Collection接口和Iterator接口的所有可选方法，不允许元素为null；
 *  `LinkedList<>()`：List 和 Deque 接口的双向链表列表实现，实现了所有可选列表操作，且允许所有类型的元素（包括null）；
 *  `ConcurrentLinkedListDeque<>()`：线程安全，实现了 Deque 和 Iterator 接口的所有可选方法；

插入元素：

 *  `void addFirst(E e)`: 向队头插入元素，如果元素为空，则发生 NPE；
 *  `void addLast(E e)`: 向队尾插入元素，如果为空，则发生 NPE；
 *  `boolean offerFirst(E e)`: 向队头插入元素，如果插入成功返回 true，否则返回 false；
 *  `boolean offerLast(E e)`: 向队尾插入元素，如果插入成功返回 true，否则返回 false；

移除元素：

 *  `E removeFirst()`: 返回并移除队头元素，如果该元素是 null，则发生NoSuchElementException；
 *  `E removeLast()`: 返回并移除队尾元素，如果该元素是 null，则发生NoSuchElementException；
 *  `E pollFirst()`: 返回并移除队头元素，如果队列无元素，则返回 null；
 *  `E pollLast()`: 返回并移除队尾元素，如果队列无元素，则返回 null；

获取元素：

 *  `E getFirst()`: 获取队头元素但不移除，如果队列无元素，则发生 NoSuchElementException；
 *  `E getLast()`: 获取队尾元素但不移除，如果队列无元素，则发生 NoSuchElementException；
 *  `E peekFirst()`: 获取队头元素但不移除，如果队列无元素，则返回 null；
 *  `E peekLast()`: 获取队尾元素但不移除，如果队列无元素，则返回 null；

栈操作：

 *  `E pop()`: 弹出栈中元素，也就是返回并移除队头元素，等价于 removeFirst()，如果队列无元素，则发生 NoSuchElementException；
 *  `void push(E e)`: 向栈中压入元素，也就是向队头增加元素，等价于 addFirst()，如果元素为 null，则发生 NPE，如果栈空间受到限制，则发生 IllegalStateException；

##### Lock/接口 

> 接口 java.util.concurrent.locks.Lock同步锁

 *  `void lock()`：加同步锁。
 *  `void unlock()`：释放同步锁。

##### Executors 

> java.util.concurrent.Executors生产线程池的工厂类

 *  `static ExecutorService newFixedThreadPool(int nThreads)`：创建线程池，返回线程池对象。(可以指定最大数量)

##### ExecutorService/接口 

> 接口 java.util.concurrent.ExecutorService

 *  `Future<?> submit(Runnable task)`：获取线程池中的某一个线程对象，并执行。/提交一个Runnable任务用于执行，并返回一个表示该任务的Future。
   
    > Future接口：用来记录线程任务执行完毕后产生的结果。线程池创建与使用。
 *  `void shut dowm()`：启动一次顺序关闭，执行以前提交的任务，但不接受新任务。

##### Properties 

> java.util.Properties extends Hashtable

构造方法：

 *  `Properties()` ：创建一个空的属性列表。

基本的存储方法：

 *  `Object setProperty(String key, String value)`：保存一对属性。//调用 Hashtable 的方法 put。
 *  `String getProperty(String key)`：使用此属性列表中指定的键搜索属性值。//通过key找到value值，此方法相当于Map集合中的get(key)方法。
 *  `Set<String> stringPropertyNames()`：所有键的名称的集合。//返回此属性列表中的键集，其中该键及其对应值是字符串，此方法相当于Map集合中的keySet方法。

与流相关的方法：

 *  `void store(OutputStream out, String comments)`：以适合使用 load(InputStream) 方法加载到 Properties 表中的格式，将此 Properties 表中的属性列表（键和元素对）写入输出流。
 *  `void store(Writer writer, String comments)`：以适合使用 load(Reader) 方法的格式，将此 Properties 表中的属性列表（键和元素对）写入输出字符。
   
    > OutputStream：字节输出流，不能写入中文。Writer writer：字符输出流，可以写中文。String comments:注释，用来解释说明保存的文件是做什么用的。
 *  `void load(InputStream inStream)`：从字节输入流中读取键值对。
 *  `void load(Reader reader)`：按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
   
    > InputStream inStream：字节输入流，不能读取含有中文的键值对。Reader reader：字符输入流，能读取含有中文的键值对。

##### Supplier/接口 

> java.util.function.Supplier<T>

仅包含一个无参的方法：

 *  `T get()`：用来获取一个泛型参数指定类型的对象数据。

##### Consumer/接口 

> java.util.function.Consumer<T>

抽象方法：

 *  `void accept(T t)`：意为消费一个指定泛型的数据。

默认方法andThen：

 *  `default Consumer<T> andThen(Consumer<? super T> after)`：返回一个组合的 Consumer ，它按顺序执行此操作，然后执行 after操作。

##### Predicate/接口 

> java.util.function.Predicate<T>

抽象方法：

 *  `boolean test(T t)`：用于条件判断的场景。//用来对指定数据类型数据进行判断的方法。

默认方法and，or，negate：

 *  `default Predicate<T> and(Predicate<? super T> other)`：返回一个组合谓词，表示此谓词和另一个谓词的短路逻辑AND。
 *  `static <T> Predicate<T> isEqual(Object targetRef)`：返回一个谓词，根据 Objects.equals(Object, Object)测试两个参数是否相等。
 *  `default Predicate<T> negate()`：返回表示此谓词的逻辑否定的谓词。
 *  `static <T> Predicate<T> not(Predicate<? super T> target)`：返回谓词，该谓词是提供的谓词的否定。
 *  `default Predicate<T> or(Predicate<? super T> other)`：返回一个组合谓词，表示此谓词与另一个谓词的短路逻辑OR。

##### Function/接口 

> java.util.function.Function<T,R>

抽象方法：

 *  `R apply(T t)`：根据类型T的参数获取类型R的结果。

默认方法andThen：

 *  `default <V> Function<T,V> andThen(Function<? super R,? extends V> after)`：返回首先将此函数应用于其输入的 after函数，然后将 after函数应用于结果。
 *  `default <V> Function<V,R> compose(Function<? super V,? extends T> before)`：返回一个组合函数，该函数首先将 before函数应用于其输入，然后将此函数应用于结果。
 *  `static <T> Function<T,T> identity()`：返回一个始终返回其输入参数的函数。

##### Stream<T>/接口 

> java.util.stream

获取流得的方法：

 *  `default Stream<E> stream()` : 返回一个顺序流
 *  `default Stream<E> parallelStream()` : 返回一个并行流
 *  `static <T> Stream<T> of(T t)` 返回包含单个元素的顺序 Stream 。
 *  `static <T> Stream<T> of(T... values)` 返回其元素为指定值的顺序有序流。

常用方法：

 *  `void forEach(Consumer<? super T> action)`：对此流的每个元素执行操作。//可用于遍历流中的数据。
 *  `Stream<T> filter(Predicate<? super T> predicate)`：返回由与此给定谓词匹配的此流的元素组成的流。 //用于对Stream流中的数据进行过滤。
 *  `<R> Stream<R> map(Function<? super T, ? extends R> mapper)`：将流中的元素映射到另一个流中。//返回一个流，该流包含将给定函数应用于此流的元素的结果。
 *  `long count()`：返回此流中元素的数量。
 *  `Stream<T> limit(long maxSize)`：返回由此流的元素组成的流，截断长度不超过 maxSize 。
 *  `Stream<T> skip(long n)`：在丢弃流的第一个 n元素后，返回由此流的其余元素组成的流。 //跳过前n个元素。
 *  `static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)`：创建一个延迟连接的流，其元素是第一个流的所有元素，后跟第二个流的所有元素。

#### 3 java.text 

##### DateFormat 

> 抽象 需要常用的子类java.text.SimpleDateFormat

实现类的构造方法：

 *  `SimpleDateFormat(String pattern)`：用给定的模式和默认语言环境的日期格式符号构造SimpleDateFormat。//获取字符串格式的当前时间。

常用方法：

 *  `String format(Date date)`：将Date对象格式化为字符串。//Date日期->字符串
 *  `Date parse(String source)`：将字符串解析为Date对象（毫秒数）。//字符串->Date日期 //parse方法声明了一个异常叫ParseException

常用的格式规则为：

<table> 
 <thead> 
  <tr> 
   <th>y</th> 
   <th>M</th> 
   <th>d</th> 
   <th>D</th> 
   <th>H</th> 
   <th>m</th> 
   <th>s</th> 
   <th>S</th> 
   <th>w</th> 
   <th>W</th> 
   <th>F</th> 
   <th>E</th> 
   <th>zZ</th> 
  </tr> 
 </thead> 
 <tbody> 
  <tr> 
   <td>年</td> 
   <td>月</td> 
   <td>月中天</td> 
   <td>年中天</td> 
   <td>时</td> 
   <td>分</td> 
   <td>秒</td> 
   <td>毫秒</td> 
   <td>年中周</td> 
   <td>月中周</td> 
   <td>月中星期</td> 
   <td>星期</td> 
   <td>时区</td> 
  </tr> 
 </tbody> 
</table>

\[外链图片转存失败,源站可能有防盗链机制,建议将图片保存下来直接上传(img-fYMa88h5-1630227054783)(D:\\桌面文件夹\\校内文件\\大二下\\我的Markdowm笔记\\JavaAPI图片\\时间格式.png)\]

#### 4 java.io 

##### File 

> java.io.File用于文件和目录的创建、查找和删除等操作

静态成员变量：

 *  `static String pathSeparator`：与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
 *  `static char pathSeparatorChar`：与系统有关的路径分隔符。
   
    > 路径分隔符 windows:分号; linux:冒号:
 *  `static String separator`：与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
 *  `static char separatorChar`：与系统有关的默认名称分隔符。
   
    > 文件名称分隔符 windows:反斜杠\\ linux:正斜杠/

构造方法:

 *  `File(String pathname)`：通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
   
    > String pathname:字符串的路径名称，路径可以是以文件结尾，也可以是以文件夹结尾，路径可以是相对路径，也可以是绝对路径，路径可以是存在，也可以是不存在。
 *  `File(String parent, String child)`：从父路径名字符串和子路径名字符串创建新的 File实例。
 *  `File(File parent, String child)`：从父抽象路径名和子路径名字符串创建新的 File实例。

获取功能的方法:

 *  `String getAbsolutePath()`：返回此File的绝对路径名字符串。
 *  `String getPath()`：将此File转换为路径名字符串。//其实就是tostring方法。
 *  `String getName()`：返回由此File表示的文件或目录的名称。//获取的就是构造方法传递路径的结尾部分(文件/文件夹)
 *  `long length()`：返回由此File表示的文件的长度。//获取的是构造方法指定的文件的大小,以字节为单位。

判断功能的方法:

 *  `boolean exists()`：此File表示的文件或目录是否实际存在。
 *  `boolean isDirectory()`：此File表示的是否为目录。
 *  `boolean isFile()`：此File表示的是否为文件。

创建删除功能的方法:

 *  `boolean createNewFile()`：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
 *  `boolean delete()`：删除由此File表示的文件或目录。
 *  `boolean mkdir()`：创建由此File表示的目录。//创建单级空文件夹。
 *  `boolean mkdirs()`：创建由此File表示的目录，包括任何必需但不存在的父目录。//既可以创建单级空文件夹，也可以创建多级文件夹，创建文件夹的路径和名称在构造方法中给出(构造方法的参数)。

目录的遍历:

 *  `String[] list()`：返回一个String数组，表示该File目录中的所有子文件或目录。
 *  `File[] listFiles()`：返回一个File数组，表示该File目录中的所有的子文件或目录。

listFiles()的重载方法：文件过滤器

 *  `File[] listFiles(FileFilter filter)`：返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
   
    > FileFilter接口：用于抽象路径名(File对象)的过滤器。
 *  `File[] listFiles(FilenameFilter filter)`：返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。

##### Filter/接口 

> 接口 java.io.FileFilter过滤器

 *  `boolean accept(File pathname)`：测试pathname是否应该包含在当前File目录中，符合则返回true。

##### OutputStream 

> 抽象类 java.io.OutputStream字节输出流

字节输出流的基本共性功能方法：

 *  `void close()`：关闭此输出流并释放与此流相关联的任何系统资源。
 *  `void flush()`：刷新此输出流并强制任何缓冲的输出字节被写出。
 *  `void write(byte[] b)`：将 b.length字节从指定的字节数组写入此输出流。
 *  `void write(byte[] b, int off, int len)`：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
 *  `abstract void write(int b)`：将指定的字节输出流。

##### FileOutputStream 

> 文件输出流 java.io.FileOutputStream extends OutputStream

构造方法：

 *  `FileOutputStream(File file)`：创建文件输出流以写入由指定的 File对象表示的文件。
 *  `FileOutputStream(String name)`：创建文件输出流以指定的名称写入文件。

构造方法二：数据追加续写

 *  `FileOutputStream(File file, boolean append)`：创建文件输出流以写入由指定的 File对象表示的文件。
 *  `FileOutputStream(String name, boolean append)`：创建文件输出流以指定的名称写入文件。
   
    > boolean append参数：true-创建对象不会覆盖源文件，继续在文件的末尾追加写数据。false-创建一个新文件：覆盖源文件。

常用方法：

 *  继承自OutputStream抽象类。
 *  `write(int b)`：写出字节方法，每次可以写出一个字节数据出字节数据。
 *  `write(byte[] b)`：写出字节数组，每次可以写出数组中的数据。
 *  `write(byte[] b, int off, int len)` ：写出指定长度字节数组，每次写出从off索引开始，len个字节。

系统中的换行：

 *  Windows系统里，每行结尾是回车+换行，即\\r\\n；
 *  Unix系统里，每行结尾只有换行，即\\n；
 *  Mac系统里，每行结尾是回车，即\\r。从 Mac OS X开始与Linux统一。
   
    > 回车符\\r：回到一行的开头(return)
    > 
    > 换行符\\n：换行符：下一行(newline)

##### InputStream 

> 抽象类 java.io.InputStream 字节输入流

字节输入流的基本共性功能方法：

 *  `void close()`：关闭此输入流并释放与此流相关联的任何系统资源。
 *  `abstract int read()`：从输入流读取数据的下一个字节。
 *  `int read(byte[] b)`：从输入流中读取一些字节数，并将它们存储到字节数组 b中。

##### FileInputStream 

> java.io.FileInputStream extends InputStream 文件输入流

构造方法：

 *  `FileInputStream(File file)`：通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的 File对象 file命名。
 *  `FileInputStream(String name)`：通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名 name命名。

读取字节数据：

 *  `read`：读取字节方法，每次可以读取一个字节的数据，提升为int类型，读取到文件末尾，返回-1。
 *  `read(byte[] b)`：使用字节数组读取，每次读取b的长度个字节到数组中，返回读取到的有效字节个数，读取到末尾时，返回-1。

##### Reader 

> 抽象类 java.io.Reader 字符输入流

字符输入流的基本共性功能方法：

 *  `void close()`：关闭此流并释放与此流相关联的任何系统资源。
 *  `int read()`：从输入流读取一个字符。
 *  `int read(char[] cbuf)`：从输入流中读取一些字符，并将它们存储到字符数组 cbuf中。

##### FileReader 

> java.io.FileReader extends Reader 读取字符文件的便利类

构造方法：

 *  `FileReader(File file)`：创建一个新的 FileReader ，给定要读取的File对象。
 *  `FileReader(String fileName)`：创建一个新的 FileReader ，给定要读取的文件的名称。
 *  `read`：读取字符数据方法，每次可以读取一个字符的数据，提升为int类型，读取到文件末尾，返回-1，循环读取。
 *  `read(char[] cbuf)`：使用字符数组读取，每次读取b的长度个字符到数组中，返回读取到的有效字符个数，读取到末尾时，返回-1。

##### Writer 

> 抽象类 java.io.Writer 字符输出流

字节输出流的基本共性功能方法：

 *  `void write(int c)`：写入单个字符。
 *  `void write(char[] cbuf)`：写入字符数组。
 *  `abstract void write(char[] cbuf, int off, int len)`：写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
 *  `void write(String str)`：写入字符串。
 *  `void write(String str, int off, int len)`：写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 *  `void flush()`：刷新该流的缓冲。
 *  `void close()`：关闭此流，但要先刷新它。

##### FileWriter 

> java.io.FileWriter extends Writer 写出字符到文件的便利类

构造方法：

 *  `FileWriter(File file)`：创建一个新的 FileWriter，给定要读取的File对象。
 *  `FileWriter(String fileName)`：创建一个新的 FileWriter，给定要读取的文件的名称。
 *  `write(int b)`：写出字符方法，每次可以写出一个字符数据。

关闭和刷新：

 *  `flush`：刷新缓冲区，流对象可以继续使用。
 *  `close`：先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了。
 *  `write(char[] cbuf)和write(char[] cbuf, int off, int len)`：写出字符数组，每次可以写出字符数组中的数据，用法类似FileOutputStream。
 *  `write(String str)和write(String str, int off, int len)`：写出字符串，每次可以写出字符串中的数据，更为方便。

续写和换行：

 *  操作类似于FileOutputStream。

##### BufferedOutputStream 

> java.io.BufferedOutputStream extends OutputStream 字节缓冲输出流

构造方法：

 *  `BufferedOutputStream(OutputStream out)` ：创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
 *  `BufferedOutputStream(OutputStream out, int size)` :创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入指定的底层输出流。
   
    > OutputStream out：字节输出流。我们可以传递FileOutputStream，缓冲流会给FileOutputStream增加一个缓冲区，提高FileOutputStream的写入效率。
    
    > int size：指定缓冲流内部缓冲区的大小，不指定默认。

##### BufferedInputStream 

> java.io.BufferedInputStream extends InputStream 字节缓冲输入流

构造方法：

 *  `BufferedInputStream(InputStream in)`：创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
 *  `BufferedInputStream(InputStream in, int size)`：创建具有指定缓冲区大小的 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
   
    > InputStream in：字节输入流。我们可以传递FileInputStream，缓冲流会给FileInputStream增加一个缓冲区，提高FileInputStream的读取效率。

##### BufferedWriter 

> java.io.BufferedWriter extends Writer 字符缓冲输出流

构造方法：

 *  `BufferedWriter(Writer out)`：创建一个使用默认大小输出缓冲区的缓冲字符输出流。
 *  `BufferedWriter(Writer out, int size)`：创建一个使用给定大小输出缓冲区的新缓冲字符输出流。
   
    > Writer out：字符输出流。我们可以传递FileWriter，缓冲流会给FileWriter增加一个缓冲区，提高FileWriter的写入效率。

特有的成员方法：

 *  `void newLine()`：写入一个行分隔符。会根据不同的操作系统，获取不同的行分隔符。
   
    > 输出语句System.out.println();就是调用了newLine()方法。

##### BufferedReader 

> java.io.BufferedReader extends Reader 字符缓冲输入流

构造方法：

 *  `BufferedReader(Reader in)` ：创建一个使用默认大小输入缓冲区的缓冲字符输入流。
 *  `BufferedReader(Reader in, int size)`：创建一个使用指定大小输入缓冲区的缓冲字符输入流。
   
    > Reader in：字符输入流。我们可以传递FileReader，缓冲流会给FileReader增加一个缓冲区，提高FileReader的读取效率。

特有的成员方法：

 *  `String readLine()`：读取一个文本行。读取一行数据。
   
    > 行的终止符号：通过下列字符之一即可认为某行已终止：换行 (‘\\n’)、回车 (‘\\r’) 或回车后直接跟着换行(\\r\\n)。返回值：包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null。

##### OutputStreamWriter 

> java.io.OutputStreamWriter extends Writer

构造方法：

 *  `OutputStreamWriter(OutputStream in)`：创建一个使用默认字符集的字符流。
 *  `OutputStreamWriter(OutputStream in, String charsetName)`：创建一个指定字符集的字符流。
   
    > OutputStream out：字节输出流，可以用来写转换之后的字节到文件中。
    
    > String charsetName：指定的编码表名称，不区分大小写，可以是utf-8/UTF-8,gbk/GBK,…不指定默认使用UTF-8。

##### InputStreamReader 

> java.io.InputStreamReader extends Reader

构造方法：

 *  `InputStreamReader(InputStream in)`：创建一个使用默认字符集的字符流。
 *  `InputStreamReader(InputStream in, String charsetName)`：创建一个指定字符集的字符流。
   
    > InputStream in：字节输入流，用来读取文件中保存的字节。

##### ObjectOutputStream 

> 对象的序列化流 java.io.ObjectOutputStream extends OutputStream 将Java对象的原始数据类型写出到文件,实现对象的持久存储。

构造方法：

 *  `ObjectOutputStream(OutputStream out)`：创建一个指定OutputStream的ObjectOutputStream。
   
    > OutputStream out：字节输出流。

特有方法 - 序列化操作：

 *  `final void writeObject (Object obj)` ：写出对象方法，将指定的对象写出。

##### ObjectInputStream 

> 对象的反序列化流 ObjectInputStream extends InputStream 将之前使用ObjectOutputStream序列化的原始数据恢复为对象。

构造方法：

 *  `ObjectInputStream(InputStream in)`：创建一个指定InputStream的ObjectInputStream。
   
    > InputStream in：字节输入流。

特有方法 - 反序列化操作：

 *  `final Object readObject ()` : 读取一个对象。从 ObjectInputStream读取对象。

##### PrintStream 

> java.io.PrintStream extends OutputStream 打印流

构造方法：

 *  `PrintStream(String fileName)`：使用指定的文件名创建一个新的打印流。
 *  `PrintStream(OutputStream out)`：输出的目的地是一个字节输出流。
 *  `PrintStream(String fileName)` ：输出的目的地是一个文件路径。

#### 5 java.net 

##### Socket 

> java.net.Socket客户端

构造方法：

 *  `Socket(String host, int port)`:创建套接字对象并将其连接到指定主机上的指定端口号。如果指定的host是null，则相当于指定地址为回送地址。
   
    > String host：服务器主机的名称/服务器的IP地址。int port：服务器的端口号。

成员方法：

 *  `InputStream getInputStream()`：返回此套接字的输入流。如果此Scoket具有相关联的通道，则生成的InputStream的所有操作也关联该通道。关闭生成的InputStream也将关闭相关的Socket。
 *  `OutputStream getOutputStream()`：返回此套接字的输出流。如果此Scoket具有相关联的通道，则生成的OutputStream的所有操作也关联该通道。关闭生成的OutputStream也将关闭相关的Socket。
 *  `void close()`：关闭此套接字。一旦一个socket被关闭，它不可再使用。关闭此socket也将关闭相关的InputStream和OutputStream。
 *  `void shutdownOutput()`：禁用此套接字的输出流。任何先前写出的数据将被发送，随后终止输出流。

##### ServerSocket 

> java.net.ServerSocket服务端

构造方法：

 *  `ServerSocket(int port)`：使用该构造方法在创建ServerSocket对象时，就可以将其绑定到一个指定的端口号上，参数port就是端口号。

成员方法：

 *  `Socket accept()`：侦听并接受连接，返回一个新的Socket对象，用于和客户端实现通信。该方法会一直阻塞直到建立连接。

#### 6 java.sql 

##### DriverManager 

> java.sql.DriverManager 驱动管理对象

静态方法：

 *  `static void registerDriver(Driver driver)`：使用DriverManager注册给定的驱动程序。
   
    > 写代码使用： `Class.forName("com.mysql.jdbc.Driver");`
 *  `static Connection getConnection(String url)`：尝试建立与给定数据库URL的连接。
 *  `static Connection getConnection(String url, String user, String password)`：尝试建立与给定数据库URL的连接。 //获取数据库连接。
   
    > url：指定连接的路径\[jdbc:mysql://ip地址(域名):端口号/数据库名称\]，user：用户名，password：密码。

##### Connection/接口 

> java.sql.Interface Connection数据库连接对象

获取执行sql 的对象：

 *  `Statement createStatement()`：创建一个 Statement对象，用于将SQL语句发送到数据库。
 *  `PreparedStatement prepareStatement(String sql)`：创建一个 PreparedStatement对象，用于将参数化SQL语句发送到数据库。（解决sql注入问题）

管理事务：

 *  `void setAutoCommit(boolean autoCommit)`：将此连接的自动提交模式设置为给定状态。//开启事务：调用该方法设置参数为false，即开启事务。
 *  `void commit()`：使自上次提交/回滚以来所做的所有更改成为永久更改，并释放此 Connection对象当前持有的所有数据库锁。//提交事务。
 *  `void rollback()`：撤消当前事务中所做的所有更改，并释放此 Connection对象当前持有的所有数据库锁。//回滚事务。
 *  `void close()`：立即释放此 Connection对象的数据库和JDBC资源，而不是等待它们自动释放。

##### Statement/接口 

> java.sql.Statement执行sql的对象

 *  `boolean execute(String sql)` ：执行给定的SQL语句，该语句可能返回多个结果。 //可以执行任意的sql （了解）
 *  `int executeUpdate(String sql)` ：执行DML（insert、update、delete）语句、DDL(create，alter、drop)语句-不常用，返回值为0
   
    > 返回值：影响的行数，可以通过这个影响的行数判断DML语句是否执行成功，返回值>0的则执行成功，反之，则失败。
 *  `ResultSet executeQuery(String sql)` ：执行DQL（select）语句，该语句返回单个 ResultSet对象。
 *  `void close()`：立即释放此 Statement对象的数据库和JDBC资源，而不是等待它自动关闭时发生。

##### ResultSet/接口 

> java.sql.ResultSet 结果集对象,封装查询结果

 *  `boolean next()`：游标向下移动一行，判断当前行是否是最后一行末尾(是否有数据)，如果是，则返回false，如果不是则返回true。
 *  `getXxx(参数)`：获取数据。
   
    > Xxx：代表数据类型，如：int getInt()，String getString() 。
    > 
    > 参数：int:代表列的编号,从1开始,如:getString(1)。String:代表列名称,如:getDouble(“balance”)。
 *  `void close()`：立即释放此 ResultSet对象的数据库和JDBC资源，而不是等待它自动关闭时发生。

##### PreparedStatement/接口 

> java.sql.PreparedStatement 执行sql的对象

给’?'赋值的方法：

 *  `void setXxx(参数1,参数2)`
   
    > 参数1:？的位置编号 从1 开始。 参数2:？的值
 *  `ResultSet executeQuery()`：执行此 PreparedStatement对象中的SQL查询，并返回查询生成的 ResultSet对象。
 *  `int executeUpdate()`：执行在该SQL语句PreparedStatement对象，它必须是一个SQL数据操纵语言（DML）语句，比如INSERT ， UPDATE或DELETE ; 或者不返回任何内容的SQL语句，例如DDL语句。

#### 7 javax.sql 

##### DataSource/接口 

> javax.sql.DataSource数据库连接池

成员方法：

 *  `default ConnectionBuilder createConnectionBuilder()`：创建一个新的 ConnectionBuilder实例。
 *  `Connection getConnection()`：尝试与此 DataSource对象表示的数据源建立连接。
 *  `Connection getConnection(String username, String password)`：尝试与此 DataSource对象表示的数据源建立连接。

### 其他API 

#### \*1 com.mchange.v2.c3p0 

##### ComboPooledDataSource 

> com.mchange.v2.c3p0.ComboPooledDataSource 数据库连接池对象（需C3P0包c3p0-0.9.5.2.jar导入）

构造方法：

 *  `ComboPooledDataSource()`：
 *  `ComboPooledDataSource(String configName)`：
 *  `ComboPooledDataSource(boolean autoregister)`：

成员方法：

 *  继承了DataSource
 *  `private void writeObject(ObjectOutputStream oos)`：
 *  `private void readObject(ObjectInputStream ois)`：
 *  `ClassNotFoundException`：

#### \*2 com.alibaba.druid.pool 

##### DruidDataSourceFactory 

> com.alibaba.druid.pool.DruidDataSourceFactory 数据库连接池工厂类（需从Druid包druid-1.0.9.jar导入）

成员方法：

 *  `protected DataSource createDataSourceInternal(Properties properties)`：
 *  `static DataSource createDataSource(Properties properties)`：获取连接池对象。
 *  `static DataSource createDataSource(Map properties)`：
 *  `static void config(DruidDataSource dataSource, Map properties)`：

#### \*3 org.springframework.jdbc.core 

##### JdbcTemplate 

> org.springframework.jdbc.core.JdbcTemplate 模板类(用Spring实现)

构造方法：

 *  `JdbcTemplate()`：
 *  `JdbcTemplate(DataSource dataSource)`：
 *  `JdbcTemplate(DataSource dataSource, boolean lazyInit)`：

成员方法：

 *  `update()`：方法可以完成插入、更新和删除数据的操作：
 *  `int update(String sql)`：该方法是最简单的update方法重载形式，它直接执行传入的SQL语句，并返回受影响的行数。
 *  `int update(PreparedStatementCreator psc)`：该方法执行从PreparedStatementCreator返回的语句，然后返回受影响的行数。
 *  `int update(String sql, PreparedStatementSetter pss)`：该方法通过PreparedStatementSetter设置SQL语句中的参数，返回受影响的行数。
 *  `int update(String sqlj, Object… args)`：该方法使用Object…设置SQL语句中的参数，要求参数不能为NULL，并返回受影响的行数。
 *  query()方法来处理各种对数据库表的查询操作，并将结果封装为JavaBean对象：
 *  `List query(String sql, RowMapper rowMapper)`：执行string类型参数提供的SQL句，并过RowMapper返回一个List类型的结果。
 *  `List query(String sql, PreparedStatementSetter pss, RowMapper rowMapper)`：根据String类型参数提供的SQL语句创建PreparedStatement对象，通过RowMapper将结果返回到List中。
 *  `List query(String sql, Object[] args, RowMapper rowMapper)`：使用Object\[\]的值来设置SQL中的参数值，采用RowMapper回调方法可以直接返回List类型的数据。
 *  `<T> T queryForObject(String sql, RowMapper rowMapper, Object… args)`：将args参数绑定到SQL语句中，并通过RowMapper返回一个Object类型的单行记录。//查询结果，将结果封装为对象。一般用于聚合函数的查询。
 *  `Map<String,Object> queryForMap(String sql, Object[] args, int[] argTypes)`：查询结果将结果集封装为map集合，将列名作为key，将值作为value 将这条记录封装为一个map集合。
   
    > 注意：这个方法查询的结果集长度只能是1。
 *  `<T> List<T> queryForList(String sql, Object[] args, class<T> elementType)`：该方法可以返回多行据的结果，但必须是返回列表，elementType参数返回的是List元素类型。//查询结果将结果集封装为list集合。
   
    > 注意：将每一条记录封装为一个Map集合，再将Map集合装载到List集合中。
    > 
    > RowMapper：一般我们使用BeanPropertyRowMapper实现类。可以完成数据到JavaBean的自动封装。
    > 
    > new BeanPropertyRowMapper<类型>(类型.class)

## 最后 

新人制作，如有错误，欢迎指出，感激不尽！ 欢迎关注公众号，会分享一些更日常的东西！ 如需转载，请标注出处！ ![pic_cfa1cc4a.png](https://mark.cuckooing.cn/pics/pic_cfa1cc4a.png)


[API]: #API_4
[JavaAPI]: #JavaAPI_14
[1 java.lang]: #1_javalang_16
[String]: #String_18
[StringBuilder]: #StringBuilder_89
[Integer]: #Integer_112
[parseXxx]: #parseXxx_148
[Math]: #Math_178
[Object]: #Object_225
[System]: #System_259
[Throwable]: #Throwable_289
[Thread]: #Thread_303
[Runnable]: #Runnable_328
[Class]: #ClassT_338
[reflect]: #reflect_384
[Field]: #Field_386
[Constructor]: #ConstructorT_400
[Method]: #Method_413
[ClassLoader]: #ClassLoader_426
[2 java.util]: #2_javautil_456
[Scanner]: #Scanner_458
[Obects]: #Obects_474
[Date]: #Date_486
[Calendar]: #Calendar_503
[Random]: #Random_533
[Link 1]: #_547
[Collection]: #Collection_549
[Iterator]: #Iterator_571
[List]: #List_582
[Arrays]: #Arrays_602
[ArrayList]: #ArrayList_620
[LinkedList]: #LinkedList_646
[Set]: #Set_680
[HashSet]: #HashSet_686
[LinkedHashSet]: #LinkedHashSet_692
[Collections]: #Collections_700
[Comparator]: #Comparator_722
[Comparable]: #ComparableT_734
[Map]: #MapT_754
[Map.Entry]: #MapEntry_783
[HashMap]: #HashMap_798
[LinkedHashMap]: #LinkedHashMap_806
[TreeMap]: #TreeMap_813
[Stack]: #Stack_881
[Queue]: #Queue_907
[PriorityQueue]: #PriorityQueue_932
[Deque]: #Deque__959
[Lock]: #Lock_990
[Executors]: #Executors_1001
[ExecutorService]: #ExecutorService_1009
[Properties]: #Properties_1023
[Supplier]: #Supplier_1055
[Consumer]: #Consumer_1067
[Predicate]: #Predicate_1081
[Function]: #Function_1101
[Stream]: #StreamT_1119
[3 java.text]: #3_javatext_1146
[DateFormat]: #DateFormat_1148
[4 java.io]: #4__javaio_1175
[File]: #File_1177
[Filter]: #Filter_1242
[OutputStream]: #OutputStream_1252
[FileOutputStream]: #FileOutputStream_1268
[InputStream]: #InputStream_1308
[FileInputStream]: #FileInputStream_1322
[Reader]: #Reader_1340
[FileReader]: #FileReader_1354
[Writer]: #Writer_1369
[FileWriter]: #FileWriter_1387
[BufferedOutputStream]: #BufferedOutputStream_1412
[BufferedInputStream]: #BufferedInputStream_1430
[BufferedWriter]: #BufferedWriter_1446
[BufferedReader]: #BufferedReader_1468
[OutputStreamWriter]: #OutputStreamWriter_1490
[InputStreamReader]: #InputStreamReader_1508
[ObjectOutputStream]: #ObjectOutputStream_1524
[ObjectInputStream]: #ObjectInputStream_1542
[PrintStream]: #PrintStream_1560
[5 java.net]: #5_javanet_1576
[Socket]: #Socket_1578
[ServerSocket]: #ServerSocket_1601
[6 java.sql]: #6_javasql_1619
[DriverManager]: #DriverManager_1621
[Connection]: #Connection_1641
[Statement]: #Statement_1662
[ResultSet]: #ResultSet_1682
[PreparedStatement]: #PreparedStatement_1702
[7 javax.sql]: #7_javaxsql_1722
[DataSource]: #DataSource_1724
[API 1]: #API_1740
[1 com.mchange.v2.c3p0]: #1_commchangev2c3p0_1742
[ComboPooledDataSource]: #ComboPooledDataSource_1744
[2 com.alibaba.druid.pool]: #2_comalibabadruidpool_1765
[DruidDataSourceFactory]: #DruidDataSourceFactory_1767
[3 org.springframework.jdbc.core]: #3_orgspringframeworkjdbccore_1782
[JdbcTemplate]: #JdbcTemplate_1784
[Link 2]: #_1827
[WIKI]: https://iowiki.com/java/lang/
[Link 3]: https://www.matools.com/api