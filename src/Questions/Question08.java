package Questions;

/*
* 8、判断某个整数是否为水仙花数。（
*    水仙花数是一个三位数，该数各位的立方和等于该数本身。
*    例如153是一个水仙花数，因为153 = 13 + 53 + 33）（较易）
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
