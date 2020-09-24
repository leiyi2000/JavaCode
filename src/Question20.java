/*
* 判断一个数是否是素数
* */
public class Question20 {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(14));
    }

    static boolean isPrimeNumber(int num){
        boolean isPrime = true;
        for (int i = 2; i < (int) (Math.sqrt(num)) + 1; i++) {
            if (num % i == 0){
                isPrime = false;
            }
        }

        return isPrime;
    }
}
