package com.lining.skills.assessment.skills_assesement.enums;

public enum Color {

	RED,
	BLACK,
	NONE;

	public static Color getColor(Suit suit) {
		
		if(suit.equals(Suit.HEARTS)) {
			return RED;
		} else if(suit.equals(Suit.DIAMONDS)) {
			return RED;
		} else if(suit.equals(Suit.CLUBS)) {
			return BLACK;
		} else if (suit.equals(Suit.SPADES)) {
			return BLACK;
		} else {
			return NONE;
		}
	}

}
