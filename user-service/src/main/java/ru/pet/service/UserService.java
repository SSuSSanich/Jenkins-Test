package ru.pet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.pet.dto.UserRequest;
import ru.pet.dto.UserResponse;
import ru.pet.entity.User;
import ru.pet.mapper.UserMapper;
import ru.pet.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
    
    private final UserRepository userRepository;
    private final UserMapper mapper;
    
    public UserResponse createUser(UserRequest userRequest){
        User user = mapper.toEntity(userRequest);
        User newUser = userRepository.save(user);
        return mapper.toUserResponse(newUser);
    }
    
    public UserResponse getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow();
        return mapper.toUserResponse(user);
    }
}
