package com.swapnil;
import java.util.List;
import java.util.ArrayList;
public class PlayList {
	public List<Song> songs = new ArrayList<>();
	
	public void addSong(Song song) {
		boolean flag=true;
		for(Song ele:songs) {
			if(ele.equals(song)) {
				flag=false;
			}
		}
		if(flag) {
			songs.add(song);
		System.out.println("Song added to the playlist successfully.");
		}
		else {
			System.out.println("Song is already added in the playlist");
		}
	}
	
}
