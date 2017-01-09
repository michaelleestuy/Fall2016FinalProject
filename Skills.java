import java.util.*;
public class Skills{
    private int damage;
    private int mana;

    public Skills(){
	damage = 0;
	mana = 0;
    }
    
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

