package main;

import java.util.ArrayList;
import java.util.List;
import response.Note;

public class Storage {

  private static ArrayList<Note> notes = new ArrayList<>();

  //создание дела
  public static List<Note> addNote(Note note) {
    int id = notes.size() + 1;
    note.setId(id);
    note.setData("поменять квартиру");
    notes.add(note);
    return notes;
  }

  //удаление последнего добавленного дела
  public static List<Note> deleteNote(Note note) {
    notes.remove(notes.size() - 1);
    return notes;
  }

  //получение списка дел
  public static List<Note> getAllNotes() {
    int id = notes.size() + 1;
    Note note = new Note();
    Note note1 = new Note();
    note.setId(id);
    note.setData("заправить машину");
    notes.add(note);
    id++;
    note1.setId(id);
    note1.setData("купить продукты");
    notes.add(note1);
    return notes;
  }

  //удаление всего списка дел
  public static List<Note> clear() {
    notes.clear();
    return notes;
  }


}
