public abstract class Character{
    private int HP;
    private int MP;

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

}
