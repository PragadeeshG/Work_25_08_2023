package com.test1;

public class DataCertification {
	private int datasetld;
	private int cycleld;
	private String ownerId;
	private String certificationDate;
	private String nextCertificationDate;
	private String runStatus;
	private String certificationRemarks;
	private String status;

	public DataCertification() {

	}

	public DataCertification(int datasetld, int cycleld, String ownerId, String certificationDate,
			String nextCertificationDate, String runStatus, String certificationRemarks, String status) {
		super();
		this.datasetld = datasetld;
		this.cycleld = cycleld;
		this.ownerId = ownerId;
		this.certificationDate = certificationDate;
		this.nextCertificationDate = nextCertificationDate;
		this.runStatus = runStatus;
		this.certificationRemarks = certificationRemarks;
		this.status = status;
	}

	public int getDatasetld() {
		return datasetld;
	}

	public void setDatasetld(int datasetld) {
		this.datasetld = datasetld;
	}

	public int getCycleld() {
		return cycleld;
	}

	public void setCycleld(int cycleld) {
		this.cycleld = cycleld;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getCertificationDate() {
		return certificationDate;
	}

	public void setCertificationDate(String certificationDate) {
		this.certificationDate = certificationDate;
	}

	public String getNextCertificationDate() {
		return nextCertificationDate;
	}

	public void setNextCertificationDate(String nextCertificationDate) {
		this.nextCertificationDate = nextCertificationDate;
	}

	public String getRunStatus() {
		return runStatus;
	}

	public void setRunStatus(String runStatus) {
		this.runStatus = runStatus;
	}

	public String getCertificationRemarks() {
		return certificationRemarks;
	}

	public void setCertificationRemarks(String certificationRemarks) {
		this.certificationRemarks = certificationRemarks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
