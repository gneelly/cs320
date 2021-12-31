package cs320mod5;

public class Contact {
	String contactID;
	String firstName;
	String lastName;
	String phnNum;
	String address;

	
	//contact constructor
	public Contact(String contactID, String firstName, String lastName, String phnNum, String address) {
		super();
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phnNum = phnNum;
		this.address = address;
	}

	//getters
	
	public String getContactID() {
		return contactID;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phnNum;
	}
	
	public String getAddress() {
		return address;
	}

	//setters
	
	public void setContactID(String contactID) {
		this.contactID = contactID;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPhoneNumber(String num) {
		this.phnNum = num;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	//validators

	 public boolean validateContactID(String contactID) {
	        if (contactID != null && !contactID.isEmpty() && contactID.length() <= 10) {
	            return true;
	        }
	        return false;
	    }
	    public boolean validatefirstName(String firstName) {
	        if (firstName != null && !firstName.isEmpty() && firstName.length() <= 10) {
	            return true;
	        }
	        return false;
	    }
	     public boolean validatelastName(String lastName) {
	        if (lastName != null && !lastName.isEmpty()&& lastName.length() <= 10) {
	            return true;
	        }
	        return false;
	    }
	     public boolean validateNumber(String num) {
	        if (num != null && !phnNum.isEmpty() && phnNum.length() <= 10) {
	            return true;
	        }
	        return false;
	    }
	     public boolean validateAddress(String Address) {
	        if (Address != null&& !Address.isEmpty() && Address.length() <= 30) {
	            return true;
	        }
	        return false;
	    }

}