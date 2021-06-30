package day2.ex1;

public class Invoice {

	String partNumber;
	String partDescription;
	int amountPurchased;
	double itemPrice;

	Invoice() {
		partNumber = "";
		partDescription = "";
		amountPurchased = 0;
		itemPrice = 0;
	}

	String getPartNumber() {
		return partNumber;
	}

	void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	String getPartDescription() {
		return partDescription;
	}

	void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	int getAmountPurchased() {
		return amountPurchased;
	}

	void setAmountPurchased(int amountPurchased) {
		this.amountPurchased = Math.max(amountPurchased, 0);
	}

	double getItemPrice() {
		return itemPrice;
	}

	void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice < 0 ? 0.0 : itemPrice;
	}

	double getInvoiceAmount() {
		return this.amountPurchased * itemPrice;
	}
}
