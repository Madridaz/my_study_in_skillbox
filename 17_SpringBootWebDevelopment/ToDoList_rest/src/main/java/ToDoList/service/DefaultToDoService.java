package ToDoList.service;

import ToDoList.Dto.ToDoDto;
import ToDoList.model.ToDo;
import ToDoList.repository.ToDoRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultToDoService implements ToDoService {

  @Autowired
  private ToDoRepository toDoRepository;

  @Override
  public ToDoDto saveToDo(ToDoDto toDoDto) {
    ToDo savedToDo = toDoRepository.save(ToDoConverter.fromToDoDtoToToDo(toDoDto));
    return ToDoConverter.fromToDoToToDoDto(savedToDo);
  }

  @Override
  public void deleteToDo(Integer id) {
    toDoRepository.deleteById(id);
  }

  @Override
  public ToDoDto findById(Integer id) {
    ToDo toDo = toDoRepository.findById(id).get();
    if (toDo != null) {
      return ToDoConverter.fromToDoToToDoDto(toDo);
    }
    return null;
  }

  @Override
  public List<ToDoDto> findAll() {
    return toDoRepository.findAll()
        .stream()
        .map(ToDoConverter::fromToDoToToDoDto)
        .collect(Collectors.toList());
  }
}
