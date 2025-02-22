package kz.kbtu.baseproject;

import kz.kbtu.baseproject.model.CustomSpringEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Slf4j
@Component
@PropertySource("classpath:values.properties")
public class Printer {
    @Value("${color}")
    private String color;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    private final Printable printable;

    public Printer(Printable printable) {
        this.printable = printable;
    }

    public  String print(String text){
        log.info(color);
        CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, text);
        applicationEventPublisher.publishEvent(customSpringEvent);
        return printable.print(text);
    }
}
