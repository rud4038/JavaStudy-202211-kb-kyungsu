package j13_Object;

public class StringTest {


    public static void main(String[] args) {
        String str = "A";
        String str2 = "A";
        String str3 = new String("A");

        System.out.println(str == str2);

        System.out.println(str.equals(str2));

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str == str3);

        System.out.println(str);

    }

}
