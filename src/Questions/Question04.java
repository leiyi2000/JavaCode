package Questions;

/*
* 4、已知圆的半径，求圆的面积。（易）
* */


public class Question04 {
    public static void main(String[] args) {
        double r = 10.0;

        double s = Math.PI * r * r;

        System.out.println("圆的半径为: "+r);
        System.out.printf("圆的面积: %.2f", s);
    }
}
