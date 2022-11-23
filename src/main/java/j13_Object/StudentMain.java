package j13_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentMain {

    public static void print(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Student student = new Student(2022001, "신경수");
        Student student2 = new Student(2022001, "신경수");

        System.out.println(student.toString());

        System.out.println(student2);

        System.out.println(student == student2);
        System.out.println(student.equals(student2));

        print(student);

        System.out.println(student.hashCode() == student2.hashCode());
        System.out.println(student2.hashCode());

        Class c = student.getClass();
        System.out.println(c);
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());

        Field[] fields = c.getDeclaredFields();
        for(int i = 0; i < fields.length; i++){
            System.out.println(fields[i].getName());
        }

        Method[] methods = c.getDeclaredMethods();
        for(int i = 0; i < methods.length; i++){
            System.out.println(methods[i].getName());
        }


    }
}
