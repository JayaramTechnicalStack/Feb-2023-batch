import java.util.NoSuchElementException;

public class DoublyLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	
	private class Node<T>{
		private T data;
		
		private Node<T> prev;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
		
	}
	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			newNode.next =head;
			head.prev = newNode;
			head = newNode;
		}
	}
	
	public void addLast(T data) {
		Node<T> newNode = new Node<>(data);
		if(tail == null) {
			head = newNode;
			tail = newNode;
		}else {
			
			newNode.next =tail;
			tail.prev = newNode;
			tail = newNode;
		}
	}
	public void add(T data , int position) {
		if(position<0) {
			throw new IndexOutOfBoundsException("Position cannot be negitive :"+position);
		}
		Node<T> newNode = new Node<>(data);
		if(position ==0) {
			addFirst(data);
		}else {
			Node<T> current = head;
			for(int i=0;i<position-1;i++) {
				if(current == null) {
					throw new IndexOutOfBoundsException("Position exceeds size of List:"+position);
				}
				current = current.next;
			}
			if(current == tail) {
				addLast(data);
			}else {
				newNode.prev = current;
				newNode.next = current.next;
				current.next.prev = newNode;
				current.next = newNode;
				
				
			}
		}
	}
	public T RemoveFirst() {
		if(head == null) {
			throw new NoSuchElementException("List is empty");
		}
		T data =head.data;
		if(head == tail) {
			head=null;
			tail = null;
		}else {
			head = head.next;
			head.prev = null;
		}
		return data;
	}
	
}
