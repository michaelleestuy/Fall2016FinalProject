public abstract class Character{
    //


    public void display(){
	System.out.println(this);
	System.out.println("HP: " + HP + "/" + HPmax);
	System.out.println("MP: " + MP + "/" + MPmax);
    }

    private int HPmax = 0;
    private int MPmax = 0;

    public void setMaxHP(int a){
	HPmax += a;
    }

    public void setMaxMP(int a){
	MPmax += a;
    }

    private String name;

    public void setName(String n){
	name  = n;
    }
    public String toString(){
	return name;
    }


    private int HP = 0;
    private int MP = 0;

    public void changeHP(int a){
	HP += a;
    }

    public int getHP(){
	return HP;
    }

    public void changeMP(int a){
	MP += a;
    }

    public int getMP(){
	return MP;
    }


    private int batk;
    private int bdef;
    private int bmagicatk;
    private int bmagicdef;

    public void changebatk(int a){
	batk += a;
    }

    public void changebdef(int a){
	bdef += a;
    }

    public void changebmagicatk(int a){
	bmagicatk += a;
    }

    public void changebmagicdef(int a){
	bmagicdef += a;
    }

    public int getbatk(){
	return batk;
    }

    public int getbdef(){
	return bdef;
    }

    public int getbmagicatk(){
	return bmagicatk;
    }

    public int getbmagicdef(){
	return bmagicdef;
    }

    public boolean checkDead(){
	return (HP == 0);
    }

}
