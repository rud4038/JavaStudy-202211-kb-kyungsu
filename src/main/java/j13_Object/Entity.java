package j13_Object;

import lombok.*;

import java.util.Objects;

@NoArgsConstructor   //기본생성자
@AllArgsConstructor  //전체생성자
//@Getter              // getter
//@Setter              // setter
//@EqualsAndHashCode   // equalsAndHashCode
//@ToString            // toString
@Data
public class Entity {

    private String name;
    private int age;
    private String address;

    public boolean cmp(){
        return this.getClass() == Entity.class;
    }
}
