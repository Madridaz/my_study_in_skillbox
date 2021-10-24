package ToDoList.service;

import ToDoList.Dto.ToDoDto;
import ToDoList.model.ToDo;

public class ToDoConverter {

  public ToDoConverter() {
  }

  //конвертация из DTO в сущность
  public static ToDo fromToDoDtoToToDo(ToDoDto toDoDto) {
    ToDo toDo = new ToDo();
    toDo.setId(toDoDto.getId());
    toDo.setText(toDoDto.getText());
    toDo.setTitle(toDoDto.getTitle());
    return toDo;
  }

  //конвертация из сущности в объект DTO
  public static ToDoDto fromToDoToToDoDto(ToDo toDo) {
    ToDoDto toDoDto = new ToDoDto();
    toDoDto.setId(toDo.getId());
    toDoDto.setText(toDo.getText());
    toDoDto.setTitle(toDo.getTitle());
    return toDoDto;
  }

}
