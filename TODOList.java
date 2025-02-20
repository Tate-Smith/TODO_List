/*
 * uses an ArrayList to create a todo list full of Task
 * objects. Task objects are added to the end of the list 
 * and removed from the start emulating a queue, but priority 
 * tasks are at the top of the list in the order they were
 * added.
 */

package Model;

import java.util.ArrayList;

public class TODOList {
	private ArrayList<Task> todo_list;
	
	public TODOList() {
		this.todo_list = new ArrayList<Task>();
	}
	
	public void addTask(Task task) {
		/*
		 * if the task is a priority then increment through
		 * the list to find the first non priority task and put 
		 * the priority task ahead of that one. If not priority
		 * then just add to end of list
		 */
		if (task.getPriority()) {
			if (todo_list.size() == 0) {
				todo_list.add(task);
			}
			else {
				for (int i = 0; i < todo_list.size(); i++) {
					if (!todo_list.get(i).getPriority()) {
						// if the task is not priority insert priority task here then break
						todo_list.add(i, task);
						break;
					}
				}
			}
		}
		else todo_list.add(task);
	}
	
	public void removeTask() {
		// remove the task at the top
		todo_list.remove(0);
	}
	
	public void removeTask(String name) {
		// remove a specific task
		for (Task t : todo_list) {
			if (t.getName().equals(name)) {
				todo_list.remove(t);
				break;
			}
		}
	}
	
	public ArrayList<Task> getList() {
		return new ArrayList<>(todo_list);
	}
	
	public void changeName(String task, String name) {
		// change the name of a specific task
		for (Task t : todo_list) {
			if (t.getName().equals(task)) { 
				t.changeName(name);
				break;
			}
		}
	}
	
	public void changeDueDate(String task, String due_date) {
		// change the due date of a specific task
		for (Task t : todo_list) {
			if (t.getName().equals(task)) { 
				t.changeDue_date(due_date);
				break;
			}
		}
	}
	
	public void changePriority(String task, String priority) {
		// change the priority of a specific task
		Boolean p = false;
		if (priority.toLowerCase() == "yes") p = true;
		for (Task t : todo_list) {
			if (t.getName().equals(task)) { 
				t.changePriority(p);
				break;
			}
		}
	}
	
	public void changeDescription(String task, String description) {
		// change the description of a specific task
		for (Task t : todo_list) {
			if (t.getName().equals(task)) { 
				t.changeDescription(description);
				break;
			}
		}
	}
	
	public String toString() {
		String str = "";
		str += "TODO List:\n";
		for (Task t : todo_list) str += t.toString();
		return str;
	}
}
