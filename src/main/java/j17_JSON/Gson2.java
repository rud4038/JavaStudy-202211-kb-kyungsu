package j17_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {
	
	public static void main(String[] args) {
		
		User user = User.builder()
				.username("kyungsu")
				.password("1234")
				.name("신경수")
//				.email("ddd@naver.com")
				.build();
		
		System.out.println(user);
		
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.serializeNulls()    // null값을 넣고 싶을 때
				.excludeFieldsWithoutExposeAnnotation()
				.create();
		
		String userJson = gson.toJson(user);
		System.out.println(userJson);
		
		User userObj = null;
		userObj = gson.fromJson(userJson, User.class);
		
		System.out.println(userObj);
		
	}

}
