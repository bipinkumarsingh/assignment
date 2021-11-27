package com.gerimedica.test.assignment.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.Nullable;

@Entity
@Table(name = "data")
public class Data {

	@Id
	@Column(name = "source")
	private String source;

	@Column(name = "codeListCode")
	private String codeListCode;

	@Column(name = "code")
	private String code;

	@Column(name = "longDescription")
	private String longDescription;

	@Column(name = "fromDate")
	private String fromDate;

	@Column(name = "toDate")
	private String toDate;

	@Column(name = "sortingPriority")
	private Integer sortingPriority;

	public Data() {

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

	@Override
	public int hashCode() {
		return Objects.hash(code, codeListCode, fromDate, longDescription, sortingPriority, source, toDate);
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
				&& Objects.equals(fromDate, other.fromDate) && Objects.equals(longDescription, other.longDescription)
				&& Objects.equals(sortingPriority, other.sortingPriority) && Objects.equals(source, other.source)
				&& Objects.equals(toDate, other.toDate);
	}

	@Override
	public String toString() {
		return "Data [source=" + source + ", codeListCode=" + codeListCode + ", code=" + code + ", longDescription="
				+ longDescription + ", fromDate=" + fromDate + ", toDate=" + toDate + ", sortingPriority="
				+ sortingPriority + "]";
	}


}
