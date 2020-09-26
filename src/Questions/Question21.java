package Questions;

/*
* 21、判断某个数是否为完全数。（完全数：所有小于该数本身的因子之和等于该数本身，例如6是一个完全数，因为，6=1+2+3）（较难）
* */


public class Question21 {
    public static void main(String[] args) {
        int num = 8128;
        int tmp = 1;

        for (int i = 2; i < (int)(Math.sqrt(num)) + 1; i++) {
            if (num % i == 0){
                tmp += i;
                tmp += num / i;
            }
        }

        if (num != 1 && tmp == num){
            System.out.println(num + "是完全数");
        } else {
            System.out.println(num + "不是完全数");
        }

    }

}
