package j08_클래스;

public class PhoneMain {

    public static void main(String[] args) {
        int i = 0;
        Phone iPhone14 = new Phone();
        Phone galaxyS22 = new Phone("Samsung", "GalaxyS22");
        System.out.println(iPhone14);
        System.out.println(galaxyS22);

        iPhone14.company = "Apple";


        iPhone14.printPhoneCompany();
        iPhone14.printPhoneModel();

        galaxyS22.printPhoneCompany();
        galaxyS22.printPhoneModel();

    }

}
/*

    Class: Student, StudentMain
    학생정보
    String school(학교명)
    String name(학생이름)
    int studentYear(학년)
    boolean gender(성별 true = 남, false = 여)

    showStudentInfo(){
      학교명: 부산대학교
      이름: 홍길동
      학년: 3
      성별: 남
 */