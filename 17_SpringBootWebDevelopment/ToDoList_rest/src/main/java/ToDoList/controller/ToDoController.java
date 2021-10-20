package ToDoList.controller;

import ToDoList.model.ToDo;
import ToDoList.service.ToDoService;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ToDoController {

  @Autowired
  ToDoService toDoService;

  @GetMapping("/todolist/")
  public List<ToDo> list() {
    return toDoService.allToDo();
  }

  @GetMapping("/todolist/{id}")
  public ResponseEntity<ToDo> get(@PathVariable Integer id) {
    try {
      ToDo toDo = toDoService.getToDo(id);
      return new ResponseEntity<ToDo>(toDo, HttpStatus.OK);
    } catch (NoSuchElementException e) {
      return new ResponseEntity<ToDo>(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("/todolist/")
  public void add(@RequestBody ToDo toDo) {
    toDoService.addToDo(toDo);
  }

  @PutMapping("/todolist/{id}")
  public ResponseEntity<?> update(@RequestBody ToDo toDo, @PathVariable Integer id) {
    try {
      ToDo existToDo = toDoService.getToDo(id);
      toDo.setId(id);
      toDoService.addToDo(toDo);
      return new ResponseEntity<>(HttpStatus.OK);
    } catch (NoSuchElementException e) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/todolist/{id}")
  public void delete(@PathVariable Integer id) {

    toDoService.deleteToDo(id);
  }
}

