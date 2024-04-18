package _4_Java_OOP.EXAMS.dolphinarium.entities.dolphins;

public class BottleNoseDolphin extends BaseDolphin{
    public BottleNoseDolphin(String name, int energy) {
        super(name, energy);
    }

    @Override
    public void jump() {
        //this.setEnergy(this.getEnergy() - 200);
        this.setEnergy(super.getEnergy() - 200);
    }
}
