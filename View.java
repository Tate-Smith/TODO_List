package Model;

import java.util.Scanner;

public class View {
	private static TODOList list;
	public static void addTask() {
		// add task function that prompts the user for more info
		Scanner reader = new Scanner(System.in);
		System.out.print("Name: ");
		String name = reader.nextLine();
		System.out.print("Description: ");
		String description = reader.nextLine();
		System.out.print("Due date: ");
		String due_date = reader.nextLine();
		System.out.print("Priority: ");
		String priority = reader.nextLine();
		Boolean p = false;
		if (priority.toLowerCase() == "yes") p = true;
		Task task = new Task(name, description, p);
		if (due_date .toLowerCase()!= "none") task.changeDue_date(due_date);
		list.addTask(task);
		reader.close();
	}
	
	public static void removeTask() {
		// remove task function that prompts the user for more info
		Scanner reader = new Scanner(System.in);
		System.out.println("Name:");
		String name = reader.nextLine();
		if (name.toLowerCase() == "top") list.removeTask();
		else list.removeTask(name);
		reader.close();
	}
	
	public static void changeName() {
		// change name function that prompts the user for more info
		Scanner reader = new Scanner(System.in);
		System.out.println("Task Name: ");
		String task = reader.nextLine();
		System.out.println("New Name: ");
		String name = reader.nextLine();
		list.changeName(task, name);
		reader.close();
	}
	
	public static void changeDueDate() {
		// change due date function that prompts the user for more info
		Scanner reader = new Scanner(System.in);
		System.out.println("Task Name: ");
		String task = reader.nextLine();
		System.out.println("New Due Date: ");
		String due_date = reader.nextLine();
		list.changeDueDate(task, due_date);
		reader.close();
	}
	
	public static void changePriority() {
		// change priority function that prompts the user for more info
		Scanner reader = new Scanner(System.in);
		System.out.println("Task Name: ");
		String task = reader.nextLine();
		System.out.println("New Priority: ");
		String priority = reader.nextLine();
		list.changePriority(task, priority);
		reader.close();
	}
	
	public static void changeDescription() {
		// change description function that prompts the user for more info
		Scanner reader = new Scanner(System.in);
		System.out.println("Task Name: ");
		String task = reader.nextLine();
		System.out.println("New Description: ");
		String description = reader.nextLine();
		list.changeDescription(task, description);
		reader.close();
	}

	public static void main(String[] args) {
		Boolean exit = false;
		while (!exit ) {
			Scanner reader = new Scanner(System.in);
			String userInput = reader.nextLine();
			list = new TODOList();
			// check what the user command was
			if (userInput.toLowerCase() == "add task") addTask();
			else if (userInput.toLowerCase() == "remove" ) removeTask();
			else if (userInput.toLowerCase() == "get list" ) System.out.println(list);
			else if (userInput.toLowerCase() == "change name" ) changeName();
			else if (userInput.toLowerCase() == "change due date" ) changeDueDate();
			else if (userInput.toLowerCase() == "change priority" ) changePriority();
			else if (userInput.toLowerCase() == "change description" ) changeDescription();
			else if (userInput.toLowerCase() == "exit" ) exit = true;
			else {
				System.out.println("ERROR: invalid response, use one of the following commands:\n"
						+ "remove\nget list\nchange name\nchange due date\nchange priority\nchange description\nexit\n");
			}
			reader.close();
		}
	}

}
