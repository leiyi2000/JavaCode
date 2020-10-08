package Questions;
/*
*44、	编程：桌上放了8袋花生，第1袋花生的数目是1颗，第2袋花生的数目是1*2颗，
*       第3袋花生的数目是1*2*3颗，以此类推，那么第N袋花生的数目是1*2*3*。。。*N颗，
*       但是其中的第6袋花生已经被人拿走，那么剩下的花生总数是多少？（很难）
*
* */


public class Question44 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 9; i++) {
            // 跳过第6袋
            if (i == 6){
                continue;
            }
            // 加
            sum += Question17.Factorial(i);
        }

        System.out.println("剩下的花生总数是: " + sum);
    }
}
