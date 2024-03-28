package Java_OOP.Lab.InterfacesAndAbstraction.SayHelloExtend;

public abstract class BasePerson implements  Person {
    private String name;

    protected BasePerson(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
