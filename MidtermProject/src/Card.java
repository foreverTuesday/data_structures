
public class Card implements Comparable<Card>{

    String suit;
    int value;
    String faceValue;
    
    Card(){}
    
    Card(String s, int v){
        suit = s;
        value =v;
        switch(v){
            case(1):
                faceValue="Ace";
                break;
            case(11):
                faceValue="Jack";
                break;
            case(12):
                faceValue="Queen";
                break;
            case(13):
                faceValue="King";
                break;
            default:
                faceValue=Integer.toString(v);
                break;
            }
    }
    
    public String getSuit(){
        return suit;
    }
    
    public int getValue(){
        return value;
    }
    
    
    public String toString(){
        return(faceValue + " of " +suit);
    }
    
    public boolean equals(Card c){
        if (this.value == c.getValue()){return true;}
        return false;
        
    }
    
    
    public int compareTo(Card a){
    	if(a.getValue()==this.getValue()){
			return 1;
		}//if same number
    	if(a.getSuit()==this.getSuit()){
    		return 1;
    	}//if same suit
    	if(a.getValue()==8 || this.getValue()==8){
			return 1;
		}//if
		return 0;
	}//compare
}
