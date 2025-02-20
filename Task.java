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
		String str = "+-"; // top out line bar
		for (int i = 0; i < description.length(); i++) str += "-";
		str += "-+\n";
		
		str += "| " + name; // name at the top
		for (int i = 0; i < (description.length() - name.length()); i++) str += " ";
		str += " |\n";
		
		str += "| " + due_date; // then due_date, None if was never given one
		for (int i = 0; i < (description.length() - due_date.length()); i++) str += " ";
		str += " |\n";
		
		String priority = " ";
		if (this.getPriority()) priority = "+";
		else priority = "-";
		str += "| " + priority; // then priority, + if it is a priority blank if not
		for (int i = 0; i < (description.length() - 1); i++) str += " ";
		str += " |\n";
		
		str += "| " + description + " |\n"; // lastly the description
		
		str += "+-";
		for (int i = 0; i < description.length(); i++) str += "-";
		str += "-+\n"; // bottom bar
		return str;
	}
}
