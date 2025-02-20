package Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {
	private Task t = new Task("Homework1", "Homework due in my math class", false);

	@Test
	public void testDueDate() {
		t.changeDue_date("3/6/2025");
		Assertions.assertEquals(t.getDue_Date(), "3/6/2025");
	}
	
	@Test
	public void testPriority() {
		t.changePriority(true);
		Assertions.assertTrue(t.getPriority());
	}
	
	@Test
	public void testName() {
		t.changeName("Homework 1.1");
		Assertions.assertEquals(t.getName(), "Homework 1.1");
	}
	
	@Test
	public void testDEscription() {
		t.changeDescription("Homework problems 1a-f, 2, 7, 18, 27");
		Assertions.assertEquals(t.getDescription(), "Homework problems 1a-f, 2, 7, 18, 27");
	}
	
	@Test
	public void testToString() {
		Task t2 = new Task("Clean room", "Clean room before friends come", true);
		Assertions.assertEquals(t2.toString(), "+--------------------------------+\n"
											 + "| Clean room                     |\n"
											 + "| None                           |\n"
											 + "| +                              |\n"
											 + "| Clean room before friends come |\n"
											 + "+--------------------------------+\n");
		Task t3 = new Task("Make bed", "Make bed", false);
		Assertions.assertEquals(t3.toString(), "+----------+\n"
											 + "| Make bed |\n"
											 + "| None     |\n"
											 + "| -        |\n"
											 + "| Make bed |\n"
											 + "+----------+\n");
	}
}
