package com.sachingadagi.partyvisitor.partyitem;

public class Thumpsup implements PartyItem{

	public void accept(PartyVisitor visitor) {
		visitor.visit(this);
	}

}
