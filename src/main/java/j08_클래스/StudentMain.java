package j08_클래스;

public class StudentMain {

    public static void main(String[] args) {

        Student student = new Student("부산대학교", "홍길동", 3, true);
        Student student2 = new Student();
        student2.school = "부산대학교";
        student2.name = "홍길동";
        student2.studentYear = 3;
        student2.gender = false;

        student.showStudentInfo();
        student2.showStudentInfo();

    }
}