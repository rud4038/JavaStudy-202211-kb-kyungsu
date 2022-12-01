package j18_예외;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class CustomException extends RuntimeException{

	private static final long serialVersionUID = 1L; //직렬화 때문에 하는거 없어도 됨 
	
	Map<String, String> errorMap;
	
	public CustomException() {
		super();
	}
	
	public CustomException(String message) {
		super(message);
	}
	
	public CustomException(Map<String, String> errorMap) {
		super();
		this.errorMap = errorMap;
	}
	
	public CustomException(String message, Map<String, String> errorMap) {
		super(message);
		this.errorMap = errorMap;
	}
	
	public void printErrorMap() {
		Objects.requireNonNull(errorMap); // errorMap이 null인 경우 nullPointException 실행해줌 밑에 실행안됨
		System.out.println(getMessage());
		for(Entry<String, String> entry : errorMap.entrySet()) {
			System.out.println(entry.getKey() + " >>>" + entry.getValue());
		}
		System.out.println();
	}
	
	

}
