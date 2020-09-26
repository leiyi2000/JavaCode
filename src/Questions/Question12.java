package Questions;

/*
* 12、求1到100之间的所有奇数的和。（较易）
* */


public class Question12 {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;

        for (int i = 1; i < n + 1; i++) {
            sum += i % 2 == 1 ? i: 0;
        }

        System.out.println("1-100的奇数和为: " + sum);
    }
}
