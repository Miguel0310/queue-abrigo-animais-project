
public interface filaEnqueue <E>{
	long size();
	boolean isEmpty();
	/**
	 * m�todo solicitado
	 * @param par�metro para solicitar o animal.
	 */
	void enqueue(E e);
	/**
	 * M�todo que permitir� solicitar qualquer animal a ser retirado da fila.
	 */
	E dequeueAny();
	/**
	 * M�todo que permitir� solicitar o cachorro mais velho da fila.
	 */
	E dequeueDog();
	/**
	 * M�todo que permitir� solicitar o gato mais velho da fila.
	 */
	E dequeueCat(); 
	E dequeue();
	E front();
}
