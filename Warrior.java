public class Warrior extends Hero{
    

    public void change


    public Warrior(String n){
	setName(n);
	setMaxHP(150);
	setMaxMP(25);
	changeHP(150);
	changeMP(25);
    }
    
    public void checkLevelUp(){
        if(super.levelUp()){
	    setMaxHP(25);
	    setMaxMP(5);
	    changeHP(25);
	    changeMP(5);
	}
    }

    

}
