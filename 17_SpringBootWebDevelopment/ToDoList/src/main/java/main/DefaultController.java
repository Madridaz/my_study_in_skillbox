package main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

  private final String SHOWALL = "Получение всего списка дел - /notes/";
  private final String ADD = "Добавление дела - /notes/new";
  private final String DELETE = "Удаление дела №0 - /notes/delete/new";
  private final String CLEAR = "Удаление всего списка дел - /notes/clear";

  @RequestMapping("/")
  public String index() {

    return SHOWALL + " " + ADD + " " + DELETE + " " + CLEAR;
  }


}
