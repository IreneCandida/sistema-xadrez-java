package chess;

import boardgame.Board;

//classe (partida de xadrez) resposavel pelas regras do jogo de xadrez
public class ChessMatch {
	/*private int turn;
	private Color currentPlayer;
	private boolean check;
	private ChessPiece enPassantVulnerable;
	private ChessPiece promoted;*/
	
	private Board board;
	//dimensão do tabuleiro
	public ChessMatch() {
		board = new Board(8, 8);
		
	}
	//retornar uma matriz de peças de xadrez correspondente a partida
	public ChessPiece[][] getPieces(){
	// variavel temporaria mat
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i = 0; i < board.getRows(); i++) {
			for(int j = 0; j < board.getColumns(); j++ ) {
				mat [i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return mat;
	}
	
	
		
	
	

}
