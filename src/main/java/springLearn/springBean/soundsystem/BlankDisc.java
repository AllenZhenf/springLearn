package main.java.springLearn.springBean.soundsystem;

import java.util.List;

public class BlankDisc implements MediaPlayer{
	private String title;
	private String artist;
	private List<String> tracks;


	public BlankDisc(String title,String artist,List<String> tracks){
		this.title=title;
		this.artist=artist;
		this.tracks=tracks;
	}

	@Override
	public void play() {

	}


}
