package j17_JSON;

import com.google.gson.annotations.Expose;

import lombok.Builder;
import lombok.Data;

/*
 * serialize (Object -> Json)바꿀 떄 true일 때 포함 false는 포함안함 (.excludeFieldsWithoutExposeAnnotation())있어야 쓸 수 있음   
 * deserialize (Json -> Object)바꿀 때 true일 때 포함 false는 포함안함
 * 
 */

@Data
@Builder
public class User {
	@Expose(serialize = true, deserialize = true)    
	private String username;
	@Expose(serialize = false, deserialize = false)             
	private String password;
	@Expose(serialize = true, deserialize = false)  
	private String name;
	@Expose(serialize = true, deserialize = true)  
	private String email;
}
