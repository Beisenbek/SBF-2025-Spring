package kz.kbtu.baseproject;

public class MyColorPrinter implements Printable{
    @Override
    public String print(String text) {
        return "color text is printed: " + text;
    }
}
