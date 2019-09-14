package com.lining.skills.assessment.skills_assesement;

import java.util.List;

import com.lining.skills.assessment.skills_assesement.reader.JSONFileParser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	JSONFileParser parser = new JSONFileParser("C:\\Users\\jhock\\skills-assesment-jhock974\\2-software-engineering\\sample-data\\batch-00.json");
    	List<String> elements = parser.readFile();
    	System.out.println("Batch size: " + elements.size());
    }
}
