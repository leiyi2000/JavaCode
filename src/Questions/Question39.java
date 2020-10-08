package Questions;
/*
* 39、	打印图形（很难）
*
* */


public class Question39 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i+=2) {
            // 记录左边空格数
            StringBuilder left = new StringBuilder();
            StringBuilder center = new StringBuilder();

            // 添加空格
            for (int j = 0; j < (9 - i) / 2; j++) {
                left.append(" ");
            }
            // 添加星星
            for (int j = 0; j < i; j++) {
                center.append("*");
            }

            System.out.println(left + center.toString() + left);
        }
    }
}
