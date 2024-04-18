package _4_Java_OOP.Lab.InterfacesAndAbstraction.CarShopExtend;

public interface Rentable extends  Car {
    Integer getMinRentDay();
    Double getPricePerDay();
}
