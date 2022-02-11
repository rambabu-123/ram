package com.mondee;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Cq")
public class Cheque extends payment {
	private String ChequeTpye;
	@Column(name="chequetype")
	public String getChequeTpye() {
		return ChequeTpye;
	}
	public void setChequeTpye(String chequeTpye) {
		ChequeTpye = chequeTpye;
	}
}
