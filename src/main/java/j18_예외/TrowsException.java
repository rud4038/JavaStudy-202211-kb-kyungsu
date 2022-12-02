package j18_예외;

public class TrowsException {
	
	//throws Exception 걸어주면 예외 처리 항상 해야함 (순서를 뒤로 밀어줌)
	public static void printArray(int[] numbers) throws Exception{
		for(int i = 0; i < 6; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public static void main(String[] args)  {
		int[] nums = new int[] {1, 2, 3, 4, 5};
		
		try {
			printArray(nums);
		} catch (Exception e ) {
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}
	

}
