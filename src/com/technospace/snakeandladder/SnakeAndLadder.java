package com.technospace.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 * Variable for defining player position in game
		 */
			int position=0;
			final int NO_PLAY = 1;
			final int LADDER = 2;
			final int SNAKE = 3;
			/***
			 * Random class object to generate Die Number between 1-6
			 */
			Random random=new Random();
			
			System.out.println("Player 1 start Position is = "+position);
			while(position != 100){
			int dieNo = random.nextInt(6)+1;
			System.out.println("Die Number="+dieNo);
			
			System.out.println("New Position after Rolling Die="+position);
			int option =random.nextInt(3)+1;
			System.out.println("Option Number="+option);
			switch(option){
			case NO_PLAY:
				System.out.println("Option = NO PLAY");
				position = position;
				break;
			case LADDER:
				System.out.println("option = LADDER");
				position = position + dieNo;
				break;
			case SNAKE:
				System.out.println("Option = SNAKE");
				position = position - dieNo;
				if(position < 0){
					position = 0;
				}
				
				break;
			}
			System.out.println("New Position = "+position);
			System.out.println("####################################");
	}

}
}
