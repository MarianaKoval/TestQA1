package prog;
public class CarNameClass {
    public static void main(String... args) {

        System.out.println("Alice and Bob will buy : " + Car.modelName);

        Car aliceCar = new Car("magenta"); // new - ключове слово, яку повідомляє Java, що потрібно підготувати нову ділянку...
                                  //.... пам'яті для нового об'єкту. Ми створюємо нову машину, Car - конструктор є ....
        // ....за замовчуванням, який дозволяє створити цей об'єкт
        Car bobsCar = new Car("yellow");

        System.out.println("Cars before paint are:");
        System.out.println("Alice car color: " + aliceCar.getCarColor());
        System.out.println("Bobs car color: " + bobsCar.getCarColor());
        System.out.println("Alice car engine: " + aliceCar.engineVolume);
        System.out.println("Bobs car engine: " + bobsCar.engineVolume);

        System.out.println("=======================================");

        aliceCar.paintCar("red");
        bobsCar.paintCar("blue");

        aliceCar.modelName = "new Model";

        System.out.println("Bob now owns : " + bobsCar.modelName);

        System.out.println("Cars after paint are:");
        System.out.println("Alice car color: " + aliceCar.getCarColor());
        System.out.println("Bobs car color: " + bobsCar.getCarColor());
        System.out.println("Alice car engine: " + aliceCar.engineVolume);
        System.out.println("Bobs car engine: " + bobsCar.engineVolume);


    }
}
