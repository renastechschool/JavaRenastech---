package day26_owerwriting.CarTask;

public class CarObjects {

    public static void main(String[] args) {

        //parent class is Car
            //childs are  Audi BMW Toyota
        Audi audi=new Audi();
        audi.startCar();
        audi.stopCar();

        BMW bmw=new BMW();
        bmw.startCar();
        bmw.stopCar();

        Toyota toyota=new Toyota();
        toyota.startCar();
        toyota.stopCar();
    }
}
