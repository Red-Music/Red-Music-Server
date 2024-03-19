package org.example.music.user.domain.repository;

import org.example.music.user.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
//    List<User> findAllById(Long id);
//    Optional<User> findAllByIdAndUserId(Long id, String userId);

}
