import java.util.*;
public abstract class Hero extends Character{
    
    private int XP = 0;
    private int money = 0;
    public int level = 1;
    private ArrayList<Items> items = new ArrayList<Items>();
    private ArrayList<Skills> skills = new ArrayList<Skills>();


    public void display(){
	super.display();
	System.out.println("Level: " + level);
	System.out.println("XP: " + getXP() + "/" + (level * 50));
	System.out.println();
    }
    
    public void addSkill(Skills a){
	skills.add(a);
    }

    public Skills getSkill(int a){
	return skills.get(a);
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
	System.out.println();
	this.changeMP(-1 * man);
	b.changeHP(-1 * dam);
    }


    public int getMoney(){
	return money;
    }

    public void changeMoney(int a){
	money += a;
    }

    public int getXP(){
	return XP;
    }

    public void changeXP(int a){
	XP += a;
    }

    public void isDead(){
	if(checkDead()){
	    System.out.println(this + " has died");
	}
    }

    public boolean levelUp(){
	if(XP >= (level * 50)){
	    level++;
	    return true;
	}
	return false;
    }


}

    
