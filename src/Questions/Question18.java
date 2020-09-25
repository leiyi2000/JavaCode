package Questions;

/*
* 输出26个字母
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
