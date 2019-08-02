package foo;

public class Computer {

	public String comp_hands(String start) {
		//ユーザから入力された文字列により起動
		switch (start) {
		//ユーザの手が何であれ正常値ならランダムにCPUの手を決定
		case "グー":
		case "チョキ":
		case "パー":
			int x = (int) ((Math.random() * (Const.handArr.length)));
			return Const.handArr[x];
		default:
			//ユーザが手以外やnullの時
			System.out.println("invaild hands.");
			return "Try Again!";

		}

	}

}
