package Questions;
/*
* 30、打印九九乘法表，形式如下：（难）
* */


public class Question30 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d*%d=%-2d  ", i, j, i * j);
            }

            System.out.println();
        }
    }
}
