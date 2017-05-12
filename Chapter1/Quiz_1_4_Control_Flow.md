# Chapter1: Basic Knowledge of Java</br>
## 1.4 Control Flow
### 1、if语句是Java程序中的哪种控制语句()
A)分支控制语句 
B)循环语句 
C)跳转语句 
D)终止语句

### 2、下面哪种if语句不属于Java语言()
A)只有”if”的语句 
B)只有”else”的语句 
C)“if”-“else”语句 
D)“if”-“else if”-“else”语句

### 3、下面哪个条件运算的结果等价于简单的if-else语句() if(a > b) System.out.println(a); else System.out.println (b);
A)System.out.println((a>b):a?b); 
B)System.out.println((a>b):b?a); 
C)System.out.println((a>b)?b:a); 
D)System.out.println((a>b)?a:b); 

### 4、下面哪种结构不属于Java的流程控制结构()
A)顺序结构 
B)选择结构 
C)循环结构 
D)倒装结构

### 5、下列不能作为switch表达式参数的数据类型是()
A)int 
B)char 
C)long 
D)short

### 6、给定以下程序段，如下：
int i=0, j=-1; 
switch(i) { 
case 0: j=1; 
case 2: j=2; 
default: j=5; 
} 
System.out.print("j="+j); 编译运行，正确的结果是()
A)j=-1 
B)j=1 
C)j=2 
D)j=5

### 7、下面关于switch语句错误的是()
A)在同一个switch语句中，case后的值可以相同 
B)没有break语句，也能编译运行 
C)default语句可有可无 
D)switch语句中表达式的值不能是String类型

### 8、考查下面的程序代码：
int num1=40; 
int num2=5; 
int ans=0; 
if(num1/5==num2) {ans=10; } 
if(num2%5==0) {ans=20; } 
if(num2==0) {ans=30; } 
else {ans=40;} 
System.out.println("answer is:" + ans); 下面哪个是程序的输出结果()

A)answer is: 30 
B)answer is: 20 
C)answer is: 10 
D)answer is: 40

### 9、假设 int x=4，y=100，下列语句的循环体共执行了多少次()
while(y/x>3) { 
  if(y%x>3) x=x +1; 
  else y=y/x; 
}

A)1次 
B)2次
C)3次 
D)4次

### 10、以下程序段的输出结果是()
int i = 0; 
for(i=4; i>0; i--) { 
  if(i==1) 
     break; 
     System.out.print(i); 
} 
System.out.print(i);
A)4321 
B)4322 
C)321 
D)432
