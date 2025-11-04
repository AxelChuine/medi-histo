package com.openclassrooms.medihisto.services;

import com.openclassrooms.medihisto.repositories.INoteRepository;
import org.springframework.stereotype.Service;

@Service
public class NoteService {
    private final INoteRepository repository;

    public NoteService(INoteRepository repository) {
        this.repository = repository;
    }
}
