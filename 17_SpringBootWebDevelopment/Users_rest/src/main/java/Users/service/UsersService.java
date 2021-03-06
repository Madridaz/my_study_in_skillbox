package Users.service;

import Users.dto.UsersDto;
import Users.exception.ValidationException;
import java.util.List;

public interface UsersService {

  UsersDto saveUser(UsersDto usersDto) throws ValidationException;

  void deleteUser(Integer userId);

  UsersDto findByLogin(String login);

  List<UsersDto> findAll();
}
