package j19_익명클래스;

/*
 * 인터페이스 생성 불가하니 익명클래스 생성해서 오버라이드 해서 사용
 * 익명클래스 이름이 없는 클래스
 * 
 * 
 * 람다 = 인터페이스 안에 추상메소드 하나만 존재해야 사용가능
 * 람다에 사용되는 인터페이스에는 @FunctionalInterface 달아준다
 * default 메소드의 경우는 가능함
 * 메소드 매개변소 하나면 ()생략가능
 * 
 */

public class CalcMain {
	
	public static void main(String[] args) {
		

		Calculatror c = new Calculatror() {
			
			@Override
			public int calc(int a, int b) {
				System.out.println("덧셈");
				return a + b;
			}
		};
		
		Calculatror c1 = (x, y) -> {
			System.out.println("2");
			System.out.println("2");
			System.out.println("2");
			System.out.println("2");
			System.out.println("2");
			
			return x + y;
			};
			
			
		CalculatrorSub cs = x -> x * x;
		System.out.println(cs.calc(10));
		System.out.println(cs.a());
		
		
		
		
		int r1 = c1.calc(10, 20);
		System.out.println(r1);
		
		Calculatror c2 = new Addition();

		int r2 = c2.calc(20, 30);
		System.out.println(r2);
		
	}

}
