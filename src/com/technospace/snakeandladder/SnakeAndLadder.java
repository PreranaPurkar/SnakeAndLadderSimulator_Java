package com.technospace.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 * Variable for defining player position in game
		 */
			int position=0;
			/***
			 * Random class object to generate Die Number between 1-6
			 */
			Random random=new Random();
			
			System.out.println("Player 1 start Position is = "+position);
			int dieNo = random.nextInt(6)+1;
			System.out.println("Die Number="+dieNo);
			position = position + dieNo;
			System.out.println("New Position after Rolling Die="+position);
			
			
	}

}
