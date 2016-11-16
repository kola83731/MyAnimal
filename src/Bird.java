
public class Bird extends Animal {
	
	public Bird(){
		System.out.print("Now I am a bird!");
	}
    @Override
    public String sleep(){
    	return "A bird sleeps..";
    }
    @Override
    public String eat(){
    	return "A bird eats..";
    }
    public String fly(){
    	return "A bird fly...";
    }
}
