package j07_메소드;

public class Method2 {
    /*
        메소드 오버로딩

     */

    public static void print(String name) {
        System.out.println("이름: " + name);

    }

    public static void print(int age) {
        System.out.println("나이: " + age);

    }

    public static void print(String name, int age) {
        System.out.println("이름: " + name + " 나이: " + age);

    }

    public static void main(String[] args) {

        print("신경수");
        print(29);
        print ("신경수", 29);
    }
}
