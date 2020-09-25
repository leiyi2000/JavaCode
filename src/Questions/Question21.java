package Questions;

/*
* 判断一个数是否是完全数
* */
public class Question21 {
    public static void main(String[] args) {
        int num = 8128, tmp = 0;

        for (int i = 2; i < (int)(Math.sqrt(num)) + 1; i++) {
            if (num % i == 0){
                tmp += i;
                tmp += num / i;
            }
        }
        ++tmp;

        if (tmp == num){
            System.out.println(num + "是完全数");
        }else {
            System.out.println(num + "不是完全数");
        }

    }

}
