package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student(2022001, "이승아", 21));
        students.add(new Student(2022002, "김수현", 22));
        students.add(new Student(2022003, "문경원", 23));
        students.add(new Student(2022004, "홍지혜", 24));
        students.add(new Student(2022005, "고동현", 25));

        Student student3 = students.get(3);
        Student student2 = students.get(2);

        System.out.println(student3);
        System.out.println();

        //이름이 문경원인 학생의 나이를 26세로 바꾸세요.

        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getName().equals("문경원")){
                students.get(i).setAge(26);
                System.out.println(students.get(i));
                break;
            }
        }
        System.out.println();

        for (Student student : students) {
            if (student.getName().equals("문경원")) {
                student.setAge(26);
                System.out.println(student);
                break;
            }
        }
        System.out.println();

        //0번 인덱스 학생의 이름을 다음 인덱스의 학생 이름으로 변경
        //제일 마지막 인덱스의 학생 이름으로 0번 인덱스로 이동
        String str = students.get(0).getName();
        for(int i = 0; i < students.size(); i++){
            Student s = students.get(i);
            if(i < students.size() - 1){
                String s2 = students.get(i + 1).getName();
                s.setName(s2);
            }else{
                s.setName(str);
            }
        }


        for (Student student : students){
            System.out.println(student);
        }


    }
}
