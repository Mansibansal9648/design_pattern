package FactoryDesignPattern;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting web developer salary");
        return 40000;
    }
}
