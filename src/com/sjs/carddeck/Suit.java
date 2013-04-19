package com.sjs.carddeck;

public enum Suit {
	SPADES(Color.BLACK),
	DIAMONDS(Color.RED),
	CLUBS(Color.BLACK),
	HEARTS(Color.RED);

	private Color _color;
	
	private Suit(Color color){
		_color = color;
	}
	
	public Color getColor(){
		return _color;
	}
}

