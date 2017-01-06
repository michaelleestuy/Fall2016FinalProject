import java.util.*;
public class Bash extends Skills{
    public Bash(){
	changeDamage(10);
	changeMana(0);
    }

    public void useOn(Character a){
	System.out.println("Character " + a + "was hit by Bash");
    }



}
