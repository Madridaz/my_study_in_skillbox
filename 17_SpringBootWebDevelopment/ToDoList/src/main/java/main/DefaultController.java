package main;

import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

  @RequestMapping("/")
  public String index() {
    double i = Math.random();
    return (new Date()).toString() + "; " + "случайное число " + i;
  }


}
