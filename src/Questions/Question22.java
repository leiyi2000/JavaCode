package Questions;

import java.util.Scanner;

/*
* 22、编写程序读入整数并求它们的总和与平均值。输入0时程序结束。（较难）
* */


public class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        double length = 0;

        while (num != 0){
            sum += num;
            ++length;
            num = sc.nextInt();
        }

        System.out.println("总数: "+sum+" ,平均数: "+sum / length);
    }
}
