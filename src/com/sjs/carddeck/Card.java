package com.sjs.carddeck;

public class Card {
	
	private Suit _suit;
	private FaceValue _faceValue;
	
	public Color getColor() {
		return getSuit().getColor();
	}
	
	public Card(Suit suit, FaceValue faceValue){
		_suit = suit;
		_faceValue = faceValue;
	}

	public Suit getSuit() {
		return _suit;
	}

	public FaceValue getFaceValue() {
		return _faceValue;
	}
}
