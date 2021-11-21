public class Dog implements Animal {

    @Override                           //--> implementujemy wszystkie metody, któe znajdują się w klasie Animal//
    public void sleep() {
        System.out.println("pruk pruk");
    }

    @Override                           //--> implementujemy wszystkie metody, któe znajdują się w klasie Animal//
    public void sound() {
        System.out.println("hau hau");
    }
}
