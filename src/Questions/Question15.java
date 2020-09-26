package Questions;

/*
* 15、打印100以内所有能被3整除的数，每5个数打印一行。（较难）
* */


public class Question15 {
    public static void main(String[] args) {
        int n = 100;
        int count = 1;

        while (n > 0){
            if(n % 3 == 0){
                ++count;
                System.out.print(n + " ");
            }

            if (count % 5 == 0){
                System.out.println();
                count = 1;
            }
            --n;
        }

    }
}
