package com.test1;

public class DataOwner {
private int datasetld;
private String staffld;
private int sequence;
private String ownerType;
private String certificationRequired;
private Boolean onBoarded;
private String status;

public DataOwner(){
	
}

public DataOwner(int datasetld, String staffld, int sequence, String ownerType, String certificationRequired,
		Boolean onBoarded, String status) {
	super();
	this.datasetld = datasetld;
	this.staffld = staffld;
	this.sequence = sequence;
	this.ownerType = ownerType;
	this.certificationRequired = certificationRequired;
	this.onBoarded = onBoarded;
	this.status = status;
}

public int getDatasetld() {
	return datasetld;
}

public void setDatasetld(int datasetld) {
	this.datasetld = datasetld;
}

public String getStaffld() {
	return staffld;
}

public void setStaffld(String staffld) {
	this.staffld = staffld;
}

public int getSequence() {
	return sequence;
}

public void setSequence(int sequence) {
	this.sequence = sequence;
}

public String getOwnerType() {
	return ownerType;
}

public void setOwnerType(String ownerType) {
	this.ownerType = ownerType;
}

public String getCertificationRequired() {
	return certificationRequired;
}

public void setCertificationRequired(String certificationRequired) {
	this.certificationRequired = certificationRequired;
}

public Boolean getOnBoarded() {
	return onBoarded;
}

public void setOnBoarded(Boolean onBoarded) {
	this.onBoarded = onBoarded;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

}
