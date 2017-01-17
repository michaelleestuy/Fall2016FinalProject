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
	
	public ArrayList<Skills> getSkills(){
		return skills;
	}
    /////////////////////////////////////////////////
    public int totalAtk(){
	int a = getbatk();
    if(equippedweapon != -1){
		a += getItem(equippedweapon).getAtk();
	}
	if(equippedarmor != -1){
		a += getItem(equippedarmor).getAtk();
	}
	return a;
    }

    public int totalDef(){
	int a = getbdef();
    if(equippedweapon != -1){
		a += getItem(equippedweapon).getDef();
	}
	if(equippedarmor != -1){
		a += getItem(equippedarmor).getDef();
	}
	return a;
    }

    public int totalMagicAtk(){
        int a = getbmagicatk();
    if(equippedweapon != -1){
		a += getItem(equippedweapon).getMagicAtk();
	}
	if(equippedarmor != -1){
		a += getItem(equippedarmor).getMagicAtk();
	}
	return a;
    }

    public int totalMagicDef(){
        int a = getbmagicdef();
    if(equippedweapon != -1){
		a += getItem(equippedweapon).getMagicDef();
	}
	if(equippedarmor != -1){
		a += getItem(equippedarmor).getMagicDef();
	}
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
    
	public void checkLevelUp(){
        if(levelUp()){
	    setMaxHP(25);
	    setMaxMP(5);
	    changeHP(25);
	    changeMP(5);
	    System.out.println(this + " leveled up to " + level);
		level ++;
	    System.out.println("+25 HP");
	    System.out.println("+5 MP");
	}
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

    
