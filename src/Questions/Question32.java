package Questions;
/*
* 32、	打印5行5列的星号图形（较易）
*
* */


public class Question32 {
    public static void main(String[] args) {
        // 打印星星
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            // 换行
            System.out.println();
        }
    }
}
