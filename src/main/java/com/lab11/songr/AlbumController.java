package com.lab11.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String getAllAlbums(Model m) {
        Iterable<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "albums";
    }

    @GetMapping("/albums/new")
    public String getNewAlbumForm() {
        return "albumForm";
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(@RequestParam String title, String artist, int songCount, int length, String imageUrl) {
        Album newAlbum = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(newAlbum);
        return new RedirectView("/albums");
    }
}
