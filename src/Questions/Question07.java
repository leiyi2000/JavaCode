package Questions;

/*
* 7、求下列函数中y的值。（较易）
*   y=10     (x=0)
*   y=3x+5   (x>0)
*   y=x-2     (x<0)
* */


public class Question07 {
    public static void main(String[] args) {
        int x = 10;
        int y;

        if (x == 0){
            y = 10;
        }else if (x < 0){
            y = 3 * x + 5;
        } else {
            y = x - 2;
        }

        System.out.println("输入x: "+x +"\n结果y: "+y);
    }
}
