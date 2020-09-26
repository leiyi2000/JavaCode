package Questions;

/*
* 打印100以内的所有素数。（素数是一个大于1且只能被1和它本身整除的整数）
* */


public class Question24 {
    public static void main(String[] args) {
        int n = 100;
        boolean flag = true;

        for (int i = 2; i < n + 1; i++) {
            if (Question20.isPrimeNumber(i)){
                System.out.print(i +" ");
            }
        }
    }
}
