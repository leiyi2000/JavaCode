package Questions;

/*
*  2、将华氏温度转化成摄氏温度。
* 公式为：C=（5/9）*(F-32)，其中F为华氏温度，C为摄氏温度。
* 请根据给定的华氏温度输出对应的摄氏温度。（易）
* */


public class Question02 {
    public static void main(String[] args) {
        double f = 60.5;

        double c = 5.0 / 9.0 * (f - 32);

        System.out.printf("华氏温度为：%.2f\n", f);
        System.out.printf("摄氏温度为：%.2f\n", c);

    }
}
