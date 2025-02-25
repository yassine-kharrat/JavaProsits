package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.setAge(age);
        this.isMammal = isMammal;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L'âge de l'animal ne peut pas être négatif.");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{family='" + this.family + "', name='" + this.name + "', age=" + this.age + ", isMammal=" + this.isMammal + "}";
    }
}
