
public class Board {
	private int bNum;
	private String bSubject;
	private String bName;
	
	public Board() {
		
	}
	public Board(int bNum, String bSubject, String bName) {
		this.bNum = bNum;
		this.bSubject = bSubject;
		this.bName = bName;
	}
	
	public int getbNum() {
		return this.bNum;
	}
	public String getbSubject( ) {
		return this.bSubject;
	}
	public String getbName() {
		return this.bName;
	}
	
	public void setbNum(int bNum) {
		this.bNum = bNum;
	}
	public void setbSubject(String bSubject) {
		this.bSubject = bSubject;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
}
