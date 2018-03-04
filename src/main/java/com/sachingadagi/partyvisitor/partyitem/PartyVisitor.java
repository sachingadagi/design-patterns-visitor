package com.sachingadagi.partyvisitor.partyitem;

public interface PartyVisitor {

	void visit(Maaza maaza);

	void visit(Coke coke);

	void visit(Thumpsup thumpsup);
	
	// The PartyOrder class has the collection of party items that are added, and not to forget it also 
	// implements the PartyItem interface	
	void visit(PartyOrder order);
	
}
