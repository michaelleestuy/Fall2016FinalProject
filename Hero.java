import java.util.*;
public abstract class Hero extends Character{
    
    private int XP = 0;
    private int money = 0;
    private int level = 1;
    private ArrayList<Items> items;
    private ArrayList<Skills> skills;
    private String name;


    public void setName(String n){
	name = n;
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

    
