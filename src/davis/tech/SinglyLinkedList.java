package davis.tech;
/**
 * 
 * @author CYPRIAN
 *
 * @param <T>
 */

public class SinglyLinkedList<T> {
	//inner Node class
		private static class Node<T>{
			private T element; //reference to the element stored at this node
			private Node<T> next; //reference to the subsequent node in the list
			
			//constructor
			public Node(T e) {
				this.element = e ;
				
			}
			//returns element stored at this node
			public T getElement() {
				return this.element;	
			}
			public Node<T> getNext(){
				return this.next;
			}
			public void setNext(Node<T> e) {
				this.next = e;
			}
			
		}
		//instance variables of the SinglyLinked List
		private Node<T> head = null; //head node of the list
		private Node<T>tail = null; //tail node of the list
		private int size =0;			//number of nodes in the list
		
		//constructor
		public SinglyLinkedList() {
			
		}
		//returns the number of nodes in the list
		public int getSize() {
			return this.size;	
		}
		
		public boolean isEmpty() {
			return this.size ==0;
		}
		//returns but doesnot remove the first element in the list
		public T getFirst() {
			if(isEmpty())
				return null;
			return this.head.getElement();
		}
		//returns but doesnot remove the last elemnt in the list
		public T getLast() {
			if(isEmpty()) 
				return null;
			
			return this.tail.getElement();
		}
		//Adds element at the front of the list
		public void addFirst(T e) {
			//create new node
			Node<T> node = new Node<>(e);
			//first check if the list is empty
			if(isEmpty()) {
				head =tail = node;
			}
			//set new node to point the head as the next node
			node.setNext(head);
			//set head to the new Node
			head = node;
			//increment list by one
			size ++;
		}
		//Adds element at the end of the list
		public void addLast(T e) {
			//create new node
			Node<T> node = new Node<>(e);
			//first check if the list is empty
			if(isEmpty())
				head = tail =node;
			//set new node's next to null
			node.setNext(null);
			//set old node's next to new node
			tail.setNext(node);
			//set tail to new node
			tail = node;
			//increament by one
			size++;
		}
		//removes and returns the first element in the list
		public T removeFirst() {
			if(isEmpty())
				return null;
			T hd = head.getElement();
			head = head.getNext();
			size--;
			return hd;
		}
		
		//Tests if two lists are equal
		public boolean equals(Object b) {
			if(b == null) 
				return false;
			if(getClass()!= b.getClass())
				return false;
			@SuppressWarnings("rawtypes")
			SinglyLinkedList list = (SinglyLinkedList) b;
			if(size != list.size)
				return false;
			Node<T> travA = head;
			
			@SuppressWarnings("unchecked")
			Node<T> travB = list.head;
			
			while(travA != null) {
				if(!travA.getElement().equals(travB.getElement()))
					return false;
				travA = travA.getNext();
				travB = travB.getNext();
			}
			return true;
			
		}
}//end
