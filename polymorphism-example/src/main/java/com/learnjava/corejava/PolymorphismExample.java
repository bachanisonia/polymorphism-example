package com.learnjava.corejava;

import com.learnjava.corejava.trade.TradeOverload;
import com.learnjava.corejava.trade.TradeOverride;

public class PolymorphismExample {

	public static void main(String[] args) {

		
		TradeOverload.printTradeDetails("ABC123", "GBP");
		TradeOverload.getTradeDetails("ABC123", "GBP");
		TradeOverload.getTradeDetails("ABC123", "GBP", "CLS");
		
		TradeOverride.printTradeDetails("ABC123", "GBP");
		

	}

}
