package j10_배열;

import java.util.Random;

public class Array3 {

    public static int foundMinNumber(int[] numbers){
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i ++){
            if(min > numbers[i]){
                min = numbers[i];
            }
        }

        return min;
    }
    public static int foundMaxNumber(int[] numbers){
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i ++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }

        return max;
    }



    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt();
        int sum = 0;
        int[] randomArray = new int[10];

        for(int i = 0; i < randomArray.length; i++){
            while (true){
                int randomNumber = random.nextInt(10) + 1;
                int count = 0;
                for(int j = 0; j < randomArray.length; j++){
                    if(randomArray[j] == randomNumber){
                        count++;
                        break;
                    }
                }
                if(count == 0){
                    randomArray[i] = randomNumber;
                    break;
                }
            }
        }

        for(int i = 0; i < randomArray.length; i++){
            sum += randomArray[i];
        }
        for(int i = 0; i < randomArray.length; i++){
            if(i <randomArray.length -1) {
                System.out.print(randomArray[i] + ", ");
            }else{
                System.out.println(randomArray[i]);
            }
        }
        System.out.println("총합: "  + sum);

        System.out.println("최소값: " + foundMinNumber(randomArray));
        System.out.println("최대값: " + foundMaxNumber(randomArray));


        /*
            randomArray 배열을 생성(10)
            10,2,4,5,3,7,1
            총합: ??
         */
    }

}
