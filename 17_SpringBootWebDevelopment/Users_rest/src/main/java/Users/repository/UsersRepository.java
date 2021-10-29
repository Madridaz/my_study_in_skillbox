package Users.repository;

import Users.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {

  Users findByLogin(String login);
}
