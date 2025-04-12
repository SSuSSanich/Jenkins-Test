package ru.pet.dto;

import javax.validation.constraints.NotNull;

public record UserResponse(
        @NotNull
        String name
) {
    
}
