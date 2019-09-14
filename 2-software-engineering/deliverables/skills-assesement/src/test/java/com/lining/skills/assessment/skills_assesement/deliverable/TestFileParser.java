package com.lining.skills.assessment.skills_assesement.deliverable;

import java.util.List;

import com.lining.skills.assessment.skills_assesement.reader.JSONFileParser;

import junit.framework.TestCase;

public class TestFileParser extends TestCase{
	
	public static final String BATCH_FILE_NAME = "C:\\Users\\jhock\\skills-assesment-jhock974\\2-software-engineering\\sample-data\\batch-00.json";
	
	private JSONFileParser parser = new JSONFileParser(BATCH_FILE_NAME);
	
	public void testBatchSizeIs52() {
		List<String> batchElements = parser.readFile();
		assertEquals(52, batchElements.size());
	}

}
