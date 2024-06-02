package br.com.dio.service;

import br.com.dio.domain.model.User;
import br.com.dio.domain.repository.UserRepository;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
