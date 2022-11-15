package j03_연산자;

public class Operation1 {
/*
    논리연산
    &&(AND) - 곱
    ||(OR)  - 합
    !(NOT)  - 부정

    true(1)
    false(0)

    true && true => true
    true && false => false

    true || true => true
    true || false => true
    false || false => false
    !(true && true) => false
 */
    public static void main(String[] args) {
        boolean a = 100 % 4 == 0;
        boolean b = false;
        System.out.println("<<<<< AND >>>>>");
        System.out.println(a && a);
        System.out.println(a && b);
        System.out.println(b && b);

        System.out.println("<<<<< OR >>>>>");
        System.out.println(a || a);
        System.out.println(a || b);
        System.out.println(b || b);


    }

}
