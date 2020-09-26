package Questions;

/*
* 求100以内的所有素数的和。（素数是一个大于1且只能被1和它本身整除的整数）
* */


public class Question23 {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;

        for (int i = 2; i < n + 1; i++) {
            sum += Question20.isPrimeNumber(i) ? i : 0;
        }

        System.out.println("100以内的所有素数的和: "+ sum);
    }
}
