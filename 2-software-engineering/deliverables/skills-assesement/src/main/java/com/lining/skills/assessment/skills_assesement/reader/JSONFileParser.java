package com.lining.skills.assessment.skills_assesement.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class JSONFileParser {
	
	String fileName;
	
	public JSONFileParser(String fileName) {
		this.fileName = fileName;
	}

	public List<String> readFile() {
		Gson gson = new Gson();
		List<String> batchElements = new ArrayList<String>();
		try (Reader reader = new FileReader(fileName)) {
			batchElements = gson.fromJson(reader, List.class);
			for (String batchElement : batchElements) {
				System.out.println("Element: " + batchElement);
			}
		} catch (IOException e) {
			System.out.println("Unable to parse batch" + e);
		}
		return batchElements;
	}

}
