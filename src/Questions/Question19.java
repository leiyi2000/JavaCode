package Questions;

/*
* 输出1000以内的所有水仙花数。
* （水仙花数是一个三位数，该数各位的立方和等于该数本身。
* 例如153是一个水仙花数，因为153 = 13 + 53 + 33）
* */


public class Question19 {
    public static void main(String[] args) {
        int n = 1000;

        for (int i = 100; i < 1000; i++) {
            if (isDaffodils(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean isDaffodils(int num){
        int tmp = num;

        while (num != 0){
            tmp -= Math.pow(num % 10, 3);
            num /= 10;
        }

        return tmp == 0;
    }
}
