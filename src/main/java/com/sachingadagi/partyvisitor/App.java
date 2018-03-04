package com.sachingadagi.partyvisitor;

import com.sachingadagi.partyvisitor.partyitem.Coke;
import com.sachingadagi.partyvisitor.partyitem.Maaza;
import com.sachingadagi.partyvisitor.partyitem.PartyOrder;
import com.sachingadagi.partyvisitor.partyitem.PartyShippingVisitor;
import com.sachingadagi.partyvisitor.partyitem.Thumpsup;

/**
 * @author dev
 *
 */
public class App {
	public static void main(String[] args) {
		
		
		PartyOrder order = new PartyOrder();

		order.addOrder(new Maaza());
		order.addOrder(new Coke());
		order.addOrder(new Thumpsup());

		order.accept(new PartyShippingVisitor());
	}
}
