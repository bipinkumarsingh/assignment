package com.gerimedica.test.assignment.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.opencsv.bean.CsvBindByName;

@Entity
@Table(name = "data")
public class Data {

	
	@Column(name = "source")
	@CsvBindByName
	private String source;

	@Column(name = "codeListCode")
	@CsvBindByName
	private String codeListCode;

	@Id
	@Column(name = "code")
	@CsvBindByName
	private String code;
	

	@Column(name = "displayValue")
	 @CsvBindByName
	private String displayValue;

	@Column(name = "longDescription")
	@CsvBindByName
	private String longDescription;

	@Column(name = "fromDate")
	@CsvBindByName
	private String fromDate;

	@Column(name = "toDate")
	@CsvBindByName
	private String toDate;

	@Column(name = "sortingPriority")
	 @CsvBindByName
	private Integer sortingPriority;

	
	public Data() {

	}
	

	public Data(String source, String codeListCode, String code, String longDescription, String fromDate, String toDate,
			Integer sortingPriority) {
		super();
		this.source = source;
		this.codeListCode = codeListCode;
		this.code = code;
		this.longDescription = longDescription;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.sortingPriority = sortingPriority;
	}



	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCodeListCode() {
		return codeListCode;
	}

	public void setCodeListCode(String codeListCode) {
		this.codeListCode = codeListCode;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public Integer getSortingPriority() {
		return sortingPriority;
	}

	public void setSortingPriority(Integer sortingPriority) {
		this.sortingPriority = sortingPriority;
	}


	public String getDisplayValue() {
		return displayValue;
	}


	public void setDisplayValue(String displayValue) {
		this.displayValue = displayValue;
	}


	@Override
	public int hashCode() {
		return Objects.hash(code, codeListCode, displayValue, fromDate, longDescription, sortingPriority, source,
				toDate);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		return Objects.equals(code, other.code) && Objects.equals(codeListCode, other.codeListCode)
				&& Objects.equals(displayValue, other.displayValue) && Objects.equals(fromDate, other.fromDate)
				&& Objects.equals(longDescription, other.longDescription)
				&& Objects.equals(sortingPriority, other.sortingPriority) && Objects.equals(source, other.source)
				&& Objects.equals(toDate, other.toDate);
	}


	@Override
	public String toString() {
		return "Data [source=" + source + ", codeListCode=" + codeListCode + ", code=" + code + ", displayValue="
				+ displayValue + ", longDescription=" + longDescription + ", fromDate=" + fromDate + ", toDate="
				+ toDate + ", sortingPriority=" + sortingPriority + "]";
	}


	
	
}
