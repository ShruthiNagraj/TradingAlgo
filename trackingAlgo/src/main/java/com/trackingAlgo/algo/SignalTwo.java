package com.trackingAlgo.algo;

public class SignalTwo implements SignalType{

	@Override
	public void executeSignal(Algo algo) {
		//System.out.println("Inside Signal 2 method");
		algo.reverse();
		algo.setAlgoParam(1,80);
		algo.submitToMarket();
	}

}
