package j15_제네릭;

public class InformationMain {

    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(20220001)
                .name("신경수")
                .build();
        Information<Student> studentInformation
                = new Information<Student>(student);

        studentInformation.printInfo();

        Teacher teacher = Teacher.builder()
                .teacherCode(20220002)
                .name("신경수2")
                .build();
        Information<Teacher> teacherInformation
                = new Information<Teacher>(teacher);
        teacherInformation.printInfo();


        Information2 i1 = new Information2(student);
        Information2 i2 = new Information2(teacher);

        System.out.println("학생이름: " + studentInformation.getTarget().getName());
        System.out.println("학생이름2: " + ((Student)i1.getTarget()).getName());
    }
}
