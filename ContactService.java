package cs320mod5;

import java.util.ArrayList;

public class ContactService {

	//list of contacts
	private ArrayList<Contact> contacts;
	
	
	//initialize contact list
	public ContactService() {
		contacts = new ArrayList<>();
	}

	//add contact
	public boolean addContact(Contact contact) {
		boolean contactAlready = false;
		//iterate through contact list
		for (Contact contactList : contacts) {
			if (contactList.equals(contact)) {
				contactAlready = true;
			}
		}
		//if contact is not already present then add
		if (!contactAlready) {
			contacts.add(contact);
			return true;
		} else {
			return false;
		}
	}

	//update contact
	public boolean updateContact(String contactID, String firstName, String lastName, String phnNum,
			String address) {
		for (Contact contactList : contacts) {//check if contact is empty
			if (contactList.getContactID().equals(contactID)) {
				if (!firstName.equals("") && !(firstName.length() > 10)) {
					contactList.setFirstName(firstName);
				}
				if (!lastName.equals("") && !(lastName.length() > 10)) {
					contactList.setFirstName(lastName);
				}
				if (!phnNum.equals("") && (phnNum.length() == 10)) {
					contactList.setFirstName(phnNum);
				}
				if (!address.equals("") && !(address.length() > 30)) {
					contactList.setFirstName(address);
				}
				return true;
			}
		}
		return false;
	}
	
	//delete contact
	public boolean deleteContact(String contactID) {
		for (Contact contactList : contacts) {// check if contact in contact list
			if (contactList.getContactID().equals(contactID)) {
				contacts.remove(contactList);
				return true;
			}
		}
		return false;
	}
}