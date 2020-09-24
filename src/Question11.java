/*
* 求1-100数的和
* */
public class Question11 {
    public static void main(String[] args) {
        int n = 100, sum = 0;

        for (int i = 1; i < n + 1; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
