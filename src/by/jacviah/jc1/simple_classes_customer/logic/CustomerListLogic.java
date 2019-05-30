package by.jacviah.jc1.simple_classes_customer.logic;

import by.jacviah.jc1.simple_classes_customer.entity.Customer;
import by.jacviah.jc1.simple_classes_customer.entity.CustomerList;

public class CustomerListLogic {
	public void print(CustomerList list) {
		if (!list.isEmpty()) {
			list.sort();
			for (Customer i : list) {
				System.out.println(i.toString());
			}
		}
	}
	
	public CustomerList findByCreditCardNumber(CustomerList list, int min, int max) {
		CustomerList result = new CustomerList();
		if (!list.isEmpty()) {
			for (Customer i : list) {
				if (i.getCreditCardId()>=min & i.getCreditCardId()<=max) {
					result.addCustomer(i);
				}
			}
		}		
		return result;
	}
	
	
}
