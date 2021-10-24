package ToDoList.controller;

import ToDoList.Dto.ToDoDto;
import ToDoList.service.ToDoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ToDoController {

  @Autowired
  private ToDoService toDoService;

  @PostMapping("/todolist/")
  public ToDoDto saveToDo(@RequestBody ToDoDto toDoDto) {
    return toDoService.saveToDo(toDoDto);
  }

  @GetMapping("/todolist/")
  public List<ToDoDto> allToDo() {
    return toDoService.findAll();
  }

  @GetMapping("/todolist/{id}")
  public ToDoDto findById(@PathVariable Integer id) {
    return toDoService.findById(id);
  }

  @DeleteMapping("/todolist/{id}")
  public ResponseEntity<Void> deleteToDo(@PathVariable Integer id) {
    toDoService.deleteToDo(id);
    return ResponseEntity.ok().build();
  }
}


