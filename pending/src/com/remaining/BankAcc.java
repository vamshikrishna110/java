package com.remaining;

class PersonDetails{

			String PersonName;
			float Age;
	
			PersonDetails(String PersonName,Float Age){
			this.PersonName=PersonName;
			this.Age=Age;
	
			}
	
			public String getPersonName() {
			return PersonName;
			}
			public void setPersonName(String personName) {
			PersonName = personName;
			}
			public Float getAge() {
			return Age;
			}
			public void setAge(Float age) {
			Age = age;
			}


}


class AccountInformation{
			long AccountNumber;
			double Balance;
			PersonDetails NameOfPerson;
	
	
			public AccountInformation(long accountNumber, double balance, PersonDetails nameOfPerson) {
			//super();
			AccountNumber = accountNumber;
			Balance = balance;
			NameOfPerson = nameOfPerson;
			}
	
			public long getAccountNumber() {
			return AccountNumber;
			}
			public void setAccountNumber(long accountNumber) {
			AccountNumber = accountNumber;
			}
			public double getBalance() {
			return Balance;
			}
			public void setBalance(double balance) {
			Balance = balance;
			}
			public PersonDetails getNameOfPerson() {
			return NameOfPerson;
			}

			public void setNameOfPerson(PersonDetails nameOfPerson) {
			NameOfPerson = nameOfPerson;
			}
			void deposit(double credit) {
			Balance += credit;
			}
			void withdraw(double debit) {
			Balance -= debit;
			}

			@Override
			public String toString() {
			return "AccountInformation [AccountNumber=" + AccountNumber + ", AvailableBalance=" + Balance + ", NameOfPerson="
			+ NameOfPerson.getPersonName() +"]";
			}
}

public class BankAcc {

		public static void main(String[] args) {

		PersonDetails smith = new PersonDetails("Smith",23f);
		PersonDetails katy = new PersonDetails("Kathy",22f);


		AccountInformation mainsmith = new AccountInformation(12947291469L,2000d,smith);

		AccountInformation mainkathy = new AccountInformation(12946324565L,3000d,katy);

		mainsmith.deposit(2000d);
		mainkathy.withdraw(1000d);

		System.out.println(mainsmith);
		System.out.println();
		System.out.println(mainkathy);

		}

}

	


