package com.albertgarcia.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.albertgarcia.lookify.models.Song;
import com.albertgarcia.lookify.repositories.SongRepository;

@Service
public class SongService {
	private final SongRepository sR;

	public SongService(SongRepository sR) {
		this.sR = sR;
	}
	public List<Song> allSongs(){
		return sR.findAll();
	}
	public List<Song> top10(){
		return sR.findTop10ByOrderByRatingDesc();
	}
	public List<Song> search(String search){
		return sR.findByArtistContaining(search);
	}
	public Song findSong(Long id) {
		Optional<Song> optSong = sR.findById(id);
		if(optSong.isPresent()) {
			return optSong.get();
		}
		return null;
	}
	public Song createSong(Song song) {
		return sR.save(song);
	}
	public void deleteSong(long id) {
		Optional<Song> optSong = sR.findById(id);
		if(optSong.isPresent()) {
			sR.delete(optSong.get());
		}
	}
	
}
