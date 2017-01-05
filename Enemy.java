import java.util.*;

public abstract class Enemy extends Character{
    private ArrayList<Integer> drops;
    private int XP;
    
    

    abstract void giveXP(Hero a);

}
