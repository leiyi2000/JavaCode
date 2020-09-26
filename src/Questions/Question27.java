package Questions;
/*
* 27、判断101~200之间有多少个素数，并输出所有素数。（素数是一个大于1且只能被1和它本身整除的整数）（难）
* */


public class Question27 {
    public static void main(String[] args) {
        int loc = 101;
        int end = 200;
        int count = 0;

        for (; loc < end + 1; loc++) {
            if (Question20.isPrimeNumber(loc)){
                System.out.print(loc+ " ");
                ++count;
            }
        }

        System.out.println('\n'+"101~200之间素数个数: "+ count);
    }
}
