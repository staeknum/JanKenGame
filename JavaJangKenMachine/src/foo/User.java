package foo;

import java.util.Scanner;

public class User {

	public String user_hands() {
		//ユーザに手を要求。
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
	//	String str = "パー";
		sc.close();
		return str;
	}

}
