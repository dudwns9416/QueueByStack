public class Queue<T> {

	private Stack<T> firstStack = new Stack<>();
	private Stack<T> secondStack = new Stack<>();

	public void enqueue(T data) {
		firstStack.push(data);
	}

	public T dequeue() {
		while (!firstStack.isEmpty()) {
			secondStack.push(firstStack.pop());
		}

		return secondStack.pop();
	}
	
	public boolean isEmpty(){
		return firstStack.isEmpty() && secondStack.isEmpty();
	}
}
