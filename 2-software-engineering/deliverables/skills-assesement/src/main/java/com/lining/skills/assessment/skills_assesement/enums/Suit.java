package com.lining.skills.assessment.skills_assesement.enums;

public enum Suit {

	DIAMONDS("D"), CLUBS("C"), HEARTS("H"), SPADES("S");

	private String suit;

	private Suit(String suit) {
		this.suit = suit;
	}

	public String getSuit() {
		return suit;
	}
}
