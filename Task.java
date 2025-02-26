/*
 * Task class that holds information about the task
 * like its name, description, an optional due date, 
 * and if it is priority or not
 */

package Model;

public class Task {
	private String name;
	private String description;
	private String due_date;
	private Boolean priority;
	
	public Task(String name, String description, Boolean priority) {
		this.name = name;
		this.description = description;
		this.priority = priority;
		this.due_date = "None";
	}
	
	// copy constructor for deep copies of the TODOList
	public Task(Task task) {
		this.name = task.getName();
		this.description = task.getDescription();
		this.priority = task.getPriority();
		this.due_date = task.getDue_Date();
	}
	
	public void changePriority(Boolean priority) {
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public void changeName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void changeDescription(String description) {
		this.description = description;
	}

	public String getDue_Date() {
		return due_date;
	}

	public void changeDue_date(String due_date) {
		this.due_date = due_date;
	}

	public Boolean getPriority() {
		return priority;
	}
	
	public String toString() {
		int length = 0;
		if (description.length() >= name.length() && description.length() >= due_date.length()) {
			length = description.length();
		}
		else if (name.length() >= description.length() && name.length() >= due_date.length()) {
			length = name.length();
		}
		else {
			length = due_date.length();
		}
		String str = "+-"; // top out line bar
		for (int i = 0; i < length; i++) str += "-";
		str += "-+\n";
		
		str += "| " + name; // name at the top
		for (int i = 0; i < (length - name.length()); i++) str += " ";
		str += " |\n";
		
		str += "| " + due_date; // then due_date, None if was never given one
		for (int i = 0; i < (length - due_date.length()); i++) str += " ";
		str += " |\n";
		
		String priority = " ";
		if (this.getPriority()) priority = "+";
		else priority = "-";
		str += "| " + priority; // then priority, + if it is a priority blank if not
		for (int i = 0; i < (length - 1); i++) str += " ";
		str += " |\n";
		
		str += "| " + description; // lastly the description
		for (int i = 0; i < (length - description.length()); i++) str += " ";
		str += " |\n";
		
		str += "+-";
		for (int i = 0; i < length; i++) str += "-";
		str += "-+\n"; // bottom bar
		return str;
	}
}
