package com.sachingadagi.partyvisitor.partyitem;

public class Maaza implements PartyItem{

	public void accept(PartyVisitor visitor) {
		visitor.visit(this);
	}

}
