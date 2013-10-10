package ch.dave.mockito.excercise;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;
import org.mockito.Mockito;

public class DBAccessorTest {
	// This test will test placing an order with a valid gift card with exactly
	// the right amount of money on it (as a sample from the book)

	// Tests to be done
	@Test
	public void testSimpleOrder() {
		OrderInformation orderInfo = new OrderInformation();
		orderInfo.setCustomerName("Dave");
		orderInfo.setDrinkDescription("Black Coffe");
		orderInfo.setGiftCardNumber(1234);
		orderInfo.setPreferredStoreNumber(123);
		Date activationDate = new Date();
		Date expirationDate = new Date(activationDate.getTime() + 3600);
		BigDecimal gcValue = new BigDecimal("2.75");
		GiftCard startGC = new GiftCard(activationDate, expirationDate, gcValue);
		BigDecimal gcEndValue = new BigDecimal("0");
		GiftCard endGC = new GiftCard(activationDate, expirationDate,
				gcEndValue);

		// Create Mock Object
		DBAccessor mockAccessor = mock(DBAccessor.class);
		Mockito.when(mockAccessor.getGC(1234)).thenReturn(startGC);
		mockAccessor.saveOrder(orderInfo);
		mockAccessor.saveGC(endGC);
	
		// Create OrderProcessor
		OrderProcessor processor = new OrderProcessor();
		processor.setDBAccessor(mockAccessor);
		Receipt rpt = processor.processOrder(orderInfo);
		assertNotNull(rpt.getPickupTime());
		assertTrue(rpt.getConfirmationNumber() > 0);
		assertTrue(rpt.getGCBalance().equals(new BigDecimal("0.00")));
		rpt.printOut();
	}

}
