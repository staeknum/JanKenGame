package foo;

public class Const {
	private String msg1 = "GAME START";
	private String msg2 = "Please Input your hands.";
	private String msg3 = "Your hands Accept.";
	private String msg4 = "Computer hands is : ";
	private String msg5 = "You ";
	private String msg6 = "\n";
	final static String[] handArr = { "グー", "チョキ", "パー", "Drow" };
	private Computer cp;
	private User user;
	private String UserHand;
	private String CpuHand;
	private StringBuilder sb;

	public Const(String msg1, String msg2, String msg3, String msg4, String msg5, String msg6, String[] handArr,
			Computer cp, User user, String UserHand, String CpuHand, StringBuilder sb) {
		super();
		this.msg1 = msg1;
		this.msg2 = msg2;
		this.msg3 = msg3;
		this.msg4 = msg4;
		this.msg5 = msg5;
		this.msg6 = msg6;
		this.cp = cp;
		this.user = user;
		this.UserHand = UserHand;
		this.CpuHand = CpuHand;
		this.sb = sb;
	}

	public Const() {
		return;
	}

	public String getMsg1() {
		return msg1;
	}

	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}

	public String getMsg2() {
		return msg2;
	}

	public void setMsg2(String msg2) {
		this.msg2 = msg2;
	}

	public String getMsg3() {
		return msg3;
	}

	public void setMsg3(String msg3) {
		this.msg3 = msg3;
	}

	public String getMsg4() {
		return msg4;
	}

	public void setMsg4(String msg4) {
		this.msg4 = msg4;
	}

	public String getMsg5() {
		return msg5;
	}

	public void setMsg5(String msg5) {
		this.msg5 = msg5;
	}

	public String getMsg6() {
		return msg6;
	}

	public void setMsg6(String msg6) {
		this.msg6 = msg6;
	}


	public Computer getCp() {
		return cp;
	}

	public void setCp(Computer cp) {
		this.cp = cp;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUserHand() {
		return UserHand;
	}

	public void setUserHand(String getUserHand) {
		this.UserHand = getUserHand;
	}

	public String getCpuHand() {
		return CpuHand;
	}

	public void setCpuHand(String getCpuHand) {
		this.CpuHand = getCpuHand;
	}

	public StringBuilder getSb() {
		return sb;
	}

	public void setSb(StringBuilder sb) {
		this.sb = sb;
	}

}
