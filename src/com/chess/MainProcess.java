package com.chess;

import java.util.LinkedList;
import java.util.List;

import com.chess.game.BaseComputerAi;
import com.chess.game.ChessBoard;
import com.chess.game.HumanPlayer;
import com.chess.game.Point;

public class MainProcess {
	
	
	public static void main(String[] args) {

		BaseComputerAi aiPlayer = new BaseComputerAi();
		HumanPlayer human = new HumanPlayer();
		
		ChessBoard chessBoard = new ChessBoard();//虚拟棋盘，主要是保存已下棋子和空位置的棋子坐标
		human.setChessboard(chessBoard);
		aiPlayer.setChessboard(chessBoard);
		aiStartGame(aiPlayer);//机器开始先下棋
		onChessClick(6, 7, false, chessBoard, human, aiPlayer);//接受用户点击事件
		onChessClick(6, 8, false, chessBoard, human, aiPlayer);//接受用户点击事件
		onChessClick(6, 9, false, chessBoard, human, aiPlayer);//接受用户点击事件
		onChessClick(6, 10, false, chessBoard, human, aiPlayer);//接受用户点击事件
		onChessClick(6, 11, false, chessBoard, human, aiPlayer);//接受用户点击事件
		
	}
	
	//player == true 表示人类， player == false表示机器
	 private static  boolean checkWin(boolean player, ChessBoard chessBoard, HumanPlayer human
			, BaseComputerAi aiPlayer) {
	        if (player && human.hasWin()) {
	        	//提供接口弹提示窗口
	        	System.out.println("human win");
	            return true;//人胜
	        }

	        if (!player && aiPlayer.hasWin()) {	
	        	//提供接口弹提示窗口
	        	System.out.println("ai win");
	            return true;//机器胜
	        }

	        if (chessBoard.getFreePoints().isEmpty()) {
	        	//提供接口弹提示窗口
	        	System.out.println("non ");
	        	return true;//和棋
	        }
	        return false;
	    }

	   private static void onChessClick(int x, int y, boolean isWin,ChessBoard chessBoard, HumanPlayer human
				, BaseComputerAi aiPlayer) {
	        //以左上角第一个点为（0,0）右下角最后一个点为（15，15）；当鼠标点击其中一个点时，触发该事件。
	        if (isWin) {
	            return;
	        }
	        Point point = new Point(x, y);
	        if (chessBoard.getFreePoints().contains(point)) {
	            human.run(aiPlayer.getMyPoints(), point);
//	            	drawPoint(aiPoint.getX(), aiPoint.getY(), !black);提供画棋子的接口 
	            if (checkWin(true,chessBoard, human, aiPlayer)) {
	                return;
	            }
	            aiPlayer.run(human.getMyPoints(), null);
	            Point aiPoint = aiPlayer.getMyPoints().get(aiPlayer.getMyPoints().size() - 1);
//	            drawPoint(aiPoint.getX(), aiPoint.getY(), !black);提供画棋子接口
	            checkWin(false,chessBoard, human, aiPlayer);
	        }

	    }
	 private static void aiStartGame(BaseComputerAi aiPlayer) {
//	        if (!black) {     //我方是白棋，电脑第一个棋子一定下在正中心
//	            drawPoint(7, 7, true);//提供画棋子的接口
	            Point point = new Point(7, 7);
	            aiPlayer.getMyPoints().add(point);
	            aiPlayer.allFreePoints.remove(point);
//	        }


	    }
	 private static void printPositon(List<Point> pointlist){
		 for(Point p : (LinkedList<Point>)pointlist){
			 System.out.println(p + " " +(p.getX() + p.getY()*15));
		 }
	 }
}
