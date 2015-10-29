package edu.elon.subway;

public class UnlockedState implements State{

	@Override
	public void insertCoin(SubwayStateMachine subwayStateMachine) {
		System.out.println("Thank You! (unnecessary coin)");
		
	}

	@Override
	public void passThrough(SubwayStateMachine subwayStateMachine) {
		System.out.println("You passed the turnstyle");
		subwayStateMachine.setState(subwayStateMachine.lockedState);
	}
	
	@Override
	public String toString() {
		return "UNLOCKED";
	}

}
