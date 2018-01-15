package com.stackoverflow;

import com.stackoverflow.YourInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="com.stackoverflow")
public class AppConfig {
    // Add whatever is needed.
}
