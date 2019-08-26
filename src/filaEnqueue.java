
public interface filaEnqueue <E>{
	long size();
	boolean isEmpty();
	/**
	 * método solicitado
	 * @param parâmetro para solicitar o animal.
	 */
	void enqueue(E e);
	/**
	 * Método que permitirá solicitar qualquer animal a ser retirado da fila.
	 */
	E dequeueAny();
	/**
	 * Método que permitirá solicitar o cachorro mais velho da fila.
	 */
	E dequeueDog();
	/**
	 * Método que permitirá solicitar o gato mais velho da fila.
	 */
	E dequeueCat(); 
	E dequeue();
	E front();
}
