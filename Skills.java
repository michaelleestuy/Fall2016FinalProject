import java.util.*;
public abstract class Skills{
    private int damage = 0;
    private int mana = 0;

    public void changeDamage(int a){
	damage += a;
    }

    public void changeMana(int a){
	mana += a;
    }

    public int getDamage(){
	return damage;
    }

    public int getMana(){
	return mana;
    }

    public void useOn(Character a){

    }

}
