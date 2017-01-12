import java.util.*;
public class Driver{
    public static void main(String[]args){
	Warrior a = new Warrior("Eugene Thomas");
	Goblin b = new Goblin();
	a.display();
	b.display();

	a.useSkill(0, b);

	a.display();
	b.display();
	
    }




}
