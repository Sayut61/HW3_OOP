package Task2;

public class BadPupil extends Pupil{
    public BadPupil(String name) {
        super(name);
    }

    @Override
    void study() {
        System.out.println(getName() + ": Bad");
    }

    @Override
    void read() {
        System.out.println(getName() + ": Bad");
    }

    @Override
    void write() {
        System.out.println(getName() + ": Bad");
    }

    @Override
    void relax() {
        System.out.println(getName() + ": Bad");
    }
}
