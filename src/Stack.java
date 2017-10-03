public class Stack<T> {

	private static final int MAX_SIZE = 1000;
	private T[] datas = (T[]) new Object[MAX_SIZE];
	private int lastIndex = -1;

	public void push(T data) {
		datas[++lastIndex] = data;
	}

	public T pop() {
		if (isEmpty()) {
			return null;
		}

		return datas[lastIndex--];
	}

	public boolean isEmpty() {
		return lastIndex == -1;
	}
}