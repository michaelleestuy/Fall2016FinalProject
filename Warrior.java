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

    public void useSkill(int a, Character b){
	int dam = getSkill(a).getDamage();
	int man = getSkill(a).getMana();
	if(man > getMP()){
	    System.out.println(this + " does not have enough mana to use " + getSkill(a));
	    return;
	}
	System.out.println(this + " used " + getSkill(a) + " on " + b);
	System.out.println("did " + dam + " damage");
	System.out.println("used " + man + " mana");
	this.changeMP(-1 * man);
	b.changeHP(-1 * dam);
    }

    

}
