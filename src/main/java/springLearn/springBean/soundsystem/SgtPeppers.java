package main.java.springLearn.springBean.soundsystem;

import org.springframework.stereotype.Component;

@Component("szf")
public class SgtPeppers implements CompactDisc {
	private String title="Sgt Pepper's Lonely Hearts Club Band";
	private String artist="The Beatles";

	@Override
	public void play() {
		System.out.print("Playing "+title+" by "+artist);
		//System.out.print(1);
	}

}
