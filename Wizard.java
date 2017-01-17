import java.util.*;

public class Wizard extends Enemy{

    private int dam;
    
    public String toString(){
	return "Wizard";
    }

    public Wizard(){
	setXP(25);
	setMaxHP(30);
	changeHP(30);
	changeMP(1);
	setMaxMP(1);
	dam =  25;
    }
    
    public void attack(Hero a){
	int damt = dam - a.totalMagicDef();
	System.out.println(this + " attacked " + a);
	System.out.println("did " + dam + " damage");
	a.changeHP(-1 * damt);
    }

    
}
