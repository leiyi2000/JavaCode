package Questions;

/*
* 求10的阶乘
* */
public class Question17 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(Factorial(10));
    }

    static int Factorial(int i) {
        if (i == 0 || i == 1) {
            return 1;
        }
        return i * Factorial(i - 1);
    }
}
