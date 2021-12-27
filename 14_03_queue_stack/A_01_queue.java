import java.util.LinkedList;
import java.util.Queue;
import javax.sound.midi.Synthesizer;

public class A_01_queue {
    public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
//		1. add
		q.add("apple");
		q.add("banana");
		q.add("cherry");
		q.add("tomato");
		System.out.println(q);
//		2. element front
		System.out.println("element:"+q.element());
//		3. remove
		System.out.println("remove:"+q.remove());
		System.out.println(q);
//		4. offer(e) 
		q.offer("peach");
		System.out.println(q);
//		5.peek() front
		System.out.println("peek:"+q.peek());
		System.out.println(q);
//		6. poll() 
		System.out.println("poll:"+q.poll());
		System.out.println(q);
	}

}
