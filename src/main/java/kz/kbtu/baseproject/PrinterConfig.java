package kz.kbtu.baseproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {
    @Bean
    Printable getPrintable() {
        return new My3DPrinter();
    }

    @Bean
    Printer getPrinter() {
        return new Printer(new My3DPrinter());
    }
}
