package com.learnjava.corejava.trade;

public class TradeOverride extends TradeOverload {

	public static void printTradeDetails(String traderef, String instrref) {
		System.out.println("Overriding Trade Details \nTrade Ref : " + traderef + "\nInstrument Ref : " + instrref);
	}
	
}
