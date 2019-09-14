package com.lining.skills.assessment.skills_assesement;

import java.util.List;

import com.lining.skills.assessment.skills_assesement.card.Card;
import com.lining.skills.assessment.skills_assesement.reader.DeckParser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DeckParser parser = new DeckParser("C:\\Users\\jhock\\skills-assesment-jhock974\\2-software-engineering\\sample-data\\batch-00.json");
    	List<Card> elements = parser.readFile();
    	System.out.println("Batch size: " + elements.size());
    }
}
