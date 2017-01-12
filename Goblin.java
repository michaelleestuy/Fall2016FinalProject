import java.util.*;

public class Goblin extends Enemy{

    private int dam;
    
    public String toString(){
	return "Goblin";
    }

    public Goblin(){
	setXP(25);
	setMaxHP(50);
	changeHP(50);
	changeMP(1);
	setMaxMP(1);
	dam =  5;
    }
    
    public void attack(Hero a){
	int damt = dam - a.totalDef();
	System.out.println(this + " attacked " + a);
	System.out.println("did " + dam + " damage");
	a.changeHP(-1 * damt);
    }

    
}
