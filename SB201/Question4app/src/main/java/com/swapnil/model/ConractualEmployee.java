package com.swapnil.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name = "emd_id")
public class ConractualEmployee extends Employee{

private int	noOfWorkingDays;
private int	costofperday;
private String mobileNumber;
public int getNoOfWorkingDays() {
	return noOfWorkingDays;
}
public void setNoOfWorkingDays(int noOfWorkingDays) {
	this.noOfWorkingDays = noOfWorkingDays;
}
public int getCostofperday() {
	return costofperday;
}
public void setCostofperday(int costofperday) {
	this.costofperday = costofperday;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
	


}
