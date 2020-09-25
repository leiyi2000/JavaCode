package Questions;

/*
* 10、根据某同学的成绩，判定其成绩的等级。
*    （90~100分为“优秀”，80~89为“良好”，70~79为“中等”，
*     60~69为“及格”，60分以下为“不及格”。）（较易）
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
            default: s = "不及格";
        }

        System.out.println(s);
    }
}
