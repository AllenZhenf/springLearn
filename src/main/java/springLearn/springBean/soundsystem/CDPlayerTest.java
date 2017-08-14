package main.java.springLearn.springBean.soundsystem;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MediaPlayer.class)
public class CDPlayerTest {
	@Rule
	public final StandardOutputStreamLog log=new StandardOutputStreamLog();
	
	@Autowired
	private MediaPlayer player;
	
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void test() {
		assertNotNull(cd);
	}
	
	@Test
	public void play(){
		player.play();
		assertEquals("Playing Sgt Pepper's Lonely Hearts Club Band"+" by The Beatles", log.getLog());
		//assertEquals("1",log.getLog());
	}
	
	

}
