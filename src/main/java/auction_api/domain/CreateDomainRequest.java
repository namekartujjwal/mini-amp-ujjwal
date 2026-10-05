package auction_api.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record CreateDomainRequest(
        @NotBlank(message = "Domain name cannot be empty")
        String name,
        @NotBlank(message = "TLD cannot be empty")
        String tld,
        @Positive(message = "Length must be greater than 0")
        int length
) { }
