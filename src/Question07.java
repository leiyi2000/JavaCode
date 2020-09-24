/*
* 求分段函数的值
* */
public class Question07 {
    public static void main(String[] args) {
        int x = 10, y;

        if (x == 0){
            y = 10;
        }else if (x < 0){
            y = 3 * x + 5;
        }else {
            y = x - 2;
        }

        System.out.println(y);
    }
}
