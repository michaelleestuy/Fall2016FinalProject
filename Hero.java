import java.util.*;
public abstract class Hero extends Character{
    
    private int XP = 0;
    private int money = 0;
    private int level = 1;
    private ArrayList<Items> items = new ArrayList<Items>();
    private ArrayList<Skills> skills = new ArrayList<Skills>();


    public void addSkill(Skills a){
	skills.add(a);
    }

    public Skills getSkill(int a){
	return skills.get(a);
    }

    public void useSkill(int a, Character target){
	getSkill(a).useOn(target);
	changeMP(-1 * getSkill(a).getMana());
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

    

    public boolean levelUp(){
	if(XP >= (level * 50)){
	    level++;
	    return true;
	}
	return false;
    }
}

    
