package Questions;
/*
* 47、	输入10个整数并按相反的顺序显示出来。（较难）
*
* */


import java.util.Scanner;

public class Question47 {
    public static void main(String[] args) {
        // 初始化数组
        int length = 10;
        int[] array = new int[length];
        Scanner sc = new Scanner(System.in);

        // 键盘输入数据保存到数组
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        // 反转数组输出
        for (int i = length - 1; i > -1 ; i--) {
            System.out.printf("%d ", array[i]);
        }

    }
}
