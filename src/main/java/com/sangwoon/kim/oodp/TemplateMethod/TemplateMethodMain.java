package com.sangwoon.kim.oodp.TemplateMethod;

public class TemplateMethodMain {

	public static void main(String[] args) {
		DataProcessor csvDataProcessor = new CSVDataProcessor();
		csvDataProcessor.process("CSV data");

		DataProcessor jsonDataProcessor = new JSONDataProcessor();
		jsonDataProcessor.process("XML data");
	}

}
