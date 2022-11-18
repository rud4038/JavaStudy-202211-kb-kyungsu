package j10_배열;

public class Array4 {

    public static int cmMin(int[] array1, int[] array2){
        int min = array2[0];
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    if(array1[i] < min){
                        min = array1[i];
                    }
                }
            }
        }



        return min;
    }

    public static int cmMax(int[] array1, int[] array2){
        int max = array1[0];
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i] != array2[j]){
                    if(array1[i] > max || array2[j] > max){
                        if(array1[i] > array2[j]) {
                            max = array1[i];
                        }else {
                            max = array2[j];
                        }
                    }
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int [] num1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] num2 = new int[] {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println(cmMin(num1, num2));
        System.out.println(cmMax(num1, num2));
        /*
        1. 두 배열에서 중복된 값 중 최소값
        2. 두 배열에서 중복되지 않은 값 중 최대값
         */
    }

}
