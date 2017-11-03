package main.java.springLearn.springBean.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public interface MediaPlayer {
	public void play();
}
