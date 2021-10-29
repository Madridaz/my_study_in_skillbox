package Users.controller;

import Users.dto.UsersDto;
import Users.exception.ValidationException;
import Users.service.UsersService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
@Log
@CrossOrigin
public class UsersController {

  private final UsersService usersService;

  @PostMapping("/save")
  public UsersDto saveUsers(@RequestBody UsersDto usersDto) throws ValidationException {
    return usersService.saveUser(usersDto);
  }

  @GetMapping("/findAll")
  public List<UsersDto> findAllUsers() {
    return usersService.findAll();
  }

  @GetMapping("/findByLogin")
  public UsersDto findByLogin(@RequestParam String login) {
    return usersService.findByLogin(login);
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<Void> deleteUsers(@PathVariable Integer id) {
    usersService.deleteUser(id);
    return ResponseEntity.ok().build();
  }
}
