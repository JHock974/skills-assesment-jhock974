package com.lining.skills.assessment.skills_assesement.card;

import com.lining.skills.assessment.skills_assesement.enums.Color;
import com.lining.skills.assessment.skills_assesement.enums.Suit;

public class Card {

	private String suit;
	private String rank;
	private Color color;

	public Card(String rank, String suit) {
		this.rank = rank;
		this.suit = suit;
		this.color = Color.getColor(suit);
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public static boolean isValidSuit(String suit) {
		if(Suit.HEARTS.getSuit().equals(suit) ||
				Suit.DIAMONDS.getSuit().equals(suit) ||
				Suit.CLUBS.getSuit().equals(suit) ||
				Suit.SPADES.getSuit().equals(suit)) {
			return true;
		} else {
			return false;
		}
	}

}
