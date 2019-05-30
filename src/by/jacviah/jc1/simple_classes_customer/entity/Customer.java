package by.jacviah.jc1.simple_classes_customer.entity;

public class Customer implements Comparable<Customer> {
	   {
	        idGenerator++;
	    }
	 
	    private static int idGenerator = 0;
	    private int id = idGenerator;
	    private String firstName;
	    private String surname;
	    private String patronymic;
	    private String address;
	    private int creditCardId;
	    private int bankNumberCard;
	    
	    
		public Customer(String firstName, String surname, String patronymic, String address, int creditCardId,	int bankNumberCard) {
			this.firstName = firstName;
			this.surname = surname;
			this.patronymic = patronymic;
			this.address = address;
			this.creditCardId = creditCardId;
			this.bankNumberCard = bankNumberCard;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public String getPatronymic() {
			return patronymic;
		}
		public void setPatronymic(String patronymic) {
			this.patronymic = patronymic;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getCreditCardId() {
			return creditCardId;
		}
		public void setCreditCardId(int creditCardId) {
			this.creditCardId = creditCardId;
		}
		public int getBankNumberCard() {
			return bankNumberCard;
		}
		public void setBankNumberCard(int bankNumberCard) {
			this.bankNumberCard = bankNumberCard;
		}
		
		public int compareTo (Customer other) {
			int sur = this.surname.compareTo(other.surname);
			return  sur != 0 ? sur : this.firstName.compareTo(other.firstName);
		}
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((address == null) ? 0 : address.hashCode());
			result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
			result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
			result = prime * result + ((surname == null) ? 0 : surname.hashCode());
			return result;
		}
		
		@Override
		public String toString() {
			return "Customer [id=" + id + ", firstName=" + firstName + ", surname=" + surname + ", patronymic="
					+ patronymic + ", address=" + address + ", creditCardId=" + creditCardId + ", bankNumberCard="
					+ bankNumberCard + "]";
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Customer other = (Customer) obj;
			if (address == null) {
				if (other.address != null)
					return false;
			} else if (!address.equals(other.address))
				return false;
			if (firstName == null) {
				if (other.firstName != null)
					return false;
			} else if (!firstName.equals(other.firstName))
				return false;
			if (patronymic == null) {
				if (other.patronymic != null)
					return false;
			} else if (!patronymic.equals(other.patronymic))
				return false;
			if (surname == null) {
				if (other.surname != null)
					return false;
			} else if (!surname.equals(other.surname))
				return false;
			return true;
		}	    
}
