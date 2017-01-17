import java.util.*;

public class Wisp extends Enemy{

    private int dam;
    
    public String toString(){
	return "Wisp";
    }

    public Wisp(){
	setXP(35);
	setMaxHP(70);
	changeHP(70);
	changeMP(1);
	setMaxMP(1);
	dam =  5;
    }
    
    public void attack(Hero a){
	int damt = dam - a.totalMagicDef();
	System.out.println(this + " attacked " + a);
	System.out.println("did " + dam + " damage");
	a.changeHP(-1 * damt);
    }

    
}
