package com.sangwoon.kim.oodp.state;

public class VideoPlayer {

	private State state;

	public VideoPlayer() {
		this.state = new StoppedState();
	}

	public void setState(State state) {
		this.state = state;
	}

	public void play() {
		state.play(this);
	}

	public void stop() {
		state.stop(this);
	}

}
