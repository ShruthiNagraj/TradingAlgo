package com.trackingAlgo.algo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignalController {
	
	private final Application application;
	
	@Autowired
	public SignalController(Application application) {
		this.application = application;
	}
	
	@PostMapping("/signal")
	public ResponseEntity<String> processSignal(@RequestBody int signal){
		application.handleSignal(signal);
		return ResponseEntity.ok("Success");
	}
}
