package foo;

public class EntryPoint {
	static Const c = new Const();

	public static void main(String[] args) {
		System.out.println(c.getMsg1() +
				c.getMsg6() +
				c.getMsg2() +
				">");
		nil();
	}

	public static void nil() {
		User usr = new User();
		Computer cp = new Computer();
		String[] hand = new String[3];

		hand[0] = usr.user_hands();
		assert hand[0] !=null :"ガッ";
		//UserHandメソッドで取得したユーザの手を取得

		hand[1] = cp.comp_hands(hand[0]);
		System.out.println(c.getMsg4() + hand[1]);
		analize(hand[0], hand[1]);
		//同時に文字列を勝敗判定メソッドへ送信
	}

	public static void analize(String getUser, String getComp) {
		switch(getUser) {
		case "グー":
			switch (getComp) {
			case "グー":
				System.out.println(Const.handArr[3]);
				break;
			case "チョキ":
				System.out.println(c.getMsg5() + "win!");
				break;
			case "パー":
				System.out.println(c.getMsg5() + "lose");
				break;
			}
			break;

		case "チョキ":
			switch (getComp) {
			case "グー":
				System.out.println(c.getMsg5() + "lose");
				break;
			case "チョキ":
				System.out.println(Const.handArr[3]);
				break;
			case "パー":
				System.out.println(c.getMsg5() + "win!");
				break;
			}
			break;
		case "パー":
			switch (getComp) {
			case "グー":
				System.out.println(c.getMsg5() + "win!");
				break;
			case "チョキ":
				System.out.println(c.getMsg5() + "lose");
				break;
			case "パー":
				System.out.println(Const.handArr[3]);
				break;
			}
			break;
		default:
			throw new NullPointerException();
		}
	}
}
