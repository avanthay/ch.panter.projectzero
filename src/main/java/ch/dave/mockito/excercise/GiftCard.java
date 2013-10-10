package ch.dave.mockito.excercise;

import java.math.BigDecimal;
import java.util.Date;

public class GiftCard {
	private Date activationDate;
	private Date expirationDate;
	private BigDecimal gcValue;
	
	
	public GiftCard(Date activationDate, Date expirationDate, BigDecimal gcValue){
		this.activationDate = activationDate;
		this.expirationDate = expirationDate;
		this.gcValue = gcValue;
	}
	
	
	public Date getActivationDate() {
		return activationDate;
	}
	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public BigDecimal getGcValue() {
		return gcValue;
	}
	public void setGcValue(BigDecimal gcValue) {
		this.gcValue = gcValue;
	}
	
	

}
