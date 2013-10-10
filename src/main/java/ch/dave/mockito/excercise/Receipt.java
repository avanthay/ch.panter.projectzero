package ch.dave.mockito.excercise;

import java.math.BigDecimal;
import java.util.Date;

public class Receipt {
	
	private int confirmationNumber;
	private Date pickupTime;
	private BigDecimal gcBalance;
	
	public void printOut(){
		System.out.println("Receipt " + confirmationNumber + " :");
		System.out.println("*********************************");
		System.out.println("Pickup Time: " + pickupTime);
		System.out.println("Balance of your GiftCard: " + gcBalance);
		System.out.println("*********************************");
		System.out.println("Thank you for your order \n"
				+ "       & \nenjoy your drink!");
	}

	public int getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(int confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public Date getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(Date pickupTime) {
		this.pickupTime = pickupTime;
	}

	public BigDecimal getGCBalance() {
		return gcBalance;
	}

	public void setGcBalance(BigDecimal gcBalance) {
		this.gcBalance = gcBalance;
	}

}
