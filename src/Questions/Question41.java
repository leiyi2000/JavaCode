package Questions;
/*
* 41、	求下面数列的前20项的和：2/1、3/2、5/3、8/5、13/8。。。。（很难）
*
* */


public class Question41 {
    public static void main(String[] args) {
        double molecular = 2;   // 分子
        double denominator = 1;   // 分母
        double sum = 0.0; // 保存结果

        for (int i = 0; i < 20; i++) {
            sum += molecular / denominator;
            // 更新下一个分母同时记录一下分母
            double tmp = denominator;
            denominator = molecular;
            molecular += tmp;
        }

        System.out.printf("下面数列的前20项的和：2/1、3/2、5/3、8/5、13/8。。。。为: %.2f\n", sum);

    }
}
