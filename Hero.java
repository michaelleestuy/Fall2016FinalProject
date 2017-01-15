import java.util.*;
public abstract class Hero extends Character{
    
    private int XP = 0;
    private int money = 0;
    public int level = 1;
    private ArrayList<Items> items = new ArrayList<Items>();
    private ArrayList<Skills> skills = new ArrayList<Skills>();

    private int equippedweapon = -1;
    private int equippedarmor = -1;

    public void resetWeapon(){
	equippedweapon = -1;
    }

    public void resetArmor(){
	equippedarmor = -1;
    }
    
    public void equip(int a){
	if(a == equippedweapon){
	    equippedweapon = -1;
	}
	if(a == equippedarmor){
	    equippedarmor = -1;
	}

	int typeofitem = getItem(a).getType();
	if(typeofitem != 0 && typeofitem != 1){
	    System.out.println("This item cannot be equipped");
	    return;
	}

	if(typeofitem == 0){
	    equippedweapon = a;
	}
	if(typeofitem == 1){
	    equippedarmor = a;
	}
    }


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

    public Items removeItem(int a){
	return items.remove(a);
    }
    
    public void addSkill(Skills a){
	skills.add(a);
    }

    public Skills getSkill(int a){
	return skills.get(a);
    }
    /////////////////////////////////////////////////
    public int totalAtk(){
	int a = getbatk();
        a += getItem(equippedweapon).getAtk();
	a += getItem(equippedarmor).getAtk();
	return a;
    }

    public int totalDef(){
	int a = getbdef();
        a += getItem(equippedweapon).getDef();
	a += getItem(equippedarmor).getDef();
	return a;
    }

    public int totalMagicAtk(){
        int a = getbmagicatk();
        a += getItem(equippedweapon).getMagicAtk();
	a += getItem(equippedarmor).getMagicAtk();
	return a;
    }

    public int totalMagicDef(){
        int a = getbmagicdef();
        a += getItem(equippedweapon).getMagicDef();
	a += getItem(equippedarmor).getMagicDef();
	return a;
    }
  
    ///////////////////////////////////////////////////
    public void useSkill(int a, Enemy b){
	Skills skill = getSkill(a);
	skill.useOn(this, b);
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

    
