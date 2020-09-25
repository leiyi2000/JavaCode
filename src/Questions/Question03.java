package Questions;

/*
* 3、根据观察，蟋蟀的名叫频率与温度有关，
*    具体的公式为T=（c+40）/10.其中，c代表蟋蟀每分钟鸣叫数，
*    T代表华氏温度。请根据蟋蟀每分钟的鸣叫数输出相应的华氏温度。（易）
* */


public class Question03 {
    public static void main(String[] args) {
        int c = 100;

        double t = (c + 40) / 10.0;

        System.out.printf("华氏温度: %.2f\n", t);
    }
}
