package ru.pet.dto;

import javax.validation.constraints.NotNull;

public record UserRequest(
        @NotNull
        String name
) {
}
