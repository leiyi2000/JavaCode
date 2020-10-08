package Questions;

/*
*28、打印1000以内的完全数。
*    （完全数：所有小于该数本身的因子之和等于该数本身，例如6是一个完全数，
*    因为，6=1+2+3）（难）
 */


public class Question28 {
    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++) {
            if(Question21.isPerfectNumber(i)){
                System.out.print(i+ " ");
            }

        }
    }
}
