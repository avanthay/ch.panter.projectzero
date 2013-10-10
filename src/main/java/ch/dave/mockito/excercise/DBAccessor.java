package ch.dave.mockito.excercise;

public interface DBAccessor {

	GiftCard getGC(int geld);
	void saveGC(GiftCard card);
	void saveOrder(OrderInformation orderInfo);
}
