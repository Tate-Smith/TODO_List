package Model;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TODOListTest {

	@Test
	void testAddTask() {
		TODOList list = new TODOList();
		Task t1 = new Task("Clean room", "Clean room before friends come", true);
		Task t2 = new Task("Make bed", "Make bed", false);
		Task t3 = new Task("do homework", "math and english homework", true);
		list.addTask(t1);
		list.addTask(t2);
		list.addTask(t3);
		ArrayList<Task> tasks = list.getList();
		Assertions.assertEquals(tasks.size(), 3);
	}
	
	@Test
	void testRemoveTask() {
		TODOList list = new TODOList();
		Task t1 = new Task("Clean room", "Clean room before friends come", true);
		Task t2 = new Task("Make bed", "Make bed", false);
		list.addTask(t1);
		list.addTask(t2);
		list.removeTask();
		ArrayList<Task> tasks = list.getList();
		Assertions.assertEquals(tasks.size(), 1);
	}
	
	@Test
	void testRemoveTaskTwo() {
		TODOList list = new TODOList();
		Task t1 = new Task("Clean room", "Clean room before friends come", true);
		Task t2 = new Task("Make bed", "Make bed", false);
		list.addTask(t1);
		list.addTask(t2);
		list.removeTask("Make bed");
		ArrayList<Task> tasks = list.getList();
		Assertions.assertEquals(tasks.size(), 1);
	}
	
	@Test
	void testChangeName() {
		TODOList list = new TODOList();
		Task t1 = new Task("Clean room", "Clean room before friends come", true);
		Task t2 = new Task("Make bed", "Make bed", false);
		list.addTask(t1);
		list.addTask(t2);
		list.changeName("Clean room", "Pick up clothes");
		ArrayList<Task> tasks = list.getList();
		Assertions.assertEquals(tasks.get(0).getName(), "Pick up clothes");
	}
	
	@Test
	void testChangeDueDate() {
		TODOList list = new TODOList();
		Task t1 = new Task("Clean room", "Clean room before friends come", true);
		Task t2 = new Task("Make bed", "Make bed", false);
		list.addTask(t1);
		list.addTask(t2);
		list.changeDueDate("Make bed", "Tomorrow");
		ArrayList<Task> tasks = list.getList();
		Assertions.assertEquals(tasks.get(1).getDue_Date(), "Tomorrow");
	}
	
	@Test
	void testChangePriority() {
		TODOList list = new TODOList();
		Task t1 = new Task("Clean room", "Clean room before friends come", true);
		Task t2 = new Task("Make bed", "Make bed", false);
		list.addTask(t1);
		list.addTask(t2);
		list.changePriority("Make bed", "yes");
		ArrayList<Task> tasks = list.getList();
		Assertions.assertEquals(tasks.get(1).getPriority(), true);
	}
	
	@Test
	void testChangeDescription() {
		TODOList list = new TODOList();
		Task t1 = new Task("Clean room", "Clean room before friends come", true);
		Task t2 = new Task("Make bed", "Make bed", false);
		list.addTask(t1);
		list.addTask(t2);
		list.changeDescription("Clean room", "pick up all your clothes");
		ArrayList<Task> tasks = list.getList();
		Assertions.assertEquals(tasks.get(0).getDescription(), "pick up all your clothes");
	}
	
	@Test
	void testToString() {
		TODOList list = new TODOList();
		Task t1 = new Task("Clean room", "Clean room before friends come", true);
		Task t2 = new Task("Make bed", "Make bed", false);
		list.addTask(t1);
		list.addTask(t2);
		Assertions.assertEquals(list.toString(), "TODO List:\n+--------------------------------+\n"
															 + "| Clean room                     |\n"
															 + "| None                           |\n"
															 + "| +                              |\n"
															 + "| Clean room before friends come |\n"
															 + "+--------------------------------+\n+----------+\n"
															 + "| Make bed |\n"
															 + "| None     |\n"
															 + "| -        |\n"
															 + "| Make bed |\n"
															 + "+----------+\n");
	}
}
