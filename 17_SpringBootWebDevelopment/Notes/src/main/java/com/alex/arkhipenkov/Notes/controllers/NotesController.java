package com.alex.arkhipenkov.Notes.controllers;

import com.alex.arkhipenkov.Notes.models.Note;
import com.alex.arkhipenkov.Notes.repository.NoteRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NotesController {

  @Autowired
  private NoteRepository noteRepository;

  @GetMapping("/notes")
  public String notes(Model model) {
    Iterable<Note> notes = noteRepository.findAll();
    model.addAttribute("notes", notes);
    return "notes";
  }

  @GetMapping("/notes/add")
  public String notesAdd(Model model) {
    Iterable<Note> notes = noteRepository.findAll();
    model.addAttribute("notes", notes);
    return "add";
  }

  @PostMapping("/notes/add")
  public String addNewNote(@RequestParam String title, @RequestParam String text, Model model) {
    Note note = new Note(title, text);
    noteRepository.save(note);
    return "redirect:/notes";
  }

  @GetMapping("/notes/{id}")
  public String noteDetails(@PathVariable(value = "id") long id, Model model) {
    if (!noteRepository.existsById(id)) {
      return "redirect:/notes";
    }
    Iterable<Note> notes = noteRepository.findAll();
    Optional<Note> note = noteRepository.findById(id);
    ArrayList<Note> result = new ArrayList<>();
    note.ifPresent(result::add);
    model.addAttribute("note", result);
    return "details";
  }

  @GetMapping("/notes/{id}/edit")
  public String noteEdit(@PathVariable(value = "id") long id, Model model) {
    if (!noteRepository.existsById(id)) {
      return "redirect:/notes";
    }
    Iterable<Note> notes = noteRepository.findAll();
    Optional<Note> note = noteRepository.findById(id);
    ArrayList<Note> result = new ArrayList<>();
    note.ifPresent(result::add);
    model.addAttribute("note", result);
    return "edit";
  }

  @PostMapping("/notes/{id}/edit")
  public String updateNote(@PathVariable(value = "id") long id, @RequestParam String title,
      @RequestParam String text, Model model) {
    Note note = noteRepository.findById(id).orElseThrow();
    note.setTitle(title);
    note.setText(text);
    noteRepository.save(note);
    return "redirect:/notes";
  }

  @PostMapping("/notes/{id}/remove")
  public String removeNote(@PathVariable(value = "id") long id, Model model) {
    Note note = noteRepository.findById(id).orElseThrow();
    noteRepository.delete(note);
    return "redirect:/notes";
  }

}
