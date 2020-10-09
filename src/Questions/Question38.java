package Questions;
/*
* 38、	打印图形（难）
*
* */


public class Question38 {
    public static void main(String[] args) {
        char c = 'A';

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.printf("%c", c);
            }
            // 换行
            System.out.println();
            // 更新输出的字符
            c += 1;
        }
    }
}
