package j15_제네릭;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Teacher {
    private int teacherCode;
    private String name;
}
