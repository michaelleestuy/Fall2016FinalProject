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

    

}
