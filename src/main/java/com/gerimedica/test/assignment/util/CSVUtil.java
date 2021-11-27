package com.gerimedica.test.assignment.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.gerimedica.test.assignment.model.Data;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class CSVUtil {
	public static String TYPE = "text/csv";

	public static boolean hasCSVFormat(MultipartFile file) {

		if (!TYPE.equals(file.getContentType())) {
			return false;
		}

		return true;
	}

	public static List<Data> csvToData(InputStream is) {

		List<Data> data = new ArrayList<Data>();
		try (Reader reader = new BufferedReader(new InputStreamReader(is))) {

			CsvToBean<Data> csvToBean = new CsvToBeanBuilder<Data>(reader).withType(Data.class)
					.withIgnoreLeadingWhiteSpace(true).build();

			data = csvToBean.parse();
			return data;
		} catch (Exception ex) {

		}
		return data;

	}

}
