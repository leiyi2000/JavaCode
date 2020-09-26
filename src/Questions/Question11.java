package Questions;

/*
* 11、求1到100之间的所有整数的和。（易）
* */


public class Question11 {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;

        for (int i = 1; i < n + 1; i++) {
            sum += i;
        }

        System.out.println("1-100的和为: "+ sum);
    }
}
