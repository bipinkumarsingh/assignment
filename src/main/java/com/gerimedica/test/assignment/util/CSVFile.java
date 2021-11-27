package com.gerimedica.test.assignment.util;

import com.opencsv.bean.CsvBindByPosition;

public class CSVFile {
	@CsvBindByPosition(position = 0)
	private String source;

	@CsvBindByPosition(position = 1)
	private String codeListCode;

	@CsvBindByPosition(position = 2)
	private String code;

	@CsvBindByPosition(position = 3)
	private String longDescription;

	@CsvBindByPosition(position = 4)
	private String fromDate;

	@CsvBindByPosition(position = 5)
	private String toDate;

	@CsvBindByPosition(position = 6)
	private Integer sortingPriority;

}
