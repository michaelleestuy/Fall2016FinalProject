import java.util.*;
public class Hunter extends Hero{
    
    Powershot basicbash = new Powershot();
	Smorc basicslam = new Smorc();


    public Hunter(String n){
	setName(n);
	setMaxHP(125);
	setMaxMP(35);
	changeHP(125);
	changeMP(35);
	addSkill(basicbash);
	addSkill(basicslam);
    }
    
    



    
    
}
