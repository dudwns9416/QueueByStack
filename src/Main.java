
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new Queue<>();
		queue.enqueue("first");
		queue.enqueue("second");
		queue.enqueue("third");
		
		while(!queue.isEmpty()){
			System.out.println(queue.dequeue());
		}
	}

}
