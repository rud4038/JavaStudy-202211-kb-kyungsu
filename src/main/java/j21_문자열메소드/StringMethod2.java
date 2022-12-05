package j21_문자열메소드;

public class StringMethod2 {
	
	public static void main(String[] args) {
		String roles = "ROLE_USER, ROLE_MANAGER, ROLE_ADMIN";
		
		String[] roleArray = new String[3];
		
		roleArray[0] = roles.substring(0, roles.indexOf(","));
		roleArray[1] = roles.substring(roles.indexOf(" ") + 1, roles.lastIndexOf(","));
		roleArray[2] = roles.substring(roles.lastIndexOf(" ") + 1);
		
		
		for(String str : roleArray) {
			System.out.println(str);
		}
		System.out.println();
		
		String[] roleArray2 = new String[3];
		
		String tempRoles = roles;
		roleArray2[0] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		tempRoles = tempRoles.substring(tempRoles.indexOf(",") + 2);
		roleArray2[1] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		tempRoles = tempRoles.substring(tempRoles.indexOf(",") + 2);
		roleArray2[2] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		
		
		for(String str : roleArray2) {
			System.out.println(str);
		}
		System.out.println();
		
		// split(문자) 문자기준으로 짤라서 배열안에 넣어준다.
		String[] roleArray3 = roles.split(", ");
		for(String role : roleArray2) {
			System.out.println(role);
		}

		
	}

}
