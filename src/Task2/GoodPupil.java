package Task2;

public class GoodPupil extends Pupil{
    public GoodPupil(String name) {
        super(name);
    }

    @Override
    void study() {
        System.out.println(getName() +": GOOD");
    }

    @Override
    void read() {
        System.out.println(getName() +": GOOD");
    }

    @Override
    void write() {
        System.out.println(getName() +": GOOD");
    }

    @Override
    void relax() {
        System.out.println(getName() +": GOOD");
    }
}
