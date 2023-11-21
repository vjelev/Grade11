package arraysPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    String typeOfVehicle;
    String modelOfVehicle;
    String colorOfVehicle;
    int horsepowerOfVehicle;

    public String getModelOfVehicle() {
        return modelOfVehicle;
    }

    public void setModelOfVehicle(String modelOfVehicle) {
        this.modelOfVehicle = modelOfVehicle;
    }

    public VehicleCatalogue(String typeOfVehicle, String modelOfVehicle, String colorOfVehicle, int horsepowerOfVehicle) {
        if (typeOfVehicle.equals("car") || typeOfVehicle.equals("truck")) {
            this.typeOfVehicle = typeOfVehicle;
        } else throw new IllegalArgumentException("Input vehicle type: car or truck");
        this.modelOfVehicle = modelOfVehicle;
        this.colorOfVehicle = colorOfVehicle;
        if (horsepowerOfVehicle > 0 && horsepowerOfVehicle <= 1000) {
            this.horsepowerOfVehicle = horsepowerOfVehicle;
        } else throw new IllegalArgumentException("Input horsepower of vehicle between 0 and 1000.");
    }


    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getColorOfVehicle() {
        return colorOfVehicle;
    }

    public int getHorsepowerOfVehicle() {
        return horsepowerOfVehicle;
    }

    public static String capitalizeFirstLetter(String input) {

        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        List<VehicleCatalogue> listVehicles = new ArrayList<VehicleCatalogue>();
        String vehicleInfo = inp.nextLine();
        while (!vehicleInfo.equals("End")) {
            String[] vehicleStringArr = vehicleInfo.split(" ");
            VehicleCatalogue vehicle = new VehicleCatalogue(vehicleStringArr[0], vehicleStringArr[1],
                    vehicleStringArr[2], Integer.parseInt(vehicleStringArr[3]));
            listVehicles.add(vehicle);
            vehicleInfo = inp.nextLine();
            if (listVehicles.size() > 50) throw new Exception("Input no more than 50 vehicles.");
        }


        String vehicleModel = inp.nextLine();
        List<String> listVehicleModels = new ArrayList<String>();
        while (!vehicleModel.equals("Close the Catalogue")) {
            listVehicleModels.add(vehicleModel);
            if (listVehicleModels.contains(vehicleModel = inp.nextLine())) {
                throw new IllegalArgumentException("You cant input two of the same models.");
            }
        }
        Iterator<String> iterator = listVehicleModels.iterator();

        for (String vehiclemodel : listVehicleModels) {
            for (VehicleCatalogue vehicle : listVehicles) {
                if (vehiclemodel.equals(vehicle.getModelOfVehicle())) {
                    System.out.println("Type: " + capitalizeFirstLetter(vehicle.getTypeOfVehicle()));
                    System.out.println("Model: " + vehicle.getModelOfVehicle());
                    System.out.println("Color: " + vehicle.getColorOfVehicle());
                    System.out.println("Horsepower: " + vehicle.getHorsepowerOfVehicle());
                }
            }

        }
        double sumTruck = 0;
        int countTruck=0;
        double sumCar = 0;
        int countCar=0;
        for (VehicleCatalogue vehicle : listVehicles)
        {
            if(vehicle.getTypeOfVehicle().equals("truck")){
                sumTruck= sumTruck +Double.valueOf(vehicle.getHorsepowerOfVehicle());
          countTruck++;}

            if(vehicle.getTypeOfVehicle().equals("car")){
                sumCar= sumCar +Double.valueOf(vehicle.getHorsepowerOfVehicle());
                countCar++;}
        }
        double averageHorsepowerCars = sumCar/countCar;
        double averageHorsepowerTrucks = sumTruck/countTruck;
        if(countCar==0)averageHorsepowerCars=0;
        if(countTruck==0)averageHorsepowerTrucks=0;
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsepowerCars);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageHorsepowerTrucks);

    }
}