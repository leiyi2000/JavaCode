package Questions;

/*
* 20、判断某个数是否为素数。（素数是一个大于1且只能被1和它本身整除的整数）（较难）
* */


public class Question20 {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(14));
    }

    static boolean isPrimeNumber(int num){
        for (int i = 2; i < (int) (Math.sqrt(num)) + 1; i++) {
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }
}
