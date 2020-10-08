package Questions;
/*
* 48、	输入10个整数并按从小到大的顺序显示出来。（难）
*
* */


import java.util.Scanner;

public class Question48 {
    public static void main(String[] args) {
        int length = 10;
        int[] array = new int[length];
        Scanner sc = new Scanner(System.in);

        // 键盘输入数据保存到数组
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        // 排序输出
        for (int i: sort(array)) {
            System.out.printf("%d ", i);
        }

    }

    public static int[] sort(int[] array){
        int flag = 0;   // 记录交换次数
        // 冒泡排序输出
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                // 如果j-1 小于 j 就向上冒泡
                if (array[j-1] > array[j]){
                    // 交换
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                    // 记录交换次数
                    ++ flag;
                }
            }
            // 一次也没交换说明已经有序了
            if (flag == 0){
                return array;
            }else {
                // 重置记录
                flag = 0;
            }
        }
        return array;
    }
}
