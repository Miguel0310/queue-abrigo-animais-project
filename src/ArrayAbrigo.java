public class ArrayAbrigo<E> implements filaEnqueue<E> {

	/**
	 * É um índice de uma célula de Q que guarda o primeiro elemento da fila, a não ser que a fila esteja vazia.
	 * Quando se remove um elemento da frente da fila, incrementa-se f para indicar a próxima célula.
	 */
	protected int f = 0;
	/**
	 * é um índice de uma célula de Q que guarda o primeiro elemento da fila, a não ser que a fila esteja vazia.
	 */
	protected int r = 0;
	
	public static final int CAPACITY = 1000;
	protected int capacity;
	protected E Q[];
	protected E Dog[];
	protected E Cat[];
	protected E AnyDC[];
	public ArrayAbrigo() {
		this(CAPACITY);
	}
	public ArrayAbrigo(int capacity) {
		this.capacity = capacity;
		Q = (E[])new Object[this.capacity];
	}
	@Override
	public long size() {
		return (capacity-f+r)%capacity;
	}

	@Override
	public boolean isEmpty() {
		return (f == r);
	}

	@Override
	public void enqueue(E e) {
		if (size() == (capacity-1) ) {
			throw new FullQueueException("Sei la");
		}else {
			Q[r] = e;
			r = (r+1)%capacity;
		}
	}

	@Override
	public E dequeue() {
		if(isEmpty()) {
			throw new EmptyQueueException("Fila vacia");
		}
		E temp = Q[f];
		Q[f] = null;
		f = (f+1)%capacity;
		return temp;
	}

	@Override
	public E front() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E dequeueAny() {
		if(isEmpty()) {
			throw new EmptyQueueException("Fila vacia");
		}
		E temp = AnyDC[f];
		AnyDC[f] = null;
		f = (f+1)%capacity;
		return null;
	}

	@Override
	public E dequeueDog() {
		
		if(isEmpty()) {
			throw new EmptyQueueException("Fila vacia");
		}
		E temp = Dog[f];
		Dog[f] = null;
		f = (f+1)%capacity;
		return temp;
	}

	@Override
	public E dequeueCat() {
		
		if(isEmpty()) {
			throw new EmptyQueueException("Fila vacia");
		}
		E temp = Dog[f];
		Dog[f] = null;
		f = (f+1)%capacity;
		return temp;
	}
}