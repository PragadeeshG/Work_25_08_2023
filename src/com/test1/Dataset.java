package com.test1;

public class Dataset {
	private int datasetld;
	private String dsName;
	private String description;
	private String sourcingType;
	private String loadFileName;
	private int consumptionMode;
	private String notesToConsumer;
	private String extractionCriteria;

	public Dataset() {

	}

	public Dataset(int datasetld, String dsName, String description, String sourcingType, String loadFileName,
			int consumptionMode, String notesToConsumer, String extractionCriteria) {
		super();
		this.datasetld = datasetld;
		this.dsName = dsName;
		this.description = description;
		this.sourcingType = sourcingType;
		this.loadFileName = loadFileName;
		this.consumptionMode = consumptionMode;
		this.notesToConsumer = notesToConsumer;
		this.extractionCriteria = extractionCriteria;
	}

	public int getDatasetld() {
		return datasetld;
	}

	public void setDatasetld(int datasetld) {
		this.datasetld = datasetld;
	}

	public String getDsName() {
		return dsName;
	}

	public void setDsName(String dsName) {
		this.dsName = dsName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSourcingType() {
		return sourcingType;
	}

	public void setSourcingType(String sourcingType) {
		this.sourcingType = sourcingType;
	}

	public String getLoadFileName() {
		return loadFileName;
	}

	public void setLoadFileName(String loadFileName) {
		this.loadFileName = loadFileName;
	}

	public int getConsumptionMode() {
		return consumptionMode;
	}

	public void setConsumptionMode(int consumptionMode) {
		this.consumptionMode = consumptionMode;
	}

	public String getNotesToConsumer() {
		return notesToConsumer;
	}

	public void setNotesToConsumer(String notesToConsumer) {
		this.notesToConsumer = notesToConsumer;
	}

	public String getExtractionCriteria() {
		return extractionCriteria;
	}

	public void setExtractionCriteria(String extractionCriteria) {
		this.extractionCriteria = extractionCriteria;
	}

}
