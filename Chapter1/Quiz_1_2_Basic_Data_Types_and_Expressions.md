## 1.2 Basic Data Types and Expressions
### 1.在Java程序中，下面哪个是不合法的标志符（A）</br>
A)2D   </br>
B)True  </br>
C)_name  </br>
D)T1</br>
解析：标识符的第一个字符必须是下列字符之一：大写字母 (A-Z)、小写字母 (a-z)、下划线(_)、美元符号 ($)。而标识符的第二个字符及后继字符必须是：上述列表中的任意字符、数字字符 (0-9)</br>

### 2.以下哪些变量的声明是合法的(C)</br>
(1)	try</br>
(2)	_try1231</br>
(3)	$Try_\*</br>
(4)	4_try</br>
(5)	#_try</br>
(6)	$try_1_for</br>
A.(1)(2)(3) </br>
B.(1)(2)(4) </br>
C.(2)(6) </br>
D.(1)(2)(6)</br>
解析：(1)try是保留字，(3)含有非法字符"*" (4)以数字开头 (5)含有非法字符#

### 3.下列（B）不属于Java的基本数据类型</br>
A)int   </br>
B)String  </br>
C)double </br>  
D)boolean</br>

### 4.Sytem.out.println(“1”+2)打印到屏幕的结果是：(B)</br>
A)3   </br>
B)12  </br>
C)1+2 </br> 
D)4</br>

### 5.下面（A）是不合法的变量名称</br>
A)While-true  </br>
B)True   </br>
C)Name  </br>
D)T1</br>

### 6.在某个main()方法中有以下代码：</br>
String s1,s2;</br>
int[] numbers;</br>
int num;</br>
num=15;</br>
boolean b=false;</br>
下面哪个说法是正确的（C）</br>
A)声明了1个基本类型变量和2个引用变量</br> 
B)声明了2个基本类型变量和2个引用变量 </br>
C)声明了2个基本类型变量和3个引用变量 </br>
D)声明了3个基本类型变量和3个引用变量</br>

### 7.关于java中变量或者常量的说法正确的是(B)</br>
（1）	常量一旦被初始化就不能被改变。</br>
（2）	变量是由一个标识符命名的量</br>
（3）	变量的值可以改变</br>
（4）	常量的值可以被改变</br>
（5）	变量可以不存在类型</br>
A.（1）（2）（3）（4） </br>
B.（1）（2）（3） </br>
C.（2）（3）（4） </br>
D.（1）（2）（4）（5）</br>

### 8.关于数据类型的声明，以下声明正确的是(B)</br>
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

### 9.如果想要文字量的的实际内容是 “I’m very interested in java Programming” （包含””），以下文字量声明正确的是(C)</br>
A)string str = “I’m very interested in java Programming” </br>
B)string str = \“I\’m very interested in java Programming\” </br>
C)string str = “\“I\’m very interested in java Programming\”” </br>
D)string str = “I\’m very interested in java Programming”</br>

### 10.变量i的值为4，下列操作能够得到变量a的值为3的是(C)</br>
（1）	a = i--</br>
（2）	a = --i</br>
（3）	a = 15%4</br>
（4）	a = 14 / 4</br>
（5）	a = (i^=7)</br>
A.（1）（2）（3）（4）（5）</br> 
B.（1）（3）（4）（5） </br>
C.（2）（3）（4）（5） </br>
D.（2）（3）（4）</br>

### 11.某个main()方法中有以下声明：</br>
final int min = 0;</br>
final int max = 10;</br>
int num=5;</br>
下列哪个语句可以用来表示“num的值大于等于min且小于等于max”（B）</br>
A.!( num < min && num > max) </br>
B.num >=min && num <=max </br>
C.num > min || num <=max </br>
D.num >=min || num<=max</br>

### 12.下面不属于Java中的位操作符的是(D)</br>
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

### 13.以下哪段代码可以将A,B的值互换（A）</br>
A)A=A^B; B=A^B; A=A^B </br>
B)A=A^B; A=A^B; B=A^B </br>
C)B=A^B; B=A^B; A=A^B </br>
D)B=A^B; A=A^B; A=A^B</br>

### 14.对于i=1，下列三目运算符的结果为10的是(A)</br>
A.(i &4) ==0 ? 10:9 </br>
B.(i^3) > 2? 10:9 </br>
C.(i>>2) >0 ? 10:9 </br>
D.((i | 10)) & 9 >10 ?10:9</br>

### 15.在以下转换中，分别属于哪种类型(B)</br>
int a=3; long b = a </br>
double a=3.1415926; float b = a;</br> 
int a=3; String b = a+"1";</br> 
float a=3.5; int b=(int)a </br>
A.(1)扩展转换(2)强制转换(3)隐含转换(4)窄化转换</br> 
B.(1)扩展转换(2)窄化转换(3)隐含转换(4)强制转换 </br>
C.(1)隐含转换(2)窄化转换(3)扩展转换(4)强制转换 </br>
D.(1)窄化转换(2)扩展转换(3)强制转换(4)隐含转换</br>
