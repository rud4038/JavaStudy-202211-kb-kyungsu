package j06_반복;

public class Loop3 {

    public static void main(String[] args) {
        /*
        1.
        *
        **
        ***
        ****
        *****
        2.
        *****
        ****
        ***
        **
        *
        3.
            *
           **
          ***
         ****
        *****
        4.
        *****
         ****
          ***
           **
            *
         */
        int n = 5 ;
        System.out.println("1.");
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("2.");
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n - i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("3.");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(n < j + i +2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println("4.");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n ; j++){
                if(n < 6 + j - i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
