package edu.elon.subway;

public class SubwayStateMachine {
	
	enum Turnstyle {LOCKED, UNLOCKED};
	
	private State state;
	
	private Turnstyle t;
	
	public SubwayStateMachine() {
		t = Turnstyle.LOCKED;
	}
	
	public String getState() {
		return t.toString();
	}
	
	public void coin() {
		state.insertCoin(this);
	}

	public void pass() {
		state.passThrough(this);
	}
}
