package by.jacviah.jc1.simple_classes_customer.main;

import by.jacviah.jc1.simple_classes_customer.entity.Customer;
import by.jacviah.jc1.simple_classes_customer.entity.CustomerList;
import by.jacviah.jc1.simple_classes_customer.logic.CustomerListLogic;

public class CustomerDemo {
	public static void main(String[] args) {

		CustomerList list = new CustomerList();
		list.addCustomer(new Customer("Ivan", "Ivanov", "Ivanovich", "Amur", 236, 245678));
		list.addCustomer(new Customer("Artem", "Ivanov", "Ivanovich", "Amur", 237, 245765));
		list.addCustomer(new Customer("Petr", "Ivanov", "Ivanovich", "Amur", 239, 249623));
		list.addCustomer(new Customer("Ho", "Li", "Fan", "Daljan", 569, 365456));
		list.addCustomer(new Customer("Hi", "Li", "Fan", "Daljan", 599, 365445));
		list.addCustomer(new Customer("Ha", "Li", "Fan", "Daljan", 521, 365421));
		CustomerListLogic logic = new CustomerListLogic();
		logic.print(list);
		System.out.println("_______________________________________________");
		logic.print(logic.findByCreditCardNumber(list, 237,580));		
	}

}
