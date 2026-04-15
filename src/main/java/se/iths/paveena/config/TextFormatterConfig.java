package se.iths.paveena.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.iths.paveena.TextFormatter;

@Configuration
public class TextFormatterConfig {

    @Bean
    public TextFormatter textFormatter() {
        return new TextFormatter();
    }
}
