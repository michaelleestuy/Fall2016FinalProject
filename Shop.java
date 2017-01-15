public class Shop{

    public void buyItem(int a, Hero b){
	purchase = getitem(a);
	price = purchase.getBPrice();

	if(b.getMoney() < price){
	    System.out.println("Not enough money");
	    return;
	}

	b.addItem(purchase);
	b.changeMoney(-1 * price);
    }










    
    private Items item1;
    private Items item2;
    private Items item3;

    private void setitem(int b, Items a){
	if(b == 1){	
	    item1 = a;
	}
	if(b == 2){
	    item2 = a;
	}
	if(b == 3){
	    item3 = a;
	}
    }

    public Items getitem(int a){
	if(a == 1){
	    return item1;
	}
	if(a == 2){
	    return item2;
	}
	return item3;
    }

    public Shop(Items a, Items b, Items c){
	setitem(1, a);
	setitem(2, b);
	setitem(3, c);
    }

    public void display(){
	System.out.println(getitem(1));
	System.out.println(getitem(1).getBPrice() + " gold");
	System.out.println();
	System.out.println(getitem(2));
	System.out.println(getitem(2).getBPrice() + " gold");
	System.out.println();
	System.out.println(getitem(3));
	System.out.println(getitem(3).getBPrice() + " gold");
    }

    
}
