package j10_배열;

public class Array5 {

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 8, 9, 16, 17};
        int[] num2 = new int[]{2, 7, 10, 15, 18};
        int[] num3 = new int[]{3, 6, 11, 14, 19};
        int[] num4 = new int[]{4, 5, 12, 13, 20};

        int[] resultArray = new int[5]; // i번째 최소값만 뽑아서 넣는다.

        /*
        배열들 중 동인 인덱스에 위치한 값들 중 최소값들만 뽑아서 새로운 배열을 만든다.
         */

        for (int i = 0; i < num1.length; i++) {
            int min = num1[i];
            if(min > num2[i]) {
                min = num2[i];
                if (min > num3[i]) {
                    min = num3[i];
                    if (min > num4[i]) {
                        min = num4[i];
                    }

                } else if (min > num4[i]) {
                    min = num4[i];
                }

            }else if(min > num3[i]){
                min = num3[i];
                if(min > num4[i]){
                    min = num4[i];
                }

            } else if (min > num4[i]){
                min = num4[i];
            }
            resultArray[i] = min;

        }
        for(int i = 0; i < resultArray.length; i++){
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
