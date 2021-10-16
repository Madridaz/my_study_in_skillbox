package com.alex.arkhipenkov.Notes.repository;

import com.alex.arkhipenkov.Notes.models.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, Long> {

}
