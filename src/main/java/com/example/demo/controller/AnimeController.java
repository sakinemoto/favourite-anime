package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Anime;
import com.example.demo.service.AnimeService;

/**
 * アニメ画面を制御するContorller
 * 
 * @author saki
 */
@Controller
public class AnimeController {

	@Autowired
	AnimeService service;

	@RequestMapping("/list")
	public String list(Model model) {
		List<Anime> animes = service.getAnimeList();

		model.addAttribute("animes", animes);

		return "list";
	}

}
