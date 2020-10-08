package Questions;
/*
*   50、编写程序，判断用户输入的字符串是否为回文串。
*  （提示：回文字符串是具有回文特性的字符串：即该字符串从左向右读和从右向左读一样，如12321）
*
* */

import java.util.Scanner;


public class Question50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        // 输入判断的字符串
        str = sc.nextLine();

        System.out.println(str+ "是否为回文数: " + isPalindrome(str));
    }

    // 判断字符串是否是回文数
    public static boolean isPalindrome(String str){
        // 双向指针
        for (int start = 0, end = str.length() - 1; start < end; start++, end--) {
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
        }

        return true;
    }
}
