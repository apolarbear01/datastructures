import java.util.NoSuchElementException;

public class MarryingEve {

	
			public class Node {
				
						private Integer number;
						private Node link;
						
						public Node() {
							number = 0;
							link = null;
						}
						
						public Node(Integer number, MarryingEve.Node link) {
							this.number = number;
							this.link = link;
						}
				
						public Integer getNumber() {
							return number;
						}
				
						public void setNumber(Integer number) {
							this.number = number;
						}
				
						public Node getLink() {
							return link;
						}
				
						public void setLink(Node link) {
							this.link = link;
						}
				}
		
		
		private Node head;
		private Node tail;
		private int size;
				
		public int getSize() {
			return size;
		}



		public void setSize(int size) {
			this.size = size;
		}



		public MarryingEve() {
			head = null;
		}
		
		
		
		public void add(int anyNumber) {
			
			Node newNode = new Node(anyNumber,null);
			
			
				if(head == null) {
					head = newNode;
					tail = newNode;
					newNode.link = head;
				}else {
					tail.link = newNode;
					tail = newNode;
					tail.link = head;
				}
				
			size++;
						
		}

		
		public void addToStart(int anyNumber ) {
			head = new Node(anyNumber,head);
		}


		@Override
		public String toString() {
					
			Node position = head;
			
			for (int i = 0; i < size; i++) {
				System.out.println(position.getNumber());
			}
			
			return "";
		}
		
		
		
	
		public void removeThird() throws NoSuchElementException {
			
			Node current = head;
			Node currentPrevious = current;
			int count = 1;
			
				if(head == null) throw new NoSuchElementException();
				
			
					do {
				
	
							if(count % 3 == 0) {
								
								System.out.println("Suitor " + current.getNumber() + " eliminated. Counting from " + current.link.getNumber() + "..."); 
								
								currentPrevious.link = current.link;
								size--;
							}
							
							
							count++;
							currentPrevious = current;
							current = current.link;
						
						
					}while(size != 1);
				
					
					head = current;
			
		}
		
		
		
		
	
}
