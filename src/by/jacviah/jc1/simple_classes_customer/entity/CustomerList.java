package by.jacviah.jc1.simple_classes_customer.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CustomerList implements Iterable<Customer> {

	ArrayList<Customer> list = new ArrayList<Customer>();

	public CustomerList() {
	}

	public CustomerList(ArrayList<Customer> list) {
		this.list = list;
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void addCustomer(Customer customer) {

		boolean flag = true;
		for (Customer i : this.list) {
			if (i == customer) {
				flag = false;
			}
		}
		if (!flag) {
			System.out.println("Customer already on the list");
		} else {
			this.list.add(customer);
		}

	}

	public void deleteCustomer(Customer customer) {

		boolean flag = false;
		for (Customer i : this.list) {
			if (i == customer) {
				flag = true;
				list.remove(customer);
			}
			if (flag) {
				System.out.println("Customer deleted");
			} else {
				System.out.println("Customer not found");
			}
		}
	}
	
	public void sort() {
		Collections.sort(list);
	}

	public Iterator<Customer> iterator() {
		return list.iterator();
	}
	

}
