package ru.pet.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import ru.pet.dto.UserRequest;
import ru.pet.dto.UserResponse;
import ru.pet.entity.User;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    UserResponse toUserResponse(User entity);
    User toEntity(UserResponse dto);

    UserRequest toUserRequest(User entity);
    User toEntity(UserRequest dto);
}