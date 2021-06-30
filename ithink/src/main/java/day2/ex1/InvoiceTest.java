package day2.ex1;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice invoice = new Invoice();
		invoice.setPartNumber("X99");
		invoice.setPartDescription("Description xxx");
		invoice.setAmountPurchased(10);
		invoice.setItemPrice(100);

		System.out.println("Part Number: " + invoice.getPartNumber());
		System.out.println("Part Description: " + invoice.getPartDescription());
		System.out.println("Amount of purchased items: " + invoice.getAmountPurchased());
		System.out.println("The price per item: " + invoice.getItemPrice());
		System.out.println("The invoice amount: " + invoice.getInvoiceAmount());

	}

}
