package j09_접근지정자.캡슐화;

public class StudentMain {

    public static void main(String[] args) {
        Student s1 = new Student("신경수", "남");
        s1.setName("d");
        s1.printInfo();
    }
}
