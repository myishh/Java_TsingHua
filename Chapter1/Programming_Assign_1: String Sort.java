/*
字符串排序(Sort Strings)
用Java编写一个能对一组字符串按字典序升序排序的程序 输入为N和N行字符串，需要按行输出字符串升序排序的结果 如输入
3
Abc
Abe
Abd
输出：
Abc
Abd
Abe
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {

        public static void main(String[] args) {
                
                List<String> list = new ArrayList<>();
                Scanner sc = null;
                sc= new Scanner(System.in);
                int num = sc.nextInt();
//              System.out.println("Enter strings: ");
                for(int i = 0; i < num; i++)        {
                        sc = new Scanner(System.in);
                        String str = sc.nextLine();
                        list.add(str);       
                }
                sc.close();
                
                //核心部分(Core part of this code)
                Collections.sort(list, new Comparator<String>() {

                        @Override
                        public int compare(String arg0, String arg1) {
                                return arg0.compareTo(arg1);
                        }        
                });
                //output sorted strings
                for(String str1 : list) {
                        System.out.println(str1);
                }
        }
}

/*总结
这里使用的是Collections.sort()函数实现排序。函数内部，重写了compare()函数，compare()则直接调用compareTo()方法。compareTo()是String类自带的
方法，原理是比较两个char或string的unicode值，arg0.compareTo(arg1)是用arg1的值减去arg0的值，由于Unicode排序中'A'是65，'Z'是91，'a'是97，'z'
是123，所以如果是同一个字母只是大小写不一样，且arg0是小写，arg1是大写，则arg0.compareTo(arg1)会返回一个负值32。

java中的compareto方法，返回参与比较的前后两个字符串的asc码的差值，看下面一组代码
String a="a",b="b";
System.out.println(a.compareto.b);
则输出-1；
若a="a",b="a"则输出0；
若a="b",b="a"则输出1；
 
单个字符这样比较，若字符串比较长呢？？
若a="ab",b="b",则输出-1；
若a="abcdef",b="b"则输出-1；
也就是说，如果两个字符串首字母不同，则该方法返回首字母的asc码的差值；
 
如果首字母相同呢？？
若a="ab",b="a",输出1；
若a="abcdef",b="a"输出5；
若a="abcdef",b="abc"输出3；
若a="abcdef",b="ace"输出-1；
即参与比较的两个字符串如果首字符相同，则比较下一个字符，直到有不同的为止，返回该不同的字符的asc码差值，如果两个字符串不一样长，可以参与比较的字符又完全一样，则返回两个字符串的长度差值
*/
