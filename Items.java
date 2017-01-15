public abstract class Items{
    private int sellprice;
    private int buyprice;

    public void setBPrice(int a){
	buyprice = a;
    }

    public int getBPrice(){
	return buyprice;
    }

    public void setPrice(int a){
        sellprice = a;
    }

    public int getPrice(){
	return sellprice;
    }


    
    private int atk;
    private int def;
    private int magicatk;
    private int magicdef;

    public void setAtk(int a){
	atk = a;
    }

    public int getAtk(){
	return atk;
    }

    public void setDef(int a){
	def = a;
    }

    public int getDef(){
	return def;
    }

    public void setMagicAtk(int a){
	magicatk = a;
    }

    public int getMagicAtk(){
	return magicatk;
    }

    public void setMagicDef(int a){
	magicdef = a;
    }

    public int getMagicDef(){
	return magicdef;
    }

}
