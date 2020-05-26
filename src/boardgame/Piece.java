package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}


	protected Board getBoard() {   //protected porque ele é de uso interno e não pode ser acessado pelas camadas de cima. 
		return board;
	}
}
