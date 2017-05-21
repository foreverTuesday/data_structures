
public class crazyDriver{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deck deck = new Deck();
		int handsize = 5;
		
		//System.out.println(deck.toString());
		deck.shuffle();
		//System.out.println(deck.toString());

//create two players and their hands
		Player p1 =  new Player(handsize, deck);
		Player p2 =  new Player(handsize, deck);
		
		Deck pile = new Deck(1);
		pile.push(deck.pop());
		//System.out.println("The size of the pile is: "+pile.size());

		
		//ArrayStack<Card> hand1 = p1.getHand();
		//ArrayStack<Card> hand2 = p2.getHand();
		
		//System.out.println(hand1.toString());
		//System.out.println(hand2.toString());
		
		
		
//comparing hands
	
		

//taking turns
		int gameOver=0;
		int turn = 1;
		while(gameOver==0){
			Card pileTop = pile.peek();
			//System.out.println("The top of the pile is: " + pileTop.toString());
			boolean win = false;
			if(turn==1){
				//System.out.println("The matching cards in hand 1 are:");
				p1.makeMatch(pileTop, pile);
				turn=2;
				win = p1.checkwin();
			}//if
			else{
				//System.out.println("The matching cards in hand 2 are:");
				p2.makeMatch(pileTop, pile);
				turn=1;
				win = p2.checkwin();
			}//else
			
			//System.out.println("The size of the pile is: "+pile.size());
			//System.out.println("The size of the deck is: "+deck.size());
			//System.out.println("p1 hand size: "+p1.getHandSize());
			//	System.out.println("p2 hand size: "+p2.getHandSize());
			
			if(deck.size()==0) {
				Card storeTop = pile.pop();
				pile.shuffle();
				int pileSize=pile.size();
				for(int i=0;i<pileSize;i++){
					deck.push(pile.pop());
				}//for
				
				pile.push(storeTop);
			}//if for shuffling pile into new deck

			
			if(win==true){   //check game state
				gameOver=1;
				/* if(deck.size()==0){
					p1.setWinCount(54-p1.getHandSize());
					p2.setWinCount(54-p2.getHandSize());
					
				
				}//if, no winner     */ //this was necessary for A code, not needed in extra credit code
			}//if, check game state
			
		}//while loop that takes turns
		
	//	System.out.println(hand1.toString());
	//	System.out.println(hand2.toString());
		
		
		if(p1.getWinCount()>p2.getWinCount()){
			System.out.println("player 1 wins!");
		}//if
		else if(p2.getWinCount()>p1.getWinCount()){
			System.out.println("player 2 wins!");
		}//if
		else{
			System.out.println("There was a tie");  //a tie cannot happen in the current code
		}//else      
		
	}

}
