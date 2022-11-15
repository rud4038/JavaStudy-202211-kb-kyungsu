package j06_반복;

public class Loop2 {

    public static void main(String[] args) {
        /*

            2 x 1 = 2
            2 x 2 = 4
            2 x 3 = 6
            2 x 9 = 18

         */
        int dan = 2;
        System.out.println("[" + dan + "단]");
        for(int i = 0; i < 9; i ++) {
            int num = i + 1;
            System.out.println(dan + " x " + num + " = " + (dan * num));
        }
        for(int i = 0 ; i < 9; i++){
            int num = i + 2;
            if (num == 10){
                break;
            }
            System.out.println("[" + num + "단]");
            for(int j = 0; j < 9; j++){
                int num2 = j + 1;
                System.out.println(num + " x " + num2 + " = " + (num * num2));
            }
        }
    }
}
