package j10_배열;

public class Array2 {

    public static void main(String[] args) {
        /*
        names라는 배열을 생성하고
        임지현,
        신경수
        고희주
        문승주
        장건녕
        위의 값을 순서대로 대입한다.
            이름1 : 임지현
            이름2 : 신경수
            이름3 : 고희주
            이름4 : 문승주
            이름5 : 장건녕

         */
        String[] str = new String[5];
        str[0] = "임지현";
        str[1] = "신경수";
        str[2] = "고희주";
        str[3] = "문승주";
        str[4] = "장건녕";

        for(int i =0; i < str.length; i++){
            System.out.println("이름"+ (i + 1)+ ": " + str[i]);
        }
    }


}
