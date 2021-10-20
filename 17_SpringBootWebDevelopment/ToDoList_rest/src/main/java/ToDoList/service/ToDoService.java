package ToDoList.service;

import ToDoList.model.ToDo;
import ToDoList.repository.ToDoRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ToDoService {

  @Autowired
  private ToDoRepository toDoRepository;

  public List<ToDo> allToDo() {
    return toDoRepository.findAll();
  }

  public void addToDo(ToDo toDo) {
    toDoRepository.save(toDo);
  }

  public ToDo getToDo(Integer id) {
    return toDoRepository.findById(id).get();
  }

  public void deleteToDo(Integer id) {
    toDoRepository.deleteById(id);
  }
}
