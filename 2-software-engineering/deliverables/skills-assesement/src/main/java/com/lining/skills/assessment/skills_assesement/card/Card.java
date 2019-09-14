package com.lining.skills.assessment.skills_assesement.card;

import com.lining.skills.assessment.skills_assesement.enums.Color;
import com.lining.skills.assessment.skills_assesement.enums.Rank;
import com.lining.skills.assessment.skills_assesement.enums.Suit;

public class Card {

	private Suit suit;
	private Rank rank;
	private Color color;

	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
		this.color = Color.getColor(suit);
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}	

}
