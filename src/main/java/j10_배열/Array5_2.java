package j10_배열;

public class Array5_2 {
    public static int getMinNumber(int num1, int num2){
        return num1 < num2 ? num1 : num2;
    }

    public static void main(String[] args) {

        int[] num1 = new int[]{1, 8, 9, 16, 17};
        int[] num2 = new int[]{2, 7, 10, 15, 18};
        int[] num3 = new int[]{3, 6, 11, 14, 19};
        int[] num4 = new int[]{4, 5, 12, 13, 20};

        int[] resultArray = new int[5];



        for(int i = 0; i < num1.length; i++){
            resultArray[i] = getMinNumber(getMinNumber(num1[i], num2[i]), getMinNumber(num3[i], num4[i]));
            System.out.println(resultArray[i]);
        }

        int min = resultArray[0];
        for(int i = 0; i < resultArray.length; i++){
            if(min > resultArray[i]){
                min = resultArray[i];
            }
        }
        System.out.println("최소값: " + min);
    }
}
