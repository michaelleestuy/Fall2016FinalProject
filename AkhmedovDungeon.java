import java.io.*;
public class AkhmedovDungeon{
    
    String name;
    String Class;
    String[] classes = {"warrior", "mage", "hunter"};
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args){
	AkhmedovDungeon AD = new AkhmedovDungeon();
	System.out.println("Welcome to Mr. Akhmedov's Dungeon");
	System.out.println("What is your name, adventurer?");
	AD.initialize();
	AD.printClass();
	
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
	System.out.println(x);
	int temp;
	try{
	    temp = Integer.parseInt(BR.readLine());
	    if(temp > classes.length - 1){
		throw new Exception();
	    }
	}
        catch(Exception err){
	    System.out.println("Please input a valid number");
	    printClass();
	}
	Class = classes[temp];
	
    }
           
	   
}
	
    
