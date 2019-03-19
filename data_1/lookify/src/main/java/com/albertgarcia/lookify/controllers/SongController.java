package com.albertgarcia.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.albertgarcia.lookify.models.Song;
import com.albertgarcia.lookify.services.SongService;

@Controller
public class SongController {
	private final SongService sS;
	
	public SongController(SongService sS) {

		this.sS = sS;
	}


	@GetMapping("")
	public String home() {
		return "index.jsp";
	}
	
    @GetMapping("/songs/new")
    public String newSong(@ModelAttribute("song") Song song) {
        return "new.jsp";
    }

	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = sS.allSongs();
		model.addAttribute("songs", songs);
		return "dashboard.jsp";
	}
	@RequestMapping(value="/songs", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("song") Song song, BindingResult result) {
        if (result.hasErrors()) {
        	return "new.jsp";
        } 
        else {
            sS.createSong(song);
            return "redirect:/dashboard";
        }
	}
	@GetMapping("/songs/{id}")
	public String showSong(@PathVariable(value="id") Long id, Model model) {
		Song s = sS.findSong(id);
		if(s != null) {
			model.addAttribute("song", s);
			return "show.jsp";
		}
		return "redirect:/dashboard";
	}
	@GetMapping("/search/topTen")
	public String getTopTen(Model model) {
		List<Song> songs = sS.top10();
		model.addAttribute("songs", songs);
		return "topTen.jsp";
	}
	@PostMapping("/search")
	public String search(@RequestParam(value="search") String search) {

		return "redirect:/search/" + search; 
	}
	@GetMapping("/search/{search}")
	public String searchBy(@PathVariable("search") String search, Model model) {
		List<Song> songs = sS.search(search);
		model.addAttribute("songs", songs);
		model.addAttribute("artist", search);
		return "search.jsp";
	}
	@RequestMapping(value="songs/{id}", method=RequestMethod.DELETE)
	public String delete(@PathVariable(value="id") Long id) {
		Song s = sS.findSong(id);
		if(s != null) {
			sS.deleteSong(id);
		}
		return "redirect:/dashboard";
	}
}
