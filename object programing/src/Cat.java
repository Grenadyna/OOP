public class Cat implements Animal {

    @Override                           //--> implementujemy wszystkie metody, któe znajdują się w klasie Animal//
    public void sleep() {
        System.out.println("zzZZzz");
    }

    @Override                           //--> implementujemy wszystkie metody, któe znajdują się w klasie Animal//
    public void sound() {
        System.out.println("miau miau");
    }
}
