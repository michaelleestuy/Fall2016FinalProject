import java.util.*;
public class Driver{
    public static void main(String[]args){
	WoodenSword a = new WoodenSword();
	WoodenSword b = new WoodenSword();
	WoodenSword c = new WoodenSword();
	Shop d = new Shop(a, b, c);
	d.display();
	
    }




}
