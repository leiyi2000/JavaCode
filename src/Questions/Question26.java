package Question;
/*
* 求前50个素数合
* */
public class Question26 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        boolean flag = true;

        for (int i = 2; num < 50; i++) {
            for (int j = 2; j < (int)Math.sqrt(i) + 1; j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }

            if (flag){
                sum += i;
                ++num;
            }

            flag = true;
        }

        System.out.println(sum);
    }
}
