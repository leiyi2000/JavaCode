package Questions;

/*
* 6、三个数比较大小，输出最大值。（较易）
* */


public class Question06 {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        int z = 6;

        int answer = compare(x, compare(y, z));

        System.out.println(x+"、"+ y+"、"+z+"中最大的是 "+answer);
    }

    static int compare(int x, int y){
        return x > y ? x: y;
    }
}
