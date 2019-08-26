package Animals;

public class Dogs extends Animals{
	private Dogs (String nome) {
		super();
		setNome(nome);
		setTempo(System.currentTimeMillis());
	}

	@Override
	public void play() {
		
		System.out.println("Cachorro: "+getNome());
	}

}
