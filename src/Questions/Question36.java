package Questions;
/*
*36、	打印图形（较难）
*
* */


public class Question36 {
    public static void main(String[] args) {
        // 打印图形
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.printf("%d", j + 1);
            }
            // 换行
            System.out.println();
        }
    }
}
