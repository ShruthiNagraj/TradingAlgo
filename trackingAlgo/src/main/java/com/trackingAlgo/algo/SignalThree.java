package com.trackingAlgo.algo;

public class SignalThree implements SignalType{

	@Override
	public void executeSignal(Algo algo) {
		//System.out.println("Inside Signal 3 method");
		algo.setAlgoParam(1, 90);
		algo.setAlgoParam(2,15);
		algo.performCalc();
		algo.submitToMarket();
	}

}
