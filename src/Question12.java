/*
* 1-100奇数和
* */
public class Question12 {
    public static void main(String[] args) {
        int n = 100, sum = 0;
        for (int i = 1; i < n + 1; i++) {
            sum += i % 2 == 1 ? i: 0;
        }

        System.out.println(sum);
    }
}
