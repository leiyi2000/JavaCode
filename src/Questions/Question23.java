package Questions;

/*
* 求100以内的素数之和
* */

public class Question23 {
    public static void main(String[] args) {
        int n = 100, sum = 0;
        boolean flag = true;

        for (int i = 2; i < n + 1; i++) {
            for (int j = 2; j < (int)Math.sqrt(i) + 1; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            sum += flag ? i: 0;
            flag = true;
        }

        System.out.println(sum);
    }
}
