package j20_함수형인터페이스;

public class Main1 {
	/*
	 * 하나의 프로그램 = 프로세서
	 * 프로세서 안에는 여려개의 스레드가 있다.
	 * 동기처리는 프로그램 순서대로 
	 * 스레드는 비동기처리다 ex) 스레드코드가 반복을 다 안돌아도 다음 프로그램을 실행 
	 * 멀티 스레드 = (여러가지 기능을 사용하게 해줌)스레드 객체를 사용할 때 부터, 병렬처리
	 * Thread = Runnable을 매개변수로 받음 
	 * Thread.start() = Runnable.run() 메소드를 실행시켜줌 
	 */
	
	public static void main(String[] args) {
		int a = 10;
		
		//Runnable = 매개변수 x 반환값 x(매개변수 안줘도 같은 클래스 변수를 사용가능함)
		Runnable application1 = () -> {
			System.out.println("프로그램을 시작합니다.");
			System.out.println("a:" + a);
		};
		
		application1.run();
		
		

		
		Thread t1 = new Thread(() ->{
			for(int i =0; i < 100; i++) {
				try {
					System.out.println("채팅기능");
					System.out.println(i+ " : " + (i + 1));
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(() ->{
			for(int i =0; i < 100; i++) {
				try {
					System.out.println("알림기능");
					System.out.println(i+ " : " + (i + 1));
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();

	}

}
