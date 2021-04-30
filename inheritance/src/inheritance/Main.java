package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer batu = new IndividualCustomer();
		batu.customerNumber = "12345";
		
		
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		SendikaCustomer abc =new SendikaCustomer();
		abc.customerNumber ="99999";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {batu,abc,hepsiBurada};
		
		customerManager.addMultiple(customers);

	}

}
