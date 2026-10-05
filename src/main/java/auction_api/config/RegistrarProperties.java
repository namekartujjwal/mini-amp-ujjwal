package auction_api.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "registrar")


public record RegistrarProperties(String url, int timeout) {
}
