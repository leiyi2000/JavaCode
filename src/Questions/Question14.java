package Questions;

/*
* 1000内能被5整除的数之和
* */
public class Question14 {
    public static void main(String[] args) {
        int n = 1000;
        int sum = 0;

        for (int i = 0; i < n ; i++) {
            sum += i % 5 == 0 ? i: 0;
        }

        System.out.println("1000内的能被5整除的和为："+ sum);
    }
}
