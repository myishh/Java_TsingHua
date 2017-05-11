# Chapter1: Basic Knowledge of Java</br>
## 1.1 Introduction</br>
1.对于利用计算机程序求解实际问题的顺序是：</br>
（1）	利用机器进行求解</br>
（2）	用计算机语言表述问题</br>
（3）	将实际问题进行抽象</br>
Answer: (3) (2) (1)</br>

2.程序设计的发展历程按照发展顺序排序是：</br>
（1）汇编语言 （2）机器语言	（3）高级语言	（4）面向对象的高级语言</br>
Answer:（2）（1）（3）（4）

3.面向对象的主要思想是：</br>
将客观事物看作具有____和____的对象，通过抽象找出同一类对象的共同状态和行为，构成____。</br>
Answer: 状态，行为，类

4.面向对象技术给软件发展带来的益处有：</br>
（1）	一个设计好的类，可以在后续开发中被部分或者全部的重复使用</br>
（2）	每个类可以作为一个独立单元进行测试维护，大量代码来源于成熟可靠的类库，因此开发新程序时的新增代码明显减少，使程序更加可靠</br>
（3）	有利于提高用户对类的修改和数据的控制，使得开发更加便捷。</br>
Answer: (1) (2)

5.面向对象程序的基本特征是：</br>
（1）抽象和封装 （2）继承性（3）多态性</br>
Answer:（1）（2）（3）</br>

6.Java语言的特点是：</br>
（1）面向对象（2）安全性（3）操作平台无关性（4）多线程（5）内存管理</br>
Answer:（1）（2）（3）（4）（5）</br>

7.Java语言相比于C，C++的不同之处在于：</br>
（1）不支持指针（2）可以手动进行内存管理（3）Java编译器生成的代码与平台相关（4）自动对内存进行管理（5）Java编译器生成的字节码，只要是安装了Java的运行系统其程序就能在不同的处理器上执行</br>
Answer:（1）（4）（5）</br>

8.关于Java程序的执行过程，以下选项中，正确的是</br>
（1）编写.java程序（2）解释器对.java文件进行解释执行（3）编译器将.java文件编译成.class文件（4）解释器对.class文件进行解释执行</br>
Answer:（1）->（3）->（4）</br>

9.Java的主要优点是（BC）</br>
A.直接操作内存，功能强大 </br>
B.一次编译，到处运行 </br>
C.纯面向对象的语言 </br>
D.可以通过拖拽的方式快速开发用户界面</br>

10.下面有关JAVA代码安全性的叙述错误的是（A）</br>
A.字节码校验器加载查询执行所需的所有类 </br>
B.运行时由解释器执行代码</br>
C.运行时，字节码被加载，验证，然后在解释器中执行 </br>
D.类加载器通过分离本机文件系统的类和从网络导入的类增加安全性</br>
<b>Explaination: 校验器是校验用的，加载肯定是类加载器做的</b>。Java 程序运行的过程是这样的：类加载器（class loader）加载程序运行所需要的所有类，它通过区分本机文件系统的类和网络系统导入的类增加安全性，这可以限制任何的特洛伊木马程序，因为本机类总是先被加载，一旦所有的类被加载完，执行文件的内存划分就固定了，在这个时候特定的内存地址被分配给对应的符号引用，查找表（lookuo table）也被建立，由于内存划分发生在运行时，解释器在受限制的代码区增加保护防止未授权的访问；然后字节码校验器（byte code verifier）进行校验，主要执行下面的检查：类符合 JVM 规范的类文件格式，没有违反访问限制，代码没有造成堆栈的上溢或者下溢，所有操作代码的参数类型都是正确的，解释器在必要时通过运行时系统执行对底层硬件的合适调用。</br>

11.编译JAVA源程序文件时将产生相应的字节码文件，这些字节码文件的扩展名为（B）</br>
A.java </br>
B.class</br>
C.html </br>
D.exe</br>

12.下面说法正确的是（C）</br>
A.JAVA程序的源文件名称与主类的名称相同，后缀可为.java或者.txt</br> 
B.JDK的编译命令为java </br>
C.一个JAVA源程序编译后，可能产生几个字节码文件</br>
D.在DOS命令行下编译好字节码文件后，只需输入程序名即可运行该程序</br>

13.Java应用程序执行入口的main()方法返回类型是(B)</br>
A.int </br>
B.void</br>
C.boolean </br>
D.staic</br>

14.某Java程序的类定义如下：</br>
public class MyClass{}</br>
则该java源文件在存盘时其文件名应当为</br>
A.myclass.java </br>
B.MyClass.java </br>
C.MYCLASS.java </br>
D.MyClass.class</br>

15.设HelloWord的代码为：</br>
Class HelloWord{</br>
  public void main(String a[]){</br>
    System.out.println(“hello world”);</br>
  }</br>
}</br>
下面说法正确的是：(B)</br>
A.HelloWord.java无法通过编译，因为main方法的声明方式不对 </br>
B.HelloWord.java可以通过编译，但是运行该程序会出现异常，不会打印HelloWorld</br>
C.HelloWord.java可以通过编译，但是无法运行，因为该文件没有public类 </br>
D.HelloWorld.java可以通过编译并正常运行，结果输出hello world</br>

## 1.2 Basic Data Types and Expressions
1.在Java程序中，下面哪个是不合法的标志符（A）</br>
A.2D   B.True  C._name  D.T1</br>

2.以下哪些变量的声明是合法的：(C)</br>
(1)	try</br>
(2)	_try1231</br>
(3)	$Try_*</br>
(4)	4_try</br>
(5)	#_try</br>
(6)	$try_1_for</br>
A.（1）（2）（3） </br>
B.（1）（2）（4） </br>
C.（2）（6） </br>
D.（1）（2）（6）</br>

3.下列（B）不属于Java的基本数据类型</br>
A.int   B.String  C.double   D.boolean</br>

4.Sytem.out.println(“1”+2)打印到屏幕的结果是：(B)</br>
A.3   B.12  C.1+2  D.4</br>

5.下面（A）是不合法的变量名称</br>
A.While-true  B.True   C.Name  D.T1</br>

6.在某个main()方法中有以下代码：</br>
String s1,s2;</br>
int[] numbers;</br>
int num;</br>
num=15;</br>
boolean b=false;</br>
下面哪个说法是正确的（C）</br>
A.声明了1个基本类型变量和2个引用变量</br> 
B.声明了2个基本类型变量和2个引用变量 </br>
C.声明了2个基本类型变量和3个引用变量 </br>
D.声明了3个基本类型变量和3个引用变量</br>

7.关于java中变量或者常量的说法正确的是：(B)</br>
（1）	常量一旦被初始化就不能被改变。</br>
（2）	变量是由一个标识符命名的量</br>
（3）	变量的值可以改变</br>
（4）	常量的值可以被改变</br>
（5）	变量可以不存在类型</br>
A.（1）（2）（3）（4） </br>
B.（1）（2）（3） </br>
C.（2）（3）（4） </br>
D.（1）（2）（4）（5）</br>

8.关于数据类型的声明，以下声明正确的是：(B)</br>
（1）	byte a = 129</br>
（2）	long b = 129F</br>
（3）	float c = 1.234F</br>
（4）	short d = 1.2</br>
（5）	boolean e = true</br>
（6）	float f = 1.234D</br>
A.（1）（3）（4）（5） </br>
B.（3）（5） </br>
C.（2）（3）（6） </br>
D.（1）（5）（6）</br>

9.如果想要文字量的的实际内容是 “I’m very interested in java Programming” （包含””），以下文字量声明正确的是：(C)</br>
A.string str = “I’m very interested in java Programming” </br>
B.string str = \“I\’m very interested in java Programming\” </br>
C.string str = “\“I\’m very interested in java Programming\”” </br>
D.string str = “I\’m very interested in java Programming”</br>

10.变量i的值为4，下列操作能够得到变量a的值为3的是：(C)</br>
（1）	a = i--</br>
（2）	a = --i</br>
（3）	a = 15%4</br>
（4）	a = 14 / 4</br>
（5）	a = (i^=7)</br>
A.（1）（2）（3）（4）（5）</br> 
B.（1）（3）（4）（5） </br>
C.（2）（3）（4）（5） </br>
D.（2）（3）（4）</br>

11.某个main()方法中有以下声明：</br>
final int min = 0;</br>
final int max = 10;</br>
int num=5;</br>
下列哪个语句可以用来表示“num的值大于等于min且小于等于max”（B）</br>
A.!( num < min && num > max) </br>
B.num >=min && num <=max </br>
C.num > min || num <=max </br>
D.num >=min || num<=max</br>

12.下面不属于Java中的位操作符的是：(D)</br>
（1）	~</br>
（2）	&</br>
（3）	^</br>
（4）	<<</br>
（5）	>></br>
（6）	&&</br>
（7）	||</br>
（8）	|</br>
（9）	>>></br>
A.（1）（6）（7）（9）</br> 
B.（6）（7）（9） </br>
C.（2）（3）（6） </br>
D.（6）（7）</br>

13.以下哪段代码可以将A,B的值互换（A）</br>
A)A=A^B; B=A^B; A=A^B </br>
B)A=A^B; A=A^B; B=A^B </br>
C)B=A^B; B=A^B; A=A^B </br>
D)B=A^B; A=A^B; A=A^B</br>

14.对于i=1，下列三目运算符的结果为10的是：(A)</br>
A.(i &4) ==0 ? 10:9 </br>
B.(i^3) > 2? 10:9 </br>
C.(i>>2) >0 ? 10:9 </br>
D.((i | 10)) & 9 >10 ?10:9</br>

15.在以下转换中，分别属于哪种类型:(B)</br>
int a=3; long b = a </br>
double a=3.1415926; float b = a;</br> 
int a=3; String b = a+"1";</br> 
float a=3.5; int b=(int)a </br>
A.(1)扩展转换(2)强制转换(3)隐含转换(4)窄化转换</br> 
B.(1)扩展转换(2)窄化转换(3)隐含转换(4)强制转换 </br>
C.(1)隐含转换(2)窄化转换(3)扩展转换(4)强制转换 </br>
D.(1)窄化转换(2)扩展转换(3)强制转换(4)隐含转换</br>
