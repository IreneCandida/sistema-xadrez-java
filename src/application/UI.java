package application;

import chess.ChessPiece;

public class UI {
	
	public static void printBoard(ChessPiece[][] pieces) {
		for(int i = 0; int i < piece.length) {
			System.out.print((8-i)+ " ");
			for (int j = 0; j < pieces.length; j++) {
				
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");	
	}
	
	// imprime uma peça
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		}
		else {
			System.out.println(piece);
		}
		System.out.println(" ");
	}

}
