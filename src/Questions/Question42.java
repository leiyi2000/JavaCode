package Questions;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

/*
 * 42、	求s=a+aa+aaa+aaaa+a...aa的值。其中a是接收键盘输入的1~9中的某个数字。
 *       几个数相加是通过接收键盘输入的一个n来确定。
 *       例如：输入2，5按回车则就是求2+22+222+2222+22222的值。
 *
 * */


public class Question42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 初始化输入对象
        int number = sc.nextInt();  // 记录数
        int count = sc.nextInt();   // 记录次数

        System.out.println("输入: "+ number+ ","+ count+ "\n输出: "+ solve(number, count));
    }

    public static int solve(int number, int count){
        return count == 0 ? 0: number + solve(number * 10 + number % 10, --count);
    }
}
