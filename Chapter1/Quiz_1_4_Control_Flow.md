# Chapter1: Basic Knowledge of Java</br>
## 1.4 Control Flow
### 1、if语句是Java程序中的哪种控制语句()
A)分支控制语句</br>
B)循环语句 </br>
C)跳转语句 </br>
D)终止语句</br>

### 2、下面哪种if语句不属于Java语言()
A)只有”if”的语句 </br>
B)只有”else”的语句 </br>
C)“if”-“else”语句 </br>
D)“if”-“else if”-“else”语句</br>

### 3、下面哪个条件运算的结果等价于简单的if-else语句() if(a > b) System.out.println(a); else System.out.println (b);
A)System.out.println((a>b):a?b);</br> 
B)System.out.println((a>b):b?a); </br>
C)System.out.println((a>b)?b:a); </br>
D)System.out.println((a>b)?a:b); </br>

### 4、下面哪种结构不属于Java的流程控制结构()
A)顺序结构 </br>
B)选择结构 </br>
C)循环结构 </br>
D)倒装结构</br>

### 5、下列不能作为switch表达式参数的数据类型是()
A)int </br>
B)char </br>
C)long </br>
D)short</br>

### 6、给定以下程序段，如下：
int i=0, j=-1;</br> 
switch(i) { </br>
case 0: j=1; </br>
case 2: j=2; </br>
default: j=5; </br>
} </br>
System.out.print("j="+j); 编译运行，正确的结果是()</br>
A)j=-1 </br>
B)j=1 </br>
C)j=2 </br>
D)j=5</br>

### 7、下面关于switch语句错误的是()
A)在同一个switch语句中，case后的值可以相同</br> 
B)没有break语句，也能编译运行 </br>
C)default语句可有可无 </br>
D)switch语句中表达式的值不能是String类型</br>

### 8、考查下面的程序代码：
int num1=40;</br> 
int num2=5; </br>
int ans=0; </br>
if(num1/5==num2) {ans=10; }</br> 
if(num2%5==0) {ans=20; } </br>
if(num2==0) {ans=30; } </br>
else {ans=40;} </br>
System.out.println("answer is:" + ans); 下面哪个是程序的输出结果()</br>
A)answer is: 30 </br>
B)answer is: 20 </br>
C)answer is: 10 </br>
D)answer is: 40</br>

### 9、假设 int x=4，y=100，下列语句的循环体共执行了多少次()
while(y/x>3) { </br>
  if(y%x>3) x=x +1; </br>
  else y=y/x; </br>
}</br>
A)1次 </br>
B)2次</br>
C)3次 </br>
D)4次</br>

### 10、以下程序段的输出结果是()
int i = 0; </br>
for(i=4; i>0; i--) {</br> 
  if(i==1) </br>
     break; </br>
     System.out.print(i); </br>
} </br>
System.out.print(i);</br>
A)4321 </br>
B)4322 </br>
C)321 </br>
D)432</br>
