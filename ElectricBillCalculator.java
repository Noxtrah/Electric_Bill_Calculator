//Doğa Kayra Yılmazarslan 20070006049 Section-2

import java.util.Scanner;

public class ElectricBillCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number_of_range_type = 3;
        int range[] = {120,240,1000};
        double[] residential_rate = {0.15, 0.20, 0.25};
        double[] industrial_rate = {0.12, 0.15, 0.23};
        double[] communal_rate = {0.10, 0.15, 0.20};

        float monthlyEnergyConsumption = 0;

        int typeOfElectricityUsage = 0;

        float electricBillTotal = 0;


        while (true) {

            System.out.print("Enter monthly energy consumption (kWh): ");

            monthlyEnergyConsumption = input.nextFloat();

            System.out.print("Enter type of electricity usage (1 for residential, 2 for industrial, 3 for communal): ");

            typeOfElectricityUsage = input.nextInt();

            if (typeOfElectricityUsage == 1) {
                for (int i = 0; i < number_of_range_type; i++) {
                    if (monthlyEnergyConsumption <= range[i]) {
                        electricBillTotal += residential_rate[i] * monthlyEnergyConsumption;
                        break;
                    }
                }
                System.out.println("Electric bill total: $" + electricBillTotal);
                electricBillTotal = 0;
            }

            else if (typeOfElectricityUsage == 2) {
                for (int i = 0; i < number_of_range_type; i++) {
                    if (monthlyEnergyConsumption <= range[i]) {
                        electricBillTotal += industrial_rate[i] * monthlyEnergyConsumption;
                        break;
                    }
                }
                System.out.println("Electric bill total: $" + electricBillTotal);
                electricBillTotal = 0;
            }


            else if (typeOfElectricityUsage == 3) {
                for (int i = 0; i < number_of_range_type; i++) {
                    if (monthlyEnergyConsumption <= range[i]) {
                        electricBillTotal += communal_rate[i] * monthlyEnergyConsumption;
                        break;
                    }
                }
                System.out.println("Electric bill total: $" + electricBillTotal);
                electricBillTotal = 0;
            }

        }
    }
}

