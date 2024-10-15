package net.javaguides.banking_app.dto;

public record TransferFundDto(Long fromAccountId,
                              Long toAccountId,
                              double amount) {
}
