package Questions;
/*
*35、	打印图形
*
* */


public class Question35 {
    public static void main(String[] args) {
        char c = 'A';

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.printf("%c", c + i);
            }
            // 换行
            System.out.println();
        }
    }
}
