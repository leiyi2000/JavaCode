package Questions;
/*
* 45、	猴子吃桃问题：
*       猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个；
*       第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零
*       一个。到第10天早上想再吃时，只剩下一个桃子了。求第一天共摘了多少？（很难）
*
* */


public class Question45 {
    public static void main(String[] args) {
        int sum = 1;

        for (int i = 10; i > 1; i--) {
            // x10 = x9 - x9/2 - 1
            sum = sum * 2 + 2;
        }
        System.out.println("第1天桃子数量: "+ sum);
    }
}
