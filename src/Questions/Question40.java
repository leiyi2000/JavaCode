package Questions;
/*
* 40、	打印金字塔数字图形
*
* */


public class Question40 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            // 输出空格
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            // 输出数字
            for (int j = 0; j < 2*i - 1; j++) {
                System.out.printf("%d", i);
            }
            // 输出空格
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            // 换行
            System.out.println();
        }
    }
}
