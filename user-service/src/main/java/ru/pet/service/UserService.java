package ru.pet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.pet.dto.UserRequest;
import ru.pet.dto.UserResponse;
import ru.pet.entity.Client;
import ru.pet.mapper.UserMapper;
import ru.pet.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
    
    private final UserRepository userRepository;
    private final UserMapper mapper;
    
    public UserResponse createUser(UserRequest userRequest){
        Client client = mapper.toEntity(userRequest);
        Client newClient = userRepository.save(client);
        return mapper.toUserResponse(newClient);
    }
    
    public UserResponse getUserById(Long id) {
        Client client = userRepository.findById(id).orElseThrow();
        return mapper.toUserResponse(client);
    }
}
