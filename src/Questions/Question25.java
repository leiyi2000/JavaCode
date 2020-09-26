package Questions;

/*
* 25、打印100以内的所有素数，每5个数打印一行。（素数是一个大于1且只能被1和它本身整除的整数）（难）
* */


public class Question25 {
    public static void main(String[] args) {
        int n = 100;
        int count = 1;

        for (int i = 2; i < n + 1; i++) {
            if (Question20.isPrimeNumber(i)){
                System.out.print(i + " ");
                ++count;
            }

            if (count % 6 == 0){
                count = 1;
                System.out.println();
            }

        }
    }
}
