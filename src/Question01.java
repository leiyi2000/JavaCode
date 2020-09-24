/*
* 交互两个数
* */
public class Question01 {
    public static void main(String[] args) {
        int x = 6, y = 9;
        int tmp = x;
        x = y;
        y = tmp;
        System.out.println("x: "+x+"\ny: "+y);
    }
}
