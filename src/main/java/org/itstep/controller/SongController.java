package org.itstep.controller;

import org.itstep.model.Song;
import org.itstep.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SongController {

    private final SongService songService;
    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }


    @GetMapping( "/songs" )
    public String showSongs(Model model) {
        List<Song> songs = songService.findAll();
        
songs.stream
().forEach(System.out::println);
        model.addAttribute("songs", songs);
        return "songs";
    }
} 