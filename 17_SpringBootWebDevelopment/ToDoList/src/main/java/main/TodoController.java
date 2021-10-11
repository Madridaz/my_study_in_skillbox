package main;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import response.Note;

@RestController
public class TodoController {

  @RequestMapping(value = "/notes/", method = RequestMethod.GET)
  public List<Note> list() {
    return Storage.getAllNotes();
  }

  @RequestMapping(value = "/notes/new", method = RequestMethod.GET)
  public List<Note> add(Note note) {

    return Storage.addNote(note);
  }

  @RequestMapping(value = "/notes/delete/new", method = RequestMethod.GET)
  public List<Note> delete(Note note) {

    return Storage.deleteNote(note);
  }

  @RequestMapping(value = "/notes/clear", method = RequestMethod.GET)
  public List<Note> clear(Note note) {
    return Storage.clear();
  }

}
