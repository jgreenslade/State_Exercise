package edu.elon.subway;

public interface State {

	void insertCoin(SubwayStateMachine subwayStateMachine);

	void passThrough(SubwayStateMachine subwayStateMachine);

}
