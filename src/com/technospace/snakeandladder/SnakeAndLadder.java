package com.technospace.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 * Variable for defining player position in game
		 */
			int position = 0;
			int position2 = 0;
			int count_dieRoll=0;
			int chance =1;
			final int NO_PLAY = 1;
			final int LADDER = 2;
			final int SNAKE = 3;
			/***
			 * Random class object to generate Die Number between 1-6
			 */
			Random random=new Random();
			
			System.out.println("Player 1 start Position is = "+position);
			System.out.println("Player 2 Start Position is ="+position);
			while(position != 100){
				if(chance %2==0){
					System.out.println("Palyer 1 Chance");
					int dieNo = random.nextInt(6)+1;
					System.out.println("Die Number="+dieNo);
					count_dieRoll++;
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
						if(position >100){
							position = position - dieNo;
						}
						chance --;
						break;
					case SNAKE:
						System.out.println("Option = SNAKE");
						position = position - dieNo;
						if(position < 0){
							position = 0;
						}
						
						break;
					}
					System.out.println("New Position for Player 1= "+position);
					System.out.println("####################################");
				}
				else{
					System.out.println("Player 2 Chance");
					int dieNo = random.nextInt(6)+1;
					System.out.println("Die Number="+dieNo);
					count_dieRoll++;
					System.out.println("New Position after Rolling Die="+position2);
					int option =random.nextInt(3)+1;
					System.out.println("Option Number="+option);
					switch(option){
					case NO_PLAY:
						System.out.println("Option = NO PLAY");
						position2 = position2;
						break;
					case LADDER:
						System.out.println("option = LADDER");
						position2 = position2 + dieNo;
						if(position >100){
							position2 = position2 - dieNo;
						}
						chance ++;
						break;
					case SNAKE:
						System.out.println("Option = SNAKE");
						position2 = position2 - dieNo;
						if(position2 < 0){
							position2 = 0;
						}
						
						break;
					}
					System.out.println("New Position for Player 2= "+position2);
					System.out.println("####################################");
				
				}
		
	}
			System.out.println("Total Count of Die Roll to win the Game="+count_dieRoll);
}
}
