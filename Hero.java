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
	
    }

    public void addItem(Items a){
	items.add(a);
    }

    public Items getItem(int a){
	return items.get(a);
    }
    
    public void addSkill(Skills a){
	skills.add(a);
    }

    public Skills getSkill(int a){
	return skills.get(a);
    }

    public int totalAtk(){
	int a = 0;
	for(Items item : items){
	    a += item.getAtk();
	}
	a += getbatk();
	return a;
    }

    public int totalDef(){
	int a = 0;
	for(Items item : items){
	    a += item.getDef();
	}
	a += getbdef();
	return a;
    }

    public int totalMagicAtk(){
	int a = 0;
	for(Items item : items){
	    a += item.getMagicAtk();
	}
	a += getbmagicatk();
	return a;
    }

    public int totalMagicDef(){
	int a = 0;
	for(Items item : items){
	    a += item.getMagicDef();
	}
	a += getbmagicdef();
	return a;
    }
  

    public void useSkill(int a, Enemy b){
	Skills skill = getSkill(a);
	skill.useOn(this, b);

	/*
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
	*/
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

    
