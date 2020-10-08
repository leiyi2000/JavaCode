package Questions;

import java.util.Scanner;

/**
 * 49、	反向加密：输入任意长度的密码，输出反向的密码
 *
 */


public class Question49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        // 输入密码
        password = sc.nextLine();

        // 反向输出密码
        for (int i = password.length() - 1; i > -1; i--) {
            System.out.printf("%c", password.charAt(i));
        }
    }
}
