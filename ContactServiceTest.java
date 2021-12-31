package cs320mod5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContactServiceTest {

	@Test
	public void testAdd() {
		ContactService cs = new ContactService();
		Contact test1 = new Contact("12345678", "John", "Doe", "55555555", "123 North Drive");
		assertEquals(true, cs.addContact(test1));
	}

	@Test
	public void testDelete() {
		ContactService cs = new ContactService();

		Contact test1 = new Contact("12345678", "John", "Doe", "5555555555", "123 North Drive");
		Contact test2 = new Contact("87654321", "Joe", "Dirt", "6666666666", "456 West Ave");
		Contact test3 = new Contact("13579010", "Jane", "Bane", "7777777777", "890 South Street");

		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);

		assertEquals(true, cs.deleteContact("87654321"));
		assertEquals(false, cs.deleteContact("87654322"));
		assertEquals(false, cs.deleteContact("87654321"));
	}

	@Test
	public void testUpdate() {
		ContactService cs = new ContactService();

		Contact test1 = new Contact("12345678", "John", "Doe", "5555555555", "123 North Drive");
		Contact test2 = new Contact("87654321", "Joe", "Dirt", "6666666666", "456 West Ave");
		Contact test3 = new Contact("9752319", "Jane", "Bane", "7777777777", "890 South Street");

		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);

		assertEquals(true, cs.updateContact("9752319", "JaneDane", "Bane", "7777777777", "890 South Street"));
		assertEquals(false,
				cs.updateContact("135790100", "Jane", "Bane", "7777777777000", "890 South Street"));
	}

}