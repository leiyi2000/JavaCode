package Questions;

/*
* 1000内能被5整除的数之和
* */
public class Question14 {
    public static void main(String[] args) {
        int n = 1000, sum = 0;
        while (n > 0){
            sum += n;
            n -= 5;
        }
        System.out.println(sum);
    }
}
