package Desafio_01;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class MetodoAbstrato extends AgendaTelefonica {
	
	public MetodoAbstrato(String Name) {
		super(Name);
	}

	Scanner input = new Scanner(System.in);
	@Override
	public void schedule() {

		while (x != 1) {
			System.out.println("[1] Add contact \t[2] Att Contact \t[3] Delet contact \n[4] List contact \t[5] Exit");
			int op = input.nextInt();
			Collection<String> addContact = new LinkedList<String>();
			switch (op) {
			case 1:
				System.out.println("what is the name of the new contact?");
				this.Name = input.next();
				addContact.add(getName(Name));
				System.out.println("what is the Adress the new contact?");
				this.Address = input.next();
				addContact.add(getName(Address));
				System.out.println("What is the telefone numer?");
				this.TelephoneNumber = input.next();
				addContact.add(getTelephoneNumber(TelephoneNumber));
				System.out.println("What is the phone numer?");
				this.PhoneNumber = input.next();
				addContact.add(getTelephoneNumber(PhoneNumber));
				System.out.println("What is the email?");
				this.Email = input.next();
				addContact.add(getEmail(Email));
				System.out.println(addContact);
				break;
			case 2:
				addContact.add(getName(Name));
				addContact.add(getTelephoneNumber(TelephoneNumber));
				addContact.add(getTelephoneNumber(PhoneNumber));
				addContact.add(getEmail(Email));
				System.out.println("Type name, adress, telephone number, phone number or email for to update?");
				String att = input.next();
				if (addContact.contains(att) == true) {
					addContact.remove(att);
					System.out.println("New atribute:");
					String newatt = input.next();
					addContact.add(newatt);
					System.out.println(addContact);
				} else
					System.out.println("Dont exist!");
				break;

			case 3:
				addContact.add(getName(Name));
				addContact.add(getTelephoneNumber(TelephoneNumber));
				addContact.add(getTelephoneNumber(PhoneNumber));
				addContact.add(getEmail(Email));
				System.out.println("You want to delete?");
				boolean delete = input.nextBoolean();
				if (delete == true) {
					System.out.println(addContact.removeAll(addContact));
				} else
				break;	
			case 4:
				System.out.println("====== [ SCHEDULE ] ======");
				System.out.println("Nome:" + this.Name);
				System.out.println("Adress: " + this.Address);
				System.out.println("Telephone Number: " + this.TelephoneNumber);
				System.out.println("Phone Number: " + this.PhoneNumber);
				System.out.println("Email: " + this.Email);
				break;
			case 5:
				if (op < 1 || op >= 4)
					x = 1;
				System.out.println("Exit");
			}
		}
	}
}