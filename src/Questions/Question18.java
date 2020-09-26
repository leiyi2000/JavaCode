package Questions;

/*
* 18、输出26个小写英文字母。（易）
* */


public class Question18 {
    public static void main(String[] args) {
        char c = 'a';

        while (c < 'z' + 1){
            System.out.print(c + " ");
            ++c;
        }
    }
}
