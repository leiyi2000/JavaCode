package Questions;

/*
 * 13、求1到100之间的所有偶数的和。（较易）
 * */


public class Question13 {
    public static void main(String[] args) {
        int n = 100 ;
        int sum = 0;

        for (int i = 1; i < n + 1; i++) {
            sum += i % 2 == 0 ? i: 0;
        }

        System.out.println("1-100的偶数和为: "+ sum);
    }
}