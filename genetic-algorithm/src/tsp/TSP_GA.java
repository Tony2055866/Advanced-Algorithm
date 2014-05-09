package tsp;

import java.util.ArrayList;


public class TSP_GA {

	public static ArrayList<City> destinationCities = new ArrayList<City>();
	
    public static void main(String[] args) {

        // Create and add our cities
        City city = new City(60, 200);
        destinationCities.add(city);
        City city2 = new City(180, 200);
        destinationCities.add(city2);
        City city3 = new City(80, 180);
        destinationCities.add(city3);
        City city4 = new City(140, 180);
        destinationCities.add(city4);
        City city5 = new City(20, 160);
        destinationCities.add(city5);
        City city6 = new City(100, 160);
        destinationCities.add(city6);
        City city7 = new City(200, 160);
        destinationCities.add(city7);
        City city8 = new City(140, 140);
        destinationCities.add(city8);
        City city9 = new City(40, 120);
        destinationCities.add(city9);
        City city10 = new City(100, 120);
        destinationCities.add(city10);
        City city11 = new City(180, 100);
        destinationCities.add(city11);
        City city12 = new City(60, 80);
        destinationCities.add(city12);
        City city13 = new City(120, 80);
        destinationCities.add(city13);
        City city14 = new City(180, 60);
        destinationCities.add(city14);
        City city15 = new City(20, 40);
        destinationCities.add(city15);
        City city16 = new City(100, 40);
        destinationCities.add(city16);
        City city17 = new City(200, 40);
        destinationCities.add(city17);
        City city18 = new City(20, 20);
        destinationCities.add(city18);
        City city19 = new City(60, 20);
        destinationCities.add(city19);
        City city20 = new City(160, 20);
        destinationCities.add(city20);

        // Initialize population
        Population pop = new Population(50, true);
        System.out.println("Initial distance: " + pop.getFittest().getDistance());

        // 进化到100代就停止程序
        for (int i = 0; i < 100; i++) {
            pop = GA.evolvePopulation(pop);
        }

        // 打印最终的结果
        System.out.println("Finished");
        System.out.println("Final distance: " + pop.getFittest().getDistance());
        System.out.println("Solution:");
        System.out.println(pop.getFittest());
    }
}