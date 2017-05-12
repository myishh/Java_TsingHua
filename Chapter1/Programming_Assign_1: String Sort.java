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

