package vtech.invoices.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long invId;
	
	private String invName;
	private Double invAmount;
	private Double invFinalAmount;
	private String invContact;
	private String invRecivedDate;
	private String invVendor;
	public Long getInvId() {
		return invId;
	}
	public void setInvId(Long invId) {
		this.invId = invId;
	}
	public String getInvName() {
		return invName;
	}
	public void setInvName(String invName) {
		this.invName = invName;
	}
	public Double getInvAmount() {
		return invAmount;
	}
	public void setInvAmount(Double invAmount) {
		this.invAmount = invAmount;
	}
	public Double getInvFinalAmount() {
		return invFinalAmount;
	}
	public void setInvFinalAmount(Double invFinalAmount) {
		this.invFinalAmount = invFinalAmount;
	}
	public String getInvContact() {
		return invContact;
	}
	public void setInvContact(String invContact) {
		this.invContact = invContact;
	}
	public String getInvRecivedDate() {
		return invRecivedDate;
	}
	public void setInvRecivedDate(String invRecivedDate) {
		this.invRecivedDate = invRecivedDate;
	}
	public String getInvVendor() {
		return invVendor;
	}
	public void setInvVendor(String invVendor) {
		this.invVendor = invVendor;
	}
	
	
	
}
