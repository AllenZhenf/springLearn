package main.java.springLearn.springBean.soundsystem;

import org.junit.Rule;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("szf")
public class SgtPeppers implements CompactDisc {
	private String title="Sgt Pepper's Lonely Hearts Club Band";
	private String artist="The Beatles";
	
	private final StandardOutputStreamLog log=new StandardOutputStreamLog();
	@Override
	public void play() {
		System.out.print("Playing "+title+" by "+artist);
		//System.out.print(1);
	}
	
}
