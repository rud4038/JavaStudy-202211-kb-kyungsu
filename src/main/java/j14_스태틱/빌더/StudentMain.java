package j14_스태틱.빌더;

public class StudentMain {

    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(2022001)
                .name("신경수")
                .address("부산")
                .build();
        System.out.println(student);
    }
}
