package com.sachingadagi.partyvisitor.partyitem;

public class PartyShippingVisitor implements PartyVisitor {

	long shippingCost = 0;

	public void visit(Maaza maaza) {
		this.shippingCost += 5;
	}

	public void visit(Coke coke) {
		this.shippingCost += 10;
	}

	public void visit(Thumpsup thumpsup) {
		this.shippingCost += 10;
	}

	public void visit(PartyOrder order) {

		// Any additional logic can be placed, such as discount!

		System.out.println("The total party shipping cost is " + this.shippingCost);
	}

}
