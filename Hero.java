import java.util.*;
public abstract class Hero extends Character{
    
    private int XP;
    private int money;
    private int level;
    private ArrayList<Items> items;

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

    public void levelUp(){
	if(XP >= (level * 50)){
	    level++;
	}
    }
}

    
