package lab1;

public class First {
    public static void main(String[] args) {

        int v1=10, v2=2, v3=5, v4=8, v5=12, v6=3, v7=7, v8=1, v9=4, v10=6;
        
        System.out.println("Завдання 1:");
        System.out.println("Сума: " + (v1+v2+v3+v4+v5+v6+v7+v8+v9+v10));
        System.out.println("Різниця: " + (v1-v2-v3-v4-v5-v6-v7-v8-v9-v10));
        System.out.println("Множення: " + (v1*v2*v3*v4*v5*v6*v7*v8*v9*v10));
        System.out.println("Ділення: " + (v1/v2/v3));
        System.out.println("--------------------");

        String w1="I", w2="know", w3="it", w4="but", w5="I", 
               w6="can", w7="not", w8="confirm", w9="it";
        System.out.println("Завдання 2:");
        System.out.println(w1+" "+w2+" "+w3+" "+w4+" "+w5+" "+w6+" "+w7+" "+w8+" "+w9);
        System.out.println("--------------------");

        User u1 = new User(); u1.age = 18; u1.weight = 70.5; u1.height = 1.75;
        User u2 = new User(); u2.age = 19; u2.weight = 65.0; u2.height = 1.80;
        User u3 = new User(); u3.age = 20; u3.weight = 72.3; u3.height = 1.70;
        User u4 = new User(); u4.age = 21; u4.weight = 68.0; u4.height = 1.72;
        User u5 = new User(); u5.age = 22; u5.weight = 75.0; u5.height = 1.85;
        User u6 = new User(); u6.age = 23; u6.weight = 80.1; u6.height = 1.90;
        User u7 = new User(); u7.age = 19; u7.weight = 60.5; u7.height = 1.65;
        User u8 = new User(); u8.age = 20; u8.weight = 63.4; u8.height = 1.68;
        User u9 = new User(); u9.age = 21; u9.weight = 77.2; u9.height = 1.78;
        User u10 = new User(); u10.age = 20; u10.weight = 71.0; u10.height = 1.74;

        System.out.println("Завдання 3:");
        System.out.println("Сума віку: " + (u1.age+u2.age+u3.age+u4.age+u5.age+u6.age+u7.age+u8.age+u9.age+u10.age));
        System.out.println("Сума ваги: " + (u1.weight+u2.weight+u3.weight+u4.weight+u5.weight+u6.weight+u7.weight+u8.weight+u9.weight+u10.weight));
        System.out.println("Сума зросту: " + (u1.height+u2.height+u3.height+u4.height+u5.height+u6.height+u7.height+u8.height+u9.height+u10.height));
        System.out.println("--------------------");

        Car c1 = new Car(); c1.engineVolume = 2.0; c1.horsePower = 150;
        Car c2 = new Car(); c2.engineVolume = 1.6; c2.horsePower = 110;
        Car c3 = new Car(); c3.engineVolume = 3.0; c3.horsePower = 250;
        Car c4 = new Car(); c4.engineVolume = 1.4; c4.horsePower = 90;
        Car c5 = new Car(); c5.engineVolume = 2.5; c5.horsePower = 200;
        Car c6 = new Car(); c6.engineVolume = 1.2; c6.horsePower = 75;
        Car c7 = new Car(); c7.engineVolume = 2.2; c7.horsePower = 170;
        Car c8 = new Car(); c8.engineVolume = 1.8; c8.horsePower = 140;
        Car c9 = new Car(); c9.engineVolume = 4.0; c9.horsePower = 400;
        Car c10 = new Car(); c10.engineVolume = 1.0; c10.horsePower = 60;

        System.out.println("Завдання 4:");
        System.out.println("Сума об'ємів: " + (c1.engineVolume+c2.engineVolume+c3.engineVolume+c4.engineVolume+c5.engineVolume+c6.engineVolume+c7.engineVolume+c8.engineVolume+c9.engineVolume+c10.engineVolume));
        System.out.println("Сума потужностей: " + (c1.horsePower+c2.horsePower+c3.horsePower+c4.horsePower+c5.horsePower+c6.horsePower+c7.horsePower+c8.horsePower+c9.horsePower+c10.horsePower));
        System.out.println("--------------------");

        int number = 412;
        int last = number % 10;
        int middle = (number / 10) % 10; 
        int first = number / 100;
        
        int result = last * 100 + middle * 10 + first;
        System.out.println("Завдання 5:");
        System.out.println("Число 412 навпаки буде: " + result);
    }
}