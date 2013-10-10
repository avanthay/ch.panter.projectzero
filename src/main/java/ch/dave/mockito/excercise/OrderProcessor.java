package ch.dave.mockito.excercise;

import java.math.BigDecimal;
import java.util.Date;

public class OrderProcessor {
	
	private DBAccessor accessor;

	
	public DBAccessor getDBAccessor() {
		return accessor;
	}
	public void setDBAccessor(DBAccessor accessor) {
		this.accessor = accessor;
	}


	public Receipt processOrder(OrderInformation orderInfo){
		Date pickupTime = new Date();
		pickupTime.setTime(new Date().getTime() + (long) (Math.random() * 173202349));
		int confirmationNumber = new Integer(((int) (Math.random()*10))*17 + orderInfo.getGiftCardNumber());
		BigDecimal gcBalance = accessor.getGC(orderInfo.getGiftCardNumber()).getGcValue().subtract(new BigDecimal("2.75")); // static - 2.75

		Receipt rpt = new Receipt();
		rpt.setPickupTime(pickupTime);
		rpt.setConfirmationNumber(confirmationNumber);
		rpt.setGcBalance(gcBalance);
		
		return rpt;
	}
}
