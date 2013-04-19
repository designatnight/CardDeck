package com.sjs.carddeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> _cards;
	
	public Card drawCard(){
		if (_cards.isEmpty()){
			System.out.println("out of cards.");
			return null;
		}else{
			return _cards.remove(0);
		}
	}

	public Deck(){
		_cards = new ArrayList<Card>();
		for(Suit suit : Suit.values()){
			for(FaceValue faceValue : FaceValue.values()){
				_cards.add(new Card(suit, faceValue));
			}
		}
	}
	
	public void shuffle(){
		Collections.shuffle(_cards);
	}
	
	public List<Card> getCards(){
		return _cards;
	}
}
