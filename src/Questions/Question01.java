package Questions;

/*
* 编程实现两个整数交换位置，例如：int x = 6,y = 9，
* 交换后 x = 9，y = 6。（易）
* */

public class Question01 {
    public static void main(String[] args) {
        int x = 6;
        int y = 9;
        int tmp;

        System.out.println("交换前 "+"x: "+x+" y: "+y);
        tmp = x;
        x = y;
        y = tmp;
        System.out.println("交换后 "+"x: "+x+" y: "+y);
    }
}
