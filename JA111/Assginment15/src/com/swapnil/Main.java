package com.swapnil;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PlayList p=new PlayList();
		for(int i=0;p.songs.size()<4;i++) {
		System.out.println("Enter the song name");
		String songname=sc.next();
		System.out.println("Enter the movie name");
		String Moviename=sc.next();
		Song s=new Song(Moviename, songname);
		p.addSong(s);
		}
	List<Song> s=p.songs;
	for(int i=0;i<s.size();i++){
		Song s1=s.get(i);
		s1.play();
	}
	}
}