package Task2;

public class ExelentPupil extends Pupil{

    public ExelentPupil(String name) {
        super(name);
    }

    @Override
    void study() {
        System.out.println(getName() + ": Exelent");
    }

    @Override
    void read() {
        System.out.println(getName() + ": Exelent");
    }

    @Override
    void write() {
        System.out.println(getName() + ": Exelent");
    }

    @Override
    void relax() {
        System.out.println(getName() + ": Exelent");
    }
}
