package com.lining.skills.assessment.skills_assesement.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.lining.skills.assessment.skills_assesement.card.Card;
import com.lining.skills.assessment.skills_assesement.enums.Rank;

public class DeckParser {

	String fileName;

	public DeckParser(String fileName) {
		this.fileName = fileName;
	}

	public List<Card> readFile() throws RuntimeException {
		Gson gson = new Gson();
		List<String> batchElements = new ArrayList<String>();
		List<Card> cards = new ArrayList<Card>();
		try (Reader reader = new FileReader(fileName)) {
			batchElements = gson.fromJson(reader, List.class);
			for (String batchElement : batchElements) {
				String rank = getRank(batchElement);
				String suit = getSuit(batchElement);
				if (Rank.isValidRank(rank) && Card.isValidSuit(suit)) {
					cards.add(new Card(rank, suit));
				} else {
					throw new RuntimeException("Invalid Card: " + batchElement);
				}
				
				System.out.println("Element: " + batchElement);
			}
		} catch (IOException e) {
			throw new RuntimeException("Unable to parse batch" + e);
		}
		return cards;
	}
	
	private String getRank(String batchElement) {
		if (batchElement.length() == 3) {
			return batchElement.substring(0, 2);
		} else {
			return batchElement.substring(0, 1);
		}
	}
	
	private String getSuit(String batchElement) {
		if (batchElement.length() == 3) {
			return batchElement.substring(2, 3);
		} else {
			return batchElement.substring(1, 2);
		}
	}

}
