package com.lining.skills.assessment.skills_assesement.enums;

public enum Color {

	RED("RED"),
	BLACK("BLACK"),
	NONE("NONE");
	
	private String color;

	private Color(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public static Color getColor(String suit) {
		if(Suit.HEARTS.getSuit().equals(suit)) {
			return RED;
		} else if(Suit.DIAMONDS.getSuit().equals(suit)) {
			return RED;
		} else if(Suit.CLUBS.getSuit().equals(suit)) {
			return BLACK;
		} else if (Suit.SPADES.getSuit().equals(suit)) {
			return BLACK;
		} else {
			return NONE;
		}
	}

}
