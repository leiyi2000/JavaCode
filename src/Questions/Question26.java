package Questions;
/*
* 26、求前50个素数的和。（素数是一个大于1且只能被1和它本身整除的整数）（难）
* */


public class Question26 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 2, num = 0; num < 50; i++) {
            if (Question20.isPrimeNumber(i)){
                sum += i;
                ++num;
            }
        }

        System.out.println("前50个素数的和: "+ sum);
    }
}
