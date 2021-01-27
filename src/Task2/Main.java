package Task2;

public class Main {
    public static void main(String[] args) {

        Pupil a1 = new GoodPupil("Вася");
        Pupil a2 = new BadPupil("Петя");
        Pupil a3 = new ExelentPupil("Ира");
        Pupil a4 = new GoodPupil("Женя");

        a1.read();
        a1.relax();
        a1.study();
        a1.write();
        System.out.println("-----------------------");
        a2.write();
        a2.study();
        a2.relax();
        a2.read();
        System.out.println("-----------------------");
        a3.read();
        a3.relax();
        a3.study();
        a3.write();
        System.out.println("-----------------------");
        a4.write();
        a4.study();
        a4.relax();
        a4.read();
    }
}