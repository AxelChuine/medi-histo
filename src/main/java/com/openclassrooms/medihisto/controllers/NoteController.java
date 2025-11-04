package com.openclassrooms.medihisto.controllers;

import com.openclassrooms.medihisto.services.NoteService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {
    private final NoteService service;

    public NoteController(NoteService service) {
        this.service = service;
    }
}
