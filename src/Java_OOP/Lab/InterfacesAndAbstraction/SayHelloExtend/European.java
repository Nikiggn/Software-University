package Java_OOP.Lab.InterfacesAndAbstraction.SayHelloExtend;

import Java_OOP.Lab.InterfacesAndAbstraction.SayHello.Person;

public class European extends BasePerson implements Person {
    private String name;

    protected European(String name) {
        super(name);
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}