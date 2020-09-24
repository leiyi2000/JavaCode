/*
* 水仙花数
* */
public class Question08 {
    public static void main(String[] args) {
        int num = 153;
        int tmp = num;

        while (tmp != 0){
            num -= Math.pow(tmp % 10, 3);
            tmp /= 10;
        }
        if (num == 0){
            System.out.println("是水仙花数");
        }else {
            System.out.println("不是水仙花数");
        }
    }
}
