import java.util.*;
public class Driver{
    public static void main(String[]args){
	Warrior a = new Warrior("Eugene Thomas");
	Goblin b = new Goblin();
	a.display();
	b.display();

	a.useSkill(0, b);
	b.attack(a);
        a.useSkill(0, b);
	b.attack(a);
        a.useSkill(0, b);
	b.attack(a);
        b.isDead(a);
	a.useSkill(0, b);
	b.attack(a);
        b.isDead(a);
	a.useSkill(0, b);
	b.attack(a);
        b.isDead(a);

	a.display();
	b.display();

	Goblin c = new Goblin();

	a.useSkill(0, c);
	c.attack(a);
        a.useSkill(0, c);
	c.attack(a);
        a.useSkill(0, c);
	c.attack(a);
        c.isDead(a);
	a.useSkill(0, c);
	c.attack(a);
        c.isDead(a);
	a.useSkill(0, c);
	c.attack(a);
        c.isDead(a);
	a.checkLevelUp();

	a.display();
	
    }




}
