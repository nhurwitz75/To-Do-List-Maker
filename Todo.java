package todo;

//imports the needed java classes 
import java.util.Scanner; 
import java.util.ArrayList; 

public class Todo {
	public static void main(String[] args) {
		//Opening statements of introduction 
		System.out.println("Let's start making your to-do list"); 
		System.out.println("You will add tasks and their deadlines to have everything in one place"); 
		System.out.println("--------------------------------"); 
		
		//calls the mod method 
		mod(); 
	}
	
	//create a java scanner that can be used across all methods 
	private static Scanner task = new Scanner(System.in); 
	
	//Initializes three different java ArrayLists 
	private static ArrayList<String> work = new ArrayList<String>();
	private static ArrayList<String> personal = new ArrayList<String>();
	private static ArrayList<String> school = new ArrayList<String>(); 
	
	public static void mod() {
		//Initializes answer variable to be used later 
		String answer = ""; 
		
		//while the user inputed info for answer is not done
		while (!answer.equals("done")) {
			System.out.println("Do you want to add, remove, change, or be done? "); 
			answer = task.nextLine(); 
			
			if (answer.equals("add")) { 
				System.out.println("What do you want to add: "); 
				String add = task.nextLine().trim(); 
				System.out.println("Is it work, personal, or school related? ");
				String rel = task.nextLine().trim();
				if (rel.equals("work")) {
					work.add(add); 
				} else if (rel.equals("personal")) {
					personal.add(add); 
				} else if (rel.equals("school")) {
					school.add(add); 
				} else {
					System.out.println("not a valid input"); 
				}
			} else if (answer.equals("remove")) {
				System.out.println("What do you want to remove: "); 
				String remove = task.nextLine().trim(); 
				System.out.println("Is it work, personal, or school related? ");
				String rem = task.nextLine().trim();
				if (rem.equals("work")) {
					work.remove(remove); 
				} else if (rem.equals("personal")) {
					personal.remove(remove); 
				} else if (rem.equals("school")) {
					school.remove(remove); 
				} else {
					System.out.println("not a valid input"); 
				}
			} else if (answer.equals("change")) {
				System.out.println("Is it work, personal, or school related? ");
				String cha = task.nextLine().trim(); 
				
				if (cha.equals("work")) {
					System.out.println("What do you want to change? ");
					String oldw = task.nextLine().trim();
					System.out.println("What do you want to change it to? ");
					String neww = task.nextLine().trim(); 
					
					if (work.contains(oldw)) {
						work.set(work.indexOf(oldw), neww); 
					}
				} else if (cha.equals("personal")) {
					System.out.println("What do you want to change? ");
					String oldp = task.nextLine().trim();
					System.out.println("What do you want to change it to? ");
					String newp = task.nextLine().trim(); 
					
					if (personal.contains(oldp)) {
						personal.set(personal.indexOf(oldp), newp); 
					}
					
				} else if (cha.equals("school")) {
					System.out.println("What do you want to change? ");
					String olds = task.nextLine().trim();
					System.out.println("What do you want to change it to? ");
					String news = task.nextLine().trim(); 
					
					if (school.contains(olds)) {
						school.set(school.indexOf(olds), news); 
					}
				}
			} 
		}	
		System.out.println("--------------------------------");
		System.out.println("Here is your final to-do list:"); 
		System.out.println("");
		
		System.out.println("Work: ");
		System.out.println(work); 
		System.out.println("");
		
		System.out.println("Personal: ");
		System.out.println(personal);
		System.out.println("");
		
		System.out.println("School: ");
		System.out.println(school);  
		System.out.println("");
	}
}
