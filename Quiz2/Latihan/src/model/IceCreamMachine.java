package model;

import state.GenerateIceCreamState;
import state.IceCreamReadyState;
import state.IdleState;
import state.SelectingIceCreamState;
import state.State;

public class IceCreamMachine {
	private State ready, idle, generating, selectingState;
	private State currState;
	private IceCream iceCream;
	private String type;
	
	public IceCreamMachine() {
		ready = new IceCreamReadyState(this);
		idle = new IdleState(this);
		generating = new GenerateIceCreamState(this);
		selectingState = new SelectingIceCreamState(this);
		currState = idle;
	}

	public void insertMoney() {
		currState.turnMoney();
	}
	
	public void chooseIceCream(String type) {
		currState.pickingIceCream();
	}
	
	public void generateIceCream() {
		currState.generateIceCream();
	}
	
	public IceCream takeIceCream() {
		return currState.takeIceCream();
	}
	
	public void setCurrStatus(State currState) {
		this.currState = currState;
	}

	public State getReady() {
		return ready;
	}

	public void setReady(State ready) {
		this.ready = ready;
	}

	public State getIdle() {
		return idle;
	}

	public void setIdle(State idle) {
		this.idle = idle;
	}

	public State getGenerating() {
		return generating;
	}

	public void setGenerating(State generating) {
		this.generating = generating;
	}

	public State getSelectingState() {
		return selectingState;
	}

	public void setSelectingState(State selectingState) {
		this.selectingState = selectingState;
	}

	public State getCurrState() {
		return currState;
	}

	public void setCurrState(State currState) {
		this.currState = currState;
	}

	public IceCream getIceCream() {
		return iceCream;
	}

	public void setIceCream(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
