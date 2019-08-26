package Animals;

public class Cats extends Animals{
	private Cats(String name) {
		super();
		setNome(name);
		setTempo(System.currentTimeMillis());
	}
	
	@Override
	public void play() {
		System.out.println("gato: "+getNome());
	}
	
}
