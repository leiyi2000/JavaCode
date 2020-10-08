package Questions;
/*
*统计1000以内完全数的个数。
*（完全数：所有小于该数本身的因子之和等于该数本身，
* 例如6是一个完全数，因为，6=1+2+3）（难）
 */


public class Question29 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i < 1000; i++) {
            if(Question21.isPerfectNumber(i)){
                ++ count;
            }
        }

        System.out.println("1-1000内的完全数总个数为: "+ count);
    }
}
