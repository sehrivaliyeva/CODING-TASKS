package project.ecommerce.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.ecommerce.dto.UserDto;
import project.ecommerce.model.User;
import project.ecommerce.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void add(UserDto user) {
        User saveduser = new User();
        saveduser.setName(user.getName());
        saveduser.setSurname(user.getSurname());
        userRepository.save(saveduser);

    }
}
