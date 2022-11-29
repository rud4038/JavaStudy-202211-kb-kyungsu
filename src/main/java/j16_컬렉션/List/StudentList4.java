package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StudentList4 {

    public static void main(String[] args) {

        List<String> nameList = Arrays.asList(new String[]{"김준일", "김준이", "김준삼"});
        System.out.println(nameList);

        Object[] nameArray = nameList.toArray();

        System.out.println((String) nameArray[0]);


        List<Hobby> hl = Arrays.asList(new Hobby[] {
                new Hobby(1, "축구"),
                new Hobby(2, "농구"),
                new Hobby(3, "골프"),
                new Hobby(4, "음악감상")
        });

        Student2 s1 = Student2.builder()
                .studentId(2022001)
                .name("고동현")
                .age(21)
                .hobbyList(Arrays.asList(new Hobby[] {hl.get(0), hl.get(2)}))
                .build();


        Student2 s2 = Student2.builder()
                .studentId(2022002)
                .name("강동욱")
                .age(22)
                .hobbyList(Arrays.asList(new Hobby[] {hl.get(1), hl.get(3)}))
                .build();

        Student2 s3 = Student2.builder()
                .studentId(2022003)
                .name("정진호")
                .age(23)
                .hobbyList(Arrays.asList(new Hobby[] {hl.get(0), hl.get(3)}))
                .build();

        System.out.println(s1);

        List<Student2> sl = new ArrayList<Student2>();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);

        for(Student2 s : sl){
            System.out.println("<학생정보>");
            System.out.println(s);
            System.out.println("<" + s.getName() + "학생 취미>");
            for(Hobby h : s.getHobbyList()){
                System.out.println(h);
            }
            System.out.println();
        }





    }
}
