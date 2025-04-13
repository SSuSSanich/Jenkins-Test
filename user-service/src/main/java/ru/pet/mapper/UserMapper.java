package ru.pet.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import ru.pet.dto.UserRequest;
import ru.pet.dto.UserResponse;
import ru.pet.entity.Client;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    UserResponse toUserResponse(Client entity);
    Client toEntity(UserResponse dto);
    UserRequest toUserRequest(Client entity);
    Client toEntity(UserRequest dto);
}