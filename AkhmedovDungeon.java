import java.io.*;
import java.util.*;
public class AkhmedovDungeon{

    private static final String CLEAR_SCREEN =  "\033[2J";

    Hero h;

    String name;
    String Class;
    int stage = 0;
    int level = 1;
    String[] classes = {"warrior", "mage", "hunter"};
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args){
		AkhmedovDungeon AD = new AkhmedovDungeon();
		System.out.print(CLEAR_SCREEN);
		System.out.println("Welcome to Mr. Akhmedov's Dungeon. I am Mr. Akhmedov.");
		System.out.println("What is your name, adventurer?");
		AD.initialize();
		AD.printClass();
		AD.explore();
		AD.conclude();

		
	    
    }
	
	public void conclude(){
		System.out.println("Congrats! You've gotten through as much of the dungeon as you could");
		System.out.println("You got through " + stage + " stages, and " + level + " levels. Good job!");
		System.out.println("Play again soon!");
	}
	
	public void shop(){
		WoodenSword a = new WoodenSword();
		WoodenShield b = new WoodenShield();
		Wand c = new Wand();
		Shop s = new Shop(a, b, c);
			s.display();
			System.out.println("Would you like to buy anything? (1/2/3/No)");
			try{			
				String z = (BR.readLine());
				if(z.equals("No") || z.equals("no")){
					return;
				}
				int temp = Integer.parseInt(z);
				if(temp < 1 || temp > 3){
					throw new Exception();
				}
				s.buyItem(temp, h);
				System.out.println("Enjoy your new item!");
			}
			catch(Exception err){
				System.out.println("Input a valid number");
				shop();
			}
	}
	
	public void explore(){
		while(h.getHP() > 0){
			if(stage % 5 == 0){
				shop();
			}
			Enemy e = new Goblin();
			if(stage % 5 == 0){
				e = new Goblin();
				System.out.println("Oh no! A(n) " + e);
			}
			if(stage % 5 == 1){
				e = new Wisp();
				System.out.println("Oh no! A(n) " + e);
			}
			if(stage % 5 == 2){
				e = new Outfitter();
				System.out.println("Oh no! A(n) " + e);
			}
			if(stage % 5 == 3){
				e = new Wizard();
				System.out.println("Oh no! A(n) " + e);
			}
			if(stage % 5 == 4){
				e = new Akhmedov();
				System.out.println("Oh no! A(n) " + e);
			}
			while(h.getHP() > 0 && e.getHP() > 0){
				h.display();
				e.display();
				System.out.println("Choose your attack");
				arrLPrint(h.getSkills());
				int temp = 0;
				try{
					temp = Integer.parseInt(BR.readLine());
					if(temp > h.getSkills().size()){
						throw new Exception();
					}
				}
				catch(Exception err){
					System.out.println("Please input a valid number");
				}
				h.useSkill(temp, e);
				e.attack(h);
				h.checkLevelUp();
			}
			if(h.getHP() <= 0){
				return;
			}
			if(h.getHP() > 0){
				System.out.println("Opponent defeated!");
			}
			h.changeMoney(10);
			stage += 1;
			if(stage == 5){
				level += 1;
				stage = 0;
			}
			h.changeHP(20);
			if(h.getHP() > h.getMaxHP()){
				h.changeHP(h.getMaxHP() - h.getHP());
			}
			h.changeMP(10);
		}
	}
	
	public void arrLPrint(ArrayList<Skills> a){
		String x = "[";
		for(int i = 0; i < a.size(); i++){
			x += a.get(i).toString();
			x += "(" + i + "), ";
		}
		System.out.println(x.substring(0, x.length() - 2) + ']');
	}
	

    public void initialize(){
	try{
	    name = BR.readLine();
	    if(name.length() == 0){
		throw new Exception();
	    }
	    System.out.println("Welcome, " + name);
	    return;
	}
	catch(Exception err){
	    System.out.println("Please put in at least one character");
	    initialize();
	}
	return;
    }

    private void printClass(){
	String x = name + ", would you like to become";
	for(int i = 0; i < classes.length; i++){
	    if(i + 1 == classes.length){
		x += " or";
	    }
	    x += " a " + classes[i] + ",";
	}
        x = x.substring(0, x.length() - 1) + "?";
	x += " (";
	for(int i = 0; i < classes.length; i++){
	    x += i + ", ";
	}
	x = x.substring(0, x.length() - 2) + ")";
	System.out.println(x);
	int temp;
	try{
	    temp = Integer.parseInt(BR.readLine());
	    if(temp > classes.length - 1){
		throw new Exception();
	    }
	    if(temp < 0){
		throw new Exception();
	    }
	    Class = classes[temp];
	    System.out.println("Congrats, you are now a " + Class);
	    if(Class.equals("warrior")){
		h = new Warrior(name);
	    }
	    if(Class.equals("mage")){
		h = new Mage(name);
	    }
	    if(Class.equals("hunter")){
		h = new Hunter(name);
	    }
		System.out.println("Prepare for a magical journey. Here's 10 gold to get you started");	
		h.changeMoney(10);
		System.out.println("Total Gold: " + h.getMoney());
	}
        catch(Exception err){
	    System.out.println("Please input a valid number");
	    printClass();
	}	
    }
           
	   
}
	
    
