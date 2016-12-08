package canady_linkedlist;

public class Element {

    int power;
    String name, spec, ability;
    Element tail;

    Element(Element t, int p, String n, String s, String a) {
        this.tail = t;
        this.power = p;
        this.name = n;
        this.spec = s;
        this.ability = a;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public void setTail(Element tail) {
        this.tail = tail;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public String getSpec() {
        return spec;
    }

    public String getAbility() {
        return ability;
    }

    public Element getTail() {
        return tail;
    }

    @Override
    public String toString() {
        return name + ": " + "power: " + power + ", spec: " + spec + ", ability: " + ability;
    }
}
