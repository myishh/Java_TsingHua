## 1.3 Arrays
### 1.关于Java中数组的说法正确的是:(B)</br>
（1）数组可以动态初始化</br>
（2）数组可以赋值给Object类型的对象</br>
（3）数组创建以后，其长度可以修改</br>
（4）数组可以调用Object类的所有方法</br>
A.(1)(2)(3)(4)</br>
B.(1)(2)(4) </br>
C.(2)(3)(4) </br>
D.(2)(4)</br>
Explaination: Length of array can not be changed or assigned after the array being created.</br>

### 2.对于数组的声明与使用，下列说法正确的是:(B)</br>
对于声明 String str[];</br>
（1）上述声明错误，声明必须指定数组元素的个数</br>
（2）上述声明正确，声明时，无须指定数组元素的格式</br>
（3）上述声明完成后，java就给str的数组元素分配了内存</br>
（4）上述声明完成后，java没给str的数组元素分配内存</br>
（5）上述声明完成后，数组名可以直接使用，给指定数组元素赋值</br>
（6）上述声明完成后，数组名不能直接使用，需要初始化后才能使用</br>
A.(1)(4)(6) </br>
B.(2)(4)(6)</br>
C.(1)(3)(6) </br>
D.(1)(4)(5)</br>

### 3.对于数组的使用，以下做法正确的是:(D)</br>
（1）	int a[]={1,2,3}</br>
（2）	int a[10]=new int[10]; a[10]=1;a[1]=1;</br>
（3）	int a[10]={1,”2”,3};</br>
（4）	int a[10]; a[1]=0</br>
A.(1)(2)(4) </br>
B.(1)(4) </br>
C.(1)(3)(4)</br> 
D.(1)</br>
解析：声明数组时无需指明数组元素的个数，也不为数组元素分配内存空间；所以等号左边的a[]中都不能有数字。等号右边的new a[]中可以有，也可以没有。</br>

### 4.关于二维数组的创建，以下做法正确的是：(B)</br>
（1）int a[][] =new int[4][5];</br>
（2）int a[][] =new int[4][]; a[0]=new int[10];a[1]=new int[20]; </br>
（3）int a[][]; a=new int[3][]; a[0]=new int[3]; a[1]={1,2};a[2]={1,2,3};</br>
A.(1)(2)(3) </br>
B.(1)(2) </br>
C.(1)(3) </br>
D.(1)</br>
解析：Array constants can only be used in initializers. 采用常量赋值给数组，必须是在初始化的时候</br>

### 5.关于下面的程序，哪个结论是正确的（）</br>
public class Test{</br>
  public static void main(String args[]){</br>
    int a[]=new int[5];</br>
    a.length = 10;</br>
    System.out.println(a.length)</br>
  }</br>
}</br>
A.程序可以通过编译并正常运行，输出结果为10 </br>
B.程序可以通过编译，并正常运行，输出结果为5</br> 
C.程序无法通过编译</br>
D.程序可以通过编译，但无法正常运行</br>
解析：数组一旦创建，长度不可以改变。Array length can not be assigned after creating.</br>

### 6.对于下列代码</br>
String str1=”java”;</br>
String str2=”java”;</br>
String str3 = new String(“java”);</br>
StringBuffer str4 = new StringBuffer(“java”);</br>
以下表达式的值为true的是（）</br>
A)str1==str2 </br>
B)str1==str4 </br>
C)str2==str3 </br>
D)str3==str4</br>
解析：StringBuffer不能跟String比较；采用不同形式创建的String即便内容一样，引用指向也不一样；但是采用同一方法创建的String，如果内容一样，则引用指向也是一样的（这么做估计是为了节省memory）</br>

### 7.下列声明二维数组的语句不合法的是（）</br>
A)char c[][] = new char[2][3]; </br>
B)char c[][]=new char[6][]; </br>
C)char[][] c= new char[3][3];</br> 
D)char [][] c = new char[][4]</br>
解析：对二维数组，列数（后面的[]）可以不指定，但是行数（前面的[]）必须指定！
