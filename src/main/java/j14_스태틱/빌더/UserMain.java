package j14_스태틱.빌더;

public class UserMain {

    public static void main(String[] args) {
        User user = User.builder()
                .username("kyungsu")
                .password("1234")
                .email("mm")
                .name("신경수")
                .build();

        System.out.println(user);
    }


}
