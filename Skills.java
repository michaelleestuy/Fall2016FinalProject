import java.util.*;
public abstract class Skills{
    private int damage;
    private int mana;

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



}
