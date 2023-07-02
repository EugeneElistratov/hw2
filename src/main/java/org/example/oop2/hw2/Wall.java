package org.example.oop2.hw2;

public class Wall extends Barrier {

    private int heigth;

    public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("The  " + super.getName() + "  heigth: " + this.heigth);

        actions.jump();

        if (getHeigth() <= actions.getJumpHeight()) {
            System.out.println("jump success");

            return true;
        } else {
            System.out.println("jump unsuccessfully");

            return false;
        }
    }
}
