import java.util.LinkedList;
import java.util.Scanner;

public class WordLinkedList {

	private LinkedList<String> list;
	
	
	public WordLinkedList() {
		list = new LinkedList<>();
	}


	public WordLinkedList(LinkedList<String> list) {
		this.list = list;
	}
	
	
	public LinkedList<String> getList() {
		return list;
	}


	public void setList(LinkedList<String> list) {
		this.list = list;
	}


	public void menu() {
		
		
		char option = ' ';
		
		Scanner keyboard = new Scanner(System.in);
		String word = " ";
		int position = 0;		
		
			
		
			do {
				
					System.out.println("1- Insert word at the beginning.");
					System.out.println("2- Insert word at a given position.");
					System.out.println("3- Delete from the beginning.");
					System.out.println("4- Delete from given position.");
					System.out.println("5- Display the complete list.");
					System.out.println("6- Search for a specific word. ");
					System.out.println("7- Exit.");
				
					option = keyboard.next().charAt(0);
				
					switch(option) {
					
					case '1':
							System.out.println("Please enter the word:");
							word = keyboard.next();
								this.list.addFirst(word);
						break;
					case '2':
							System.out.println("Please enter the word:");
							word = keyboard.next();
								this.list.add(position, word);
						break;
					case '3':
						System.out.println("Please enter the word:");
						word = keyboard.next();
							this.list.removeFirst();
						break;
					case '4':
						System.out.println("Please enter the word:");
						word = keyboard.next();
							this.list.remove(position);
						break;
					case '5':
								for (int i = 0; i < this.list.size(); i++) {
										System.out.println(i+1 + "- " + this.list.get(i));
								}
						
						break;
					case '6':
							System.out.println("Please enter the word:");
							word = keyboard.next();
				
								if(this.list.contains(word))
									System.out.println("List contains the given word.");
								else
									System.out.println("List does not contain the given word.");
										
							
						break;
					case '7':
							System.out.println("Aborting the program...");
						break;
					default:
							System.out.println("Invalid option. Please try again.");
		
					
					}
				
				

				
			}while(option != '7');
			
			
			
			keyboard.close();
			
	}
	
	
}
