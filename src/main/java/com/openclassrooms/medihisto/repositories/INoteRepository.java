package com.openclassrooms.medihisto.repositories;

import com.openclassrooms.medihisto.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INoteRepository extends MongoRepository<Note, Long> {
}
