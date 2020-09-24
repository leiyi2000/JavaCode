/*
* 成绩分段
* */
public class Question10 {
    public static void main(String[] args) {
        int score = 89;
        String s = "";

        switch (score / 10){
            case 10:
            case 9: s = "优秀"; break;
            case 8: s = "良好"; break;
            case 7: s = "中等"; break;
            case 6: s = "及格"; break;
            default: s = "不及格"; break;
        }

        System.out.println(s);
    }
}
