
public class TestManageBoard {

	public static void main(String[] args) {
		ManageBoard board = new ManageBoard();
		board.addBoard(1, "자바도 재밋습니다.01", "이순신");
		board.addBoard(2, "자바도 재밋습니다.02", "이순신");
		board.addBoard(3, "자바도 재밋습니다.03", "이순신");
		board.addBoard(4, "자바도 재밋습니다.04", "이순신");
		board.addBoard(5, "자바도 재밋습니다.05", "이순신");
		board.addBoard(6, "자바도 재밋습니다.06", "이순신");
		board.addBoard(7, "자바도 재밋습니다.07", "이순신");
		board.addBoard(100, "게시판도배가 재밋습니까?", "이순순");
		board.showAllBoard();
		board.removeBoard(5);
		System.out.println(board.modifyBoard(4, "PHP가 더 재밋습니다."));
		board.showAllBoard();
	}

}
