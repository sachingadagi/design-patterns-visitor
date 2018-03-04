package com.sachingadagi.partyvisitor.partyitem;

public class Coke implements PartyItem {

	public void accept(PartyVisitor visitor) {
		visitor.visit(this);
	}

}
