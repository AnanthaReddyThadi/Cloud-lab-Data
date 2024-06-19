package wiproPro;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
public class DeQeueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> deque= new ArrayDeque<String>();
		
		
		deque.add("H");
		deque.add("M");
		deque.add("N");
		System.out.println(deque);
		deque.pollFirst();
		deque.pollLast();
		deque.addFirst("A");
		deque.addLast("z");
		System.out.println(deque);
		deque.removeFirst();
		deque.removeLast();
		
		System.out.println(deque);
		
		 PriorityQueue<String> queue=new PriorityQueue<String>();
		 
		
		
		
		
		queue.add("Kabadi");
		queue.add("ko ko");
		queue.add("batmantan");
		queue.add("Shooting");
		queue.add("Javalin Throw");
		System.out.println(queue);
		System.out.println(queue.element());
		System.out.println(queue.poll());
	    System.out.println(queue);
		
		
		
		
		
		
	}

}
