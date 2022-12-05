package j21_문자열메소드;

public class StringMethod {
	
	public static void main(String[] args) {
		
		String name = "김준일김수현";
		
		System.out.println(name.length());
		
		// 문자의 위치 찾기
		
		System.out.println(name.indexOf("김"));
		System.out.println(name.indexOf("준"));
		
		//문자의 위치 뒤에서부터 찾기
		System.out.println(name.lastIndexOf("김"));
		
		char name1 = name.charAt(0);
		System.out.println(name1);
		
		char name2 = name.charAt(name.indexOf("준"));
		System.out.println(name2);
		
		// 문자 자르기
		
		String subName1 = name.substring(2);
		System.out.println(subName1);
		
		String nameJunil = "김준일";
		String nameStr = "김수현";
		
		System.out.println(name.substring(name.indexOf(nameJunil), name.indexOf(nameJunil) + nameJunil.length()));
		System.out.println(name.substring(name.indexOf(nameStr), name.indexOf(nameStr) + nameJunil.length()));
		
		String file = "C:/String.java";
		String fileName = file.substring(file.indexOf("/") + 1, file.indexOf("."));
		String extension = file.substring(file.indexOf(".") + 1);
		
		String fileName2 = file.substring("C:/".length(), file.lastIndexOf("."));
		
		System.out.println(fileName2);
		System.out.println(fileName);
		System.out.println(extension);

		
	}

}
