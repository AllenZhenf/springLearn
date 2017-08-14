package main.java.springLearn.springBean.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CDPlayer implements MediaPlayer {
	@Autowired
	private CompactDisc cd;
	
	//可通过构造器注入
	@Autowired
	public CDPlayer(CompactDisc cd){
		this.cd=cd;
	}
	//可通过set等方法注入
	@Autowired(required=false)//避免bean为空抛出异常通过设置required=false
	public void setCompactDisc(CompactDisc cd){
		this.cd=cd;
	}
	
	public void play(){
		cd.play();
	}
}
