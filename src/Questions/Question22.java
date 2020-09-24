package Question;

import java.util.Scanner;

/*
*输入整数， 0结束，求出总和和平均值
* */
public class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, length = 0;

        while (num != 0){
            sum += num;
            ++length;
            num = sc.nextInt();
        }

        System.out.println("总数: "+sum+" ,平均数: "+sum / length);
    }
}
