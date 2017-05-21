class Pokemon1{


private String type;
private String name;
private int hp; 


Pokemon1(){
type = "normal";
name = "Zipzagoon";
hp=10;
}

Pokemon1(String t, String n, int h){
type = t;
name = n;
hp = h;
}

public void setHP(int i){
if(i>=0){
hp = i;
}//if
}//setHP

public String getName(){
return name;
}

public String getType(){
return type;
}

public int getHP(){
return hp;
}

public void setName(String n){
n= name;
}

public void setType(String n){
n = type;
}


public String toString(){
return("The pokemon "+name+" has the type "+type+" and an hp of "+hp);
}

}