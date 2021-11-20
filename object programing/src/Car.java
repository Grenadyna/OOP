public class Car {                                                         //nowa klasa car, KTÓRĄ chcemy uruchomić w klasie main//

    // ------------------------1. zmienne globalne ---------------------//

    private int speed = 0;                                                                     //1. na górze są zmienne globalne!!!! tutaj typu liczbowego. Tu stoi//
    private int gear;
    private String name;
    private boolean lights;

    // ------------------------2. konstruktory ---------------------//

    public Car(int speed, int gear, String name, boolean Lights){                              //2. potem konstruktor//
        this.speed = speed;
        this.gear = gear;
        this.name = name;
        this.lights = lights;
    }

    public Car(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public Car(){
    }

    public Car(boolean lights) {
        this.lights = lights;
    }

    // ------------------------3. metody---------------------//

    public void startEngine(){                                                                  //3. potem metody//
        System.out.println("Silnik działa");
    }                                                                                          // publiczna metoda bez wartości do zwrócenia, chcemy tylko uruchomić//

    public void stopEngine(){
        System.out.println("Silnik zgasł");
    }

    public void accelerate (int acceleration){                                                 //parametr speed typu liczbowego który implementuje do naszej globalnej zmiennej//
        this.speed += acceleration;
        System.out.println("Samochód jedzie z prędkością " + speed + " km/h");
    }

    public void slowDown(int speed){
        this.speed -= speed;                                                                  //THIS - oznacza że ta wartość jest najważniejsza - mamy dwa speedy, można byłoby zmienić ten nasz na inną nazwę, ale dobre praktyki mówią, żeby i tak this zostawić //
        System.out.println("Zwolniłeś do " + this.speed + " km/h");                           //wtedy tutaj trzeba też dodać this jak jest 2x ta sama nazwa//
    }

    // ------------------------4. settery ---------------------//

    public void setGear(int gear) {                                                           //4. na samym dole gettery i settery//
        if (gear < 7 && gear > -1) {
            this.gear = gear;
            System.out.println("Jesteś na biegu " + this.gear);
        }

    }
    public void setLights(boolean lights){
            this.lights = lights;
    }

    // ------------------------5. gettery ---------------------//

    public boolean returnLights() {
         return lights;

//         boolean setLights = true;
//         if()
//         if (boolean){
//             System.out.println("światła włączone");//ogarnijseto//
//         }
//
//         else if (){
//            System.out.println("światła wyłączone");
//          }
      }

     }

