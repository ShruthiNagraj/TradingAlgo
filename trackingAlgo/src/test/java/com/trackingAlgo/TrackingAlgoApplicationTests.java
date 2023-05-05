package com.trackingAlgo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.trackingAlgo.algo.Application;

@SpringBootTest
class TrackingAlgoApplicationTests {

	@Test
	public void testHandleSignalOne() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true));
		Application app2 = new Application();
		int signal =1;
		app2.handleSignal(signal);
		String expected = "setUp" + System.lineSeparator() +
                "setAlgoParam" + System.lineSeparator() +
                "performCalc" + System.lineSeparator() +
                "submitToMarket" + System.lineSeparator() +
                "doAlgo";
		assertEquals(expected, out.toString().trim());
	}
	
	@Test
	public void testHandleSignalTwo() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true));
		Application app2 = new Application();
		int signal =2;
		app2.handleSignal(signal);
		String expected = "reverse" + System.lineSeparator() +
                "setAlgoParam" + System.lineSeparator() +
                "submitToMarket" + System.lineSeparator() +
                "doAlgo";
		assertEquals(expected, out.toString().trim());
	}
	
	@Test
	public void testHandleSignalThree() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out, true));
		Application app2 = new Application();
		int signal =3;
		app2.handleSignal(signal);
		String expected = "setAlgoParam" + System.lineSeparator() +
                "setAlgoParam" + System.lineSeparator() +
                "performCalc" + System.lineSeparator() +
                "submitToMarket" + System.lineSeparator() +
                "doAlgo";
		assertEquals(expected, out.toString().trim());
	}

}
