package Questions;

/*
* 统计1000内能被7整除的数的个数
* */
public class Question16 {
    public static void main(String[] args) {
        int n = 1000, num = 0;

        while (n > 0){
            num += n % 7 == 0 ? 1 : 0;
            --n;
        }

        System.out.println(num);
    }
}
