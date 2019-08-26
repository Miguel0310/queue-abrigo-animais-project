import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AbrigoTest<E> {

	@Test
	public void isEmpty() {
		filaEnqueue<Integer> queue = new ArrayAbrigo<Integer>();
		assertEquals("A fila deve estar vazia",true,queue.isEmpty());
	}
	
	@Test
	public void enqueue() {
		filaEnqueue<String> queue = new ArrayAbrigo<String>();
		queue.enqueue("cachorro1");
		assertEquals("Fila deve conter um elemento",1,queue.size());
	}
	
	@Test
	public void dequeue() {
		filaEnqueue<String> queue = new ArrayAbrigo<String>();
		queue.enqueue("cachorro1");
		queue.enqueue("cachorro2");
		assertEquals("Front deve retornar o elemento cachorro1","cachorro1",(String)queue.dequeue());
		assertEquals("Fila deve conter um elemento",1,queue.size());
	}
	
	@Test
	public void dequeueAny() {
		filaEnqueue<String> queue = new ArrayAbrigo<String>();
		queue.enqueue("cachorro1");
		queue.enqueue("cachorro2");
		assertEquals("Front deve retornar o elemento o primeiro elemento da fila","cachorro1",(String)queue.dequeue());
		assertEquals("Fila deve conter um elemento",1,queue.size());
	}
	
	@Test
	public void dequeueDog() {
		filaEnqueue<String> queue = new ArrayAbrigo<String>();
		queue.enqueue("cachorro1");
		queue.enqueue("cachorro2");
		assertEquals("Front deve retornar o elemento o primeiro elemento da fila","cachorro1",(String)queue.dequeue());
		assertEquals("Fila deve conter um elemento",1,queue.size());
	}
	
	@Test
	public void dequeueCat() {
		filaEnqueue<String> queue = new ArrayAbrigo<String>();
		queue.enqueue("gato1");
		queue.enqueue("gato2");
		assertEquals("Front deve retornar o elemento o primeiro elemento da fila","gato1",(String)queue.dequeue());
		assertEquals("Fila deve conter um elemento",1,queue.size());
	}
	
}