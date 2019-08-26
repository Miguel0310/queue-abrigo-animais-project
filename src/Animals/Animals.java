package Animals;

public abstract class Animals {
	/**
	 * tempo é utilizado para saber quando entro o animal no abrigo.
	 */
	private long tempo;
	/**
	 * tipo é para saber o tipo de animal que entro no abrigo.
	 */
	private String tipo;
	/**
	 * nome é para saber o nome do animal que entrou no abrigo.
	 */
	private String nome;
	
	public long getTempo() {
		return tempo;
	}
	public void setTempo(long tempo) {
		this.tempo = tempo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void play();
	
	public Animals autoTempo(long tempo) {
		this.tempo = tempo;
		return this;
	}
	
}
