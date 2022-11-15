package j03_연산자;

public class LeapMonth {
    public static void main(String[] args) {

        int year = 2000;

        String result = (year%4 == 0 && year%100 !=0 || year%400  == 0)  ? "윤달 입" : "윤달이 아닙";

        System.out.println(year + ": " + result + "니다.");
        int year2 = 1999;

        String result2 = (year2%4 == 0 && year2%100 !=0 || year2%400  == 0)  ? "윤달 입" : "윤달이 아닙";

        System.out.println(year2 + ": " + result2 + "니다.");

        /*
        윤달의 조건
        4의 배수 이고 100의 배수는 아니거나 400의 배수여야 윤달이다.
        2000: 윤달입니다.
        1999: 윤달이 아닙니다.
         */
    }
}
