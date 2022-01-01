import java.util.*;
public class ManageBoard {
	ArrayList<Board> boardList;
	
	public ManageBoard() {
		boardList = new ArrayList<Board>();
	}
	
	public void addBoard(int bNum, String bSubject, String bName) {
		boardList.add(new Board(bNum, bSubject, bName));
	}
	
	public boolean removeBoard(int bNum) {
		for(Board bd : boardList) {
			if(bd.getbNum() == bNum) {
				System.out.println(bd.getbName() + "삭제");
				boardList.remove(bd);
				return true;
			}
		}
		return false;
	}
	
	public boolean modifyBoard(int bNum, String bSubject) {
		for(int i = 0; i < boardList.size(); i++) {
			if(boardList.get(i).getbNum() == bNum) {
				boardList.get(i).setbSubject(bSubject);
				return true;
			}
		}
		return false;
	}
	
	public void showAllBoard() {
		for(Board bd : boardList) {
			System.out.println("번호: " + bd.getbNum() + ". 제목: " + bd.getbSubject() + " 이름: " + bd.getbName());
		}
	}
}
