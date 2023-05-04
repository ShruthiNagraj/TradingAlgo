package com.trackingAlgo.algo;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class Application implements SignalHandler{
	
	private Map<Integer, SignalType> sType;
	
	
	public Application() {
		sType = new HashMap<>();
		sType.put(1, new SignalOne());
		sType.put(2, new SignalTwo());
		sType.put(3, new SignalThree());
	}
	
	public void handleSignal(int signal) {
		Algo algo = new Algo();
		
		SignalType type = sType.get(signal);
		//System.out.println("type:"+type);
		if(type!=null) {
			type.executeSignal(algo);
		}else {
			algo.cancelTrades();
		}
		algo.doAlgo();
		
	}
	
}