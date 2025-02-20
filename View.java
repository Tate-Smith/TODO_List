/*
 * Main class that takes user input and displays the list
 */

package Model;

import java.util.Scanner;

public class View {
	private static TODOList list = new TODOList();;
	private static Scanner reader = new Scanner(System.in);
	public static void addTask() {
		// add task function that prompts the user for more info
		System.out.print("Name: ");
		String name = reader.nextLine();
		System.out.print("Description: ");
		String description = reader.nextLine();
		System.out.print("Due date: ");
		String due_date = reader.nextLine();
		System.out.print("Priority: ");
		String priority = reader.nextLine();
		Boolean p = false;
		if (priority.toLowerCase().equals("yes")) p = true;
		Task task = new Task(name, description, p);
		if (!due_date.toLowerCase().equals("none")) task.changeDue_date(due_date);
		list.addTask(task);
	}
	
	public static void removeTask() {
		// remove task function that prompts the user for more info
		System.out.println("Name:");
		String name = reader.nextLine();
		if (name.toLowerCase().equals("top")) list.removeTask();
		else list.removeTask(name);
	}
	
	public static void changeName() {
		// change name function that prompts the user for more info
		System.out.println("Task Name: ");
		String task = reader.nextLine();
		System.out.println("New Name: ");
		String name = reader.nextLine();
		list.changeName(task, name);
	}
	
	public static void changeDueDate() {
		// change due date function that prompts the user for more info
		System.out.println("Task Name: ");
		String task = reader.nextLine();
		System.out.println("New Due Date: ");
		String due_date = reader.nextLine();
		list.changeDueDate(task, due_date);
	}
	
	public static void changePriority() {
		// change priority function that prompts the user for more info
		System.out.println("Task Name: ");
		String task = reader.nextLine();
		System.out.println("New Priority: ");
		String priority = reader.nextLine();
		list.changePriority(task, priority);
	}
	
	public static void changeDescription() {
		// change description function that prompts the user for more info
		System.out.println("Task Name: ");
		String task = reader.nextLine();
		System.out.println("New Description: ");
		String description = reader.nextLine();
		list.changeDescription(task, description);
	}

	public static void main(String[] args) {
		Boolean exit = false;
		System.out.println(list);
		while (!exit) {
			System.out.println("Command: ");
			String userInput = reader.nextLine();
			userInput = userInput.toLowerCase();
			// check what the user command was
			if (userInput.equals("add task")) addTask();
			else if (userInput.equals("remove")) removeTask();
			else if (userInput.equals("get list")) System.out.println(list);
			else if (userInput.equals("change name")) changeName();
			else if (userInput.equals("change due date")) changeDueDate();
			else if (userInput.equals("change priority")) changePriority();
			else if (userInput.equals("change description")) changeDescription();
			else if (userInput.equals("exit")) exit = true;
			else {
				System.out.println("ERROR: invalid response, use one of the following commands:\n"
						+ "remove\nget list\nchange name\nchange due date\nchange priority\nchange description\nexit\n");
			}
		}
		reader.close();
	}

}
