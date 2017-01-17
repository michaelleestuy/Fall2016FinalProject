import java.util.*;
public class Mage extends Hero{
    
    Fireball basicbash = new Fireball();
	Flamestrike basicslam = new Flamestrike();


    public Mage(String n){
	setName(n);
	setMaxHP(100);
	setMaxMP(50);
	changeHP(100);
	changeMP(50);
	addSkill(basicbash);
	addSkill(basicslam);
    }
    
    



    
    
}
