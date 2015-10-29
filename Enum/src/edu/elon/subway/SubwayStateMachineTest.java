package edu.elon.subway;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SubwayStateMachineTest {
	
	private SubwayStateMachine s;

	@Before
	public void setUp() throws Exception {
		s = new SubwayStateMachine();
	}

	@After
	public void tearDown() throws Exception {
		s = null;
	}

	@Test
	public void testCoin() {
		s.coin();
		assertEquals("UNLOCKED", s.getState().toString());
	}
	
	@Test
	public void testCoin2() {
		s.coin();
		s.coin();
		assertEquals("UNLOCKED",s.getState().toString());
	}

	@Test
	public void testPass() {
		s.pass();
		assertEquals("LOCKED", s.getState().toString());
	}
	
	@Test
	public void testPass2() {
		s.pass();
		s.pass();
		assertEquals("LOCKED", s.getState().toString());
	}

}
