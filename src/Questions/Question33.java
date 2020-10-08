package Questions;
/*
* 33、	打印星号图形（较易）
*
* */



public class Question33 {
    public static void main(String[] args) {
        // 打印星星
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            // 换行
            System.out.println();
        }
    }
}
