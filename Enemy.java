import java.util.*;

public abstract class Enemy extends Character{
    private ArrayList<Integer> drops;
    private int XP;

    public void display(){
	super.display();
	System.out.println();
    }
    
    public void setXP(int a){
	XP = a;
    }

    public void isDead(Hero a){
	if(checkDead()){
	    giveXP(a);
	}
    }

    public void giveXP(Hero a){
	System.out.println(this + " has been defeated!");
	a.changeXP(XP);
	System.out.println(a + " gained " + XP + " XP");
	System.out.println();
    }

}
