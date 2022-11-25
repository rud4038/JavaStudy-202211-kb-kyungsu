package j15_제네릭;

public class ResponseMain {

    //<? extends x> => x를 상속받는 값들만 리턴 가능함 (x도 가능)
    //<? super student> => student 와 그 부모클래스만 리턴가능
    //<?> => 모든것들을 리턴 가능함
    public static CMRespDto<?> response(String msg, Object data) {
        return new CMRespDto<>(msg, data);
    }

    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(20220001)
                .name("신경수")
                .build();

        System.out.println(response("학생데이터 응답", student));
        System.out.println(response("student code error!!", "학번에 오류가 있습니다."));
    }

}
