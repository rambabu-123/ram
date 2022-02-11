package com.mondee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="cc")  
public class CreditCard extends payment {
	private String CreditCardType;
	@Column(name = "ccType")  
	public String getCreditCardType() {
		return CreditCardType;
	}
	public void setCreditCardType(String creditCardType) {
		CreditCardType = creditCardType;
	}
	

}
