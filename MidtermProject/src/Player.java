
public class Player {
	
	int handsize = 0;
	ArrayStack<Card> hand = new ArrayStack<Card>();
	int wincount = 0;
	ArrayStack<Card> deck = new ArrayStack<Card>();
	
	Player(int t, ArrayStack<Card>imported){
		setHandSize(t);
		deck = imported;
		makeHand(deck);
	}//player
	
	
	public void makeHand(ArrayStack<Card>deck){
		for(int i=0;i<handsize;i++){
			hand.push(deck.pop());
		}
	}//makehand
	
	public void makeMatch(Card pileTop, ArrayStack<Card>pile){
		int i = 0;
		int matchStatus = 0;
		while(i<handsize){
			matchStatus = playCard(pileTop, pile, i, matchStatus); 
			if(matchStatus==1){
				handsize--;
				i = handsize;
			}//if
			i++;
		}//while

		while(matchStatus!=1 && deck.size()!=0){
			//System.out.println("No matches");
			hand.push(deck.pop());
			matchStatus = playCard(pileTop, pile, i, matchStatus); 
			if(matchStatus!=1){
				handsize++;
				i++;
			}//if
			else{
				matchStatus=1;
			}//else

		}//while 

	}//makeMatch
	
	
	public int playCard(Card pileTop, ArrayStack<Card>pile, int i, int matchStatus){
		Card temp = hand.get(i);
		if (pileTop.compareTo(temp)==1){ //n=this
			pile.push(hand.remove(i));
			//System.out.println(temp.toString());
			matchStatus = 1;
		}	//if
		return matchStatus;
	}//playCard

	
	public boolean checkwin(){
		if(handsize==0){
			setWinCount(1);
			return true;
		}
		return false;
	}//checkwin
	

	
	
	
//get and set	
	public void setHandSize(int h){
		handsize = h;
	}
	
	public int getHandSize(){
		return handsize;
	}
	
	public ArrayStack<Card> getHand(){
		return hand;
	}
	
	public void setWinCount(int a){
		wincount = a;
	}
	
	public int getWinCount(){
		return wincount;
	}
	
	
}
