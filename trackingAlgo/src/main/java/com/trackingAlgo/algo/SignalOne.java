package com.trackingAlgo.algo;

public class SignalOne implements SignalType{

	@Override
	public void executeSignal(Algo algo) {
		//System.out.println("Inside Signal 1 method");
		algo.setUp();
		algo.setAlgoParam(1,60);
		algo.performCalc();
		algo.submitToMarket();
		
	}

}
