package Questions;
/*
* 43、	一球从100米高度自由落下，每次落地后反跳回原高度的一半，再落下。求它在第10次落地时，共经过多少米？第10次反弹多高？
*
* */


public class Question43 {
    public static void main(String[] args) {
        double height = 100.0;
        double sum = 0.0;

        // 10次落地
        for (int i = 0; i < 10; i++) {
            // 落地的高度
            sum += height;
            // 下次起跳的路径
            height /= 2;
            // 起跳的高度
            sum += height;
        }

        System.out.println("第10次落地经历路程: "+ (sum - height));
        System.out.println("第10次反弹高度: "+ height);
    }
}
