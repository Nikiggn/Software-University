package _4_Java_OOP.EXAMS._9_April_2022.fairyShop.models;

public class ShopImpl implements Shop{
    @Override
    public void craft(Present present, Helper helper) {
        for (Instrument instrument : helper.getInstruments() ) {
            while (!present.isDone() && helper.canWork() && !instrument.isBroken()){
                helper.work();
                present.getCrafted();
                instrument.use();
            }
        }
    }
}
