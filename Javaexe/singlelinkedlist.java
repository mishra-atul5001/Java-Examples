 class Node{
	Node next;
	int data;
	public Node(int data){
		this.data = data;
	}
}
 class simplelinkedlist{
	Node head;

	public void append(int data){
		if(head == null) {
			head = new Node(data);
			return ;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node( data);
	}

	public void prepen(int data){
		Node newhead = new Node(data);
		newhead.next = head;
		head = newhead;

	}

	public void delete(int data){
		if(head == null) return;
		if(head.data == data){
			head = head.next;
			return; 
		}
		Node current = head;
		while (current.next !=null) {
			if(current.next.data == data){
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	public void display(){
		Node n = new Node(10);
		simplelinkedlist sis = new simplelinkedlist();

		System.out.println(n.node);
		System.out.println(sis.head);
		System.out.println(sis.newhead);

		

	}

}
public class singlelinkedlist{
	public static void main(String[] args) {
		Node nodes = new Node(15);
		
		simplelinkedlist sim = new simplelinkedlist();
		sim.append(12);
		sim.prepen(10);
		sim.display();
	}
}