package kz.kbtu.baseproject;

public class My3DPrinter implements Printable{
    @Override
    public String print(String text) {
        return "3d text is printed: " + text;
    }
}
