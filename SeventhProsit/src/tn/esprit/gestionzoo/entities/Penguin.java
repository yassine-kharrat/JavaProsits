package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private int swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, int swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println(getName() + " the penguin is swimming.");
    }

    public int getSwimmingDepth() {
        return swimmingDepth;
    }
}
