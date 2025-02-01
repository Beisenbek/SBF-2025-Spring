package kz.kbtu.baseproject;

import kz.kbtu.baseproject.model.CustomSpringEvent;
import org.springframework.context.event.EventListener;

public class My3DPrinter implements Printable{
    @Override
    public String print(String text) {
        return "3d text is printed: " + text;
    }

    @EventListener
    public void getEvent(CustomSpringEvent event) {
        System.out.println("Received spring custom event in 3d printer - " + event.getMessage());
    }
}
