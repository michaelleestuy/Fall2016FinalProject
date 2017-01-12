import java.util.*;
public class Warrior extends Hero{
    
    Bash basicbash = new Bash();
    WoodenSword basicsword = new WoodenSword();

    public Warrior(String n){
	setName(n);
	setMaxHP(150);
	setMaxMP(25);
	changeHP(150);
	changeMP(25);
	addSkill(basicbash);
	addItem(basicsword);
    }
    
    public void checkLevelUp(){
        if(super.levelUp()){
	    setMaxHP(25);
	    setMaxMP(5);
	    changeHP(25);
	    changeMP(5);
	    System.out.println(this + " leveled up to " + level);
	    System.out.println("+25 HP");
	    System.out.println("+5 MP");
	}
    }



    
    
}
