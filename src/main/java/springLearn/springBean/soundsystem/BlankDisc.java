package main.java.springLearn.springBean.soundsystem;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BlankDisc implements CompactDisc{
	private String title;
	private String artist;
	private List<String> tracks;

	public BlankDisc(){

	}

	public BlankDisc(String title,String artist){
		this.title=title;
		this.artist=artist;
	}

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		for (String track: tracks) {
			System.out.println("-Track: " + track);
		}
	}
	public void playTrack(int num) {
		System.out.println("-Track: " + tracks.get(num));
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public List<String> getTracks() {
		return tracks;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}
}
