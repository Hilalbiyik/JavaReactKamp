package inheritance;

public class Main {

	public static void main(String[] args) {
		
		 IndividualCustomer engin = new IndividualCustomer();
		 engin.customerNumber ="12345";
		 
		 SendikaCustomer abc = new SendikaCustomer();
		 abc.customerNumber = "99999";

		 CorporateCustomer hepsiBurada = new CorporateCustomer();
		 hepsiBurada.companyName ="78910";
		 
		 
		 CustomerManager customerManager = new CustomerManager();
		 
		 Customer[] customers = {engin,abc,hepsiBurada};
		 
		 customerManager.addMultiple(customers);
	}

}
