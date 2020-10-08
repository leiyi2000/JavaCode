package Questions;
/*
* 46、	定义一个10个整数的数组，并输出该数组。（较易）
*
* */


public class Question46 {
    public static void main(String[] args) {
        // 初始化数组
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 输出数组
        for (int i: array) {
            System.out.printf("%d ", i);
        }
    }
}
