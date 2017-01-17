import java.util.*;
public class Warrior extends Hero{
    
    Bash basicbash = new Bash();
	Slam basicslam = new Slam();
    WoodenSword basicsword = new WoodenSword();

    public Warrior(String n){
	setName(n);
	setMaxHP(150);
	setMaxMP(25);
	changeHP(150);
	changeMP(25);
	addSkill(basicbash);
	addSkill(basicslam);
    }
    
    



    
    
}
