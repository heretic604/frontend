package by.coach.frontend.dto.account;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record AccountSingleDto(
        Long accountId,
        String username,
        LocalDate birthday,
        Integer height,
        Integer weight,
        String email
) {
}