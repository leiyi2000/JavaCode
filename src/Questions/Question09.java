package Questions;

/*
*9、判断某年是否为闰年。（
*   闰年的条件是：该年的年号能被4整除且不能被100整除，
*   或该年的年号能被400整除，则该年是闰年，否则不是闰年。）（较易）
* */


public class Question09 {
    public static void main(String[] args) {
        int year = 2020;
        boolean isLeapYear;

        isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        if (isLeapYear){
            System.out.println(year+"是闰年");
        }else {
            System.out.println(year+"不是闰年");
        }
    }
}
