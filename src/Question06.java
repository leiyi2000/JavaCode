/*
* 比较三个数的大小
* */

public class Question06 {
    public static void main(String[] args) {
        int x = 4, y = 5, z = 6;
        int answer = compare(x, compare(y, z));
        System.out.println(answer);
    }

    static int compare(int x, int y){
        return x > y ? x: y;
    }
}
