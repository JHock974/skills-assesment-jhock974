package com.lining.skills.assessment.skills_assesement.reader;

import java.util.List;

import com.lining.skills.assessment.skills_assesement.card.Card;
import com.lining.skills.assessment.skills_assesement.reader.DeckParser;

import junit.framework.TestCase;

public class DeckParserTest extends TestCase{
	
	public static final String BATCH_FILE_NAME = "C:\\Users\\jhock\\skills-assesment-jhock974\\2-software-engineering\\sample-data\\batch-00.json";
	
	private DeckParser parser = new DeckParser(BATCH_FILE_NAME);
	
	public void testBatchSizeIs52() {
		List<Card> cards = parser.readFile();
		assertEquals(52, cards.size());
	}

}
