package Question;

/*
* 打印100以内的素数
* */
public class Question24 {
    public static void main(String[] args) {
        int n = 100;
        boolean flag = true;

        for (int i = 2; i < n + 1; i++) {
            for (int j = 2; j < (int)Math.sqrt(i) + 1; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag){
                System.out.print(i+" ");
            }

            flag = true;
        }
    }
}
