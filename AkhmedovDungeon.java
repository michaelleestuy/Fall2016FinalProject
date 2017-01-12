import java.io.*;
import java.util.*;
public class AkhmedovDungeon{

    private static final String CLEAR_SCREEN =  "\033[2J";

    Hero h;

    String name;
    String Class;
    int worldSize;
    int levelSize;
    String[] classes = {"warrior", "mage", "hunter"};
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args){
	AkhmedovDungeon AD = new AkhmedovDungeon();
	System.out.print(CLEAR_SCREEN);
	System.out.println("Welcome to Mr. Akhmedov's Dungeon. I am Mr. Akhmedov.");
	System.out.println("What is your name, adventurer?");
	AD.initialize();
	AD.printClass();
	//Hero a = new Hero(name);
	System.out.println("Prepare for a magical journey. Here's 10 gold to get you started");	
	for(int i = 0; i < worldSize; i++){
	    System.out.println("WORLD " + i);
	    for(int k = 0; k < levelSize; k++){
		System.out.println("LEVEL " + k);
		for(int u = 0; u < stageSize; u++){
		    System.out.println("STAGE " + u);
		    Goblin b = new Goblin();
		    while(
		}
	    }
	}
		
	    
    }

    public void initialize(){
	try{
	    name = BR.readLine();
	    if(name.length() == 0){
		throw new Exception();
	    }
	    System.out.println("Welcome, " + name);
	    worldSize = ((int)Math.round(Math.random() * 2)) + 3;
	    levelSize = ((int)Math.round(Math.random() * 3)) + 2;
	    stageSize = ((int)Math.round(Math.random() * 3)) + 2;
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
		h = new Warrior(name);
	    }
	    if(Class.equals("hunter")){
		h = new Warrior(name);
	    }
	}
        catch(Exception err){
	    System.out.println("Please input a valid number");
	    printClass();
	}	
    }
           
	   
}
	
    
