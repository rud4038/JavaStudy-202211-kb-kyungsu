package j19_익명클래스;


@FunctionalInterface
public interface Calculatror {
	
	public int  calc(int a, int b);
	
	public default int a() {
		return 10;
	}
	

}
