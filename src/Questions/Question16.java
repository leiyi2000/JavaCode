package Questions;

/*
* 16、统计1000以内所有能被7整除的数的个数。（较易）
* */


public class Question16 {
    public static void main(String[] args) {
        int n = 1000;
        int num = 0;

        while (n > 0){
            num += n % 7 == 0 ? 1 : 0;
            --n;
        }

        System.out.println("1000以内所有能被7整除的数的个数: "+ num);
    }
}
