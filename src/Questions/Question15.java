package Questions;

/*
* 100内能被3整除的数，每5个打印一行
* */
public class Question15 {
    public static void main(String[] args) {
        int n = 100, num = 0;
        while (n > 0){
            if(n % 3 == 0){
                ++num;
                if (num % 5 == 0){
                    System.out.println(n);
                }else {
                    System.out.print(n + " ");
                }
            }
            --n;
        }

    }
}
