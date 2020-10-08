package Questions;
/*
* 31、	打印九九乘法表，形式如下：（难）
* */


public class Question31 {
    public static void main(String[] args) {
        // 行
        for (int i = 1; i < 10; i++) {
            // 列
            for (int j = 1; j < i + 1; j++) {
                System.out.printf("%d*%d=%-2d  ", i, j, i * j);
            }
            // 换行
            System.out.println();
        }
    }
}
