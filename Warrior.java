import java.util.*;
public class Warrior extends Hero{
    
    Bash basicbash = new Bash();


    public Warrior(String n){
	setName(n);
	setMaxHP(150);
	setMaxMP(25);
	changeHP(150);
	changeMP(25);
	addSkill(basicbash);
    }
    
    public void checkLevelUp(){
        if(super.levelUp()){
	    setMaxHP(25);
	    setMaxMP(5);
	    changeHP(25);
	    changeMP(5);
	}
    }

    public void useSkill(int a){
	int dam = getSkill(a).getDamage();
	int man = getSkill(a).getMana();
	System.out.println("did " + dam + " damage");
	System.out.println("used " + man + " mana");
    }

    

}
