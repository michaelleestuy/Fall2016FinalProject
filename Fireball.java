import java.util.*;
public class Fireball extends Skills{
    public Fireball(){
	changeDamage(35);
	changeMana(5);
    }


    public String toString(){
	return "Fireball";
    }

    public void useOn(Hero user, Enemy target){
	int dam = 0;
	dam += getDamage();
	dam += user.totalAtk();
	if(getMana() > user.getMP()){
	    System.out.println(user + " does not have enough mana to use " + this);
	    return;
	}
	System.out.println(user + " used " + this + " on " + target);
	System.out.println("did " + dam + " damage");
	if(getMana() > 1){
	    System.out.println("used " + getMana() + " mana");
	}
        user.changeMP(-1 * this.getMana());
	target.changeHP(-1 * dam);	
    }
    
}
