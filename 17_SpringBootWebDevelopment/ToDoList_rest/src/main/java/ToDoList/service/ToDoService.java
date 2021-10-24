package ToDoList.service;

import ToDoList.Dto.ToDoDto;
import java.util.List;

public interface ToDoService {

  ToDoDto saveToDo(ToDoDto toDoDto);

  void deleteToDo(Integer id);

  ToDoDto findById(Integer id);

  List<ToDoDto> findAll();
}
