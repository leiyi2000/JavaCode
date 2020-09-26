package Questions;

/*
* 17.求10的阶乘。（较易）
* */


public class Question17 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("10!="+ Factorial(10));
    }

    static int Factorial(int i) {
        return i == 0 || i == 1 ? 1 : i * Factorial(i - 1);
    }
}
