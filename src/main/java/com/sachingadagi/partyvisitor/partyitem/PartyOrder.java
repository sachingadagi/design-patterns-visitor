package com.sachingadagi.partyvisitor.partyitem;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author dev
 *	
 *	V.IMP Note : This class also implements `partyItem` since it has its own 
 *	implementation of accept method
 */
public class PartyOrder implements PartyItem {

	List<PartyItem> partyItems = new ArrayList<PartyItem>();

	public void addOrder(PartyItem item) {
		partyItems.add(item);
	}

	public void accept(PartyVisitor visitor) {

		for(PartyItem items : partyItems) {
			items.accept(visitor);
		}
		visitor.visit(this);
	}

}
