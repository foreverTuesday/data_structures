import java.util.Collections;

public class Deck extends ArrayStack<Card>{


    /**
     * See similar line in ArrayStack
     */
    private static final long serialVersionUID = 8293591257959871033L;
    private String suit = "joker";
   // ArrayStack<Card> deck = new ArrayStack<Card>();
    
    Deck(){
    	//we need to instantiate 52 card objects and put them into an arraystack
    	fillDeck();
    }//deck 1
    
    
    Deck(int i){  //for shuffling the pile into the deck
    	
    }//deck 2
	
    public void shuffle(){
    	Collections.shuffle(this);
    }
    
    public void fillDeck(){
    	int suitCode=1;
    	while(suitCode<5){
    		for(int cardVal=1;cardVal<14;cardVal++){
    			switch(suitCode){
    				case(1):
    					suit="Hearts";
    					break;
    				case(2):
    					suit="Spades";
    					break;
    				case(3):
    					suit="Diamonds";
    					break;
    				case(4):
    					suit="Clubs";
    					break;
    			}//switch
    			this.push(new Card(suit,cardVal));
    		}//for
    		suitCode++;
    	}//while
    }//fillDeck


	
}
