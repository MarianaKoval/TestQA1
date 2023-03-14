package prog;

public class Car {
    public static String modelName = "TestName";
    private String color;
    public String engineVolume;

    public  Car(String c){   // Це конструктор, у ньому ми можемо задавати параметри з якими буде створено новий об'єкт
        color = c;   //Коли ми створюємо нову машину, до того, як ми її пофарбуємо, всі машини будуть сірими...
        //.... за замовчуванням
        engineVolume = "2L";
    }

    public void paintCar(String c) {
        color = c;
    }

    public  String getCarColor(){
        return color;

    }
}








