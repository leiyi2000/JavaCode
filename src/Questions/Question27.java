package Questions;
/*
* 求101-200内的素数，打印出来
* */
public class Question27 {
    public static void main(String[] args) {
        int start = 101;
        int end = 200;
        boolean flag = true;

        for (; start < end + 1; start++) {
            for (int i = 2; i < (int)Math.sqrt(start) + 1; i++) {
                if(start % i == 0){
                    flag = false;
                    break;
                }
            }

            if (flag){
                System.out.print(start + " ");
            }

            flag = true;
        }
    }
}
