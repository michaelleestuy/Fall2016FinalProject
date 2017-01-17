import java.util.*;

public class Akhmedov extends Enemy{

    private int dam;
    
    public String toString(){
	return "Akhmedov";
    }

    public Akhmedov(){
	setXP(100);
	setMaxHP(100);
	changeHP(100);
	changeMP(1);
	setMaxMP(1);
	dam = 10;
    }
    
    public void attack(Hero a){
	int damt = dam - a.totalDef();
	System.out.println(this + " attacked " + a);
	System.out.println("did " + dam + " damage");
	a.changeHP(-1 * damt);
    }

    
}
