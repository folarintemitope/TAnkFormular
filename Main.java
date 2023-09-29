package Tankvolume;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double totalVolume = 0;
        double filledVolume = 0;
        double consumeVolume = 0;
        int tankType;
        int n;
    }


    public static double calculateVol(double R, double r, double h, int tankType, double l, double w, int vType) {

        if (tankType == 1) {
            //1 type : verticalCylinder
            double totalVolume = Math.PI * r * r * h;
            System.out.println(totalVolume);

            double filledVolume = Math.PI * r * r * h;
            System.out.println(filledVolume);

            double consumedVolume;
            consumedVolume = totalVolume - filledVolume;
            System.out.println(consumedVolume);

        } else if (tankType == 2) {
            //2 type : Vertical Cylinder Cone Bottom (Conical Tank)

            double totalVolume = ((((1 / 3) * Math.PI * h) * (Math.pow(R, 2) * (R * r) + Math.pow(r, 2))) + (Math.PI * r * r * h));
            System.out.println(totalVolume);

            double filledVolume = ((((1 / 3) * Math.PI * h) * (Math.pow(R, 2) * (R * r) + Math.pow(r, 2))) + (Math.PI * r * r * h));
            System.out.println(filledVolume);

            double consumedVolume;
            consumedVolume = totalVolume - filledVolume;
            System.out.println(consumedVolume);

        } else if (tankType == 3) {
            //3 type : Vertical Cylinder Cone Top
            double totalVolume = ((((1 / 3) * Math.PI * h) * (Math.pow(R, 2) * (R * r) + Math.pow(r, 2))) + (Math.PI * r * r * h));
            System.out.println(totalVolume);
            double filledVolume = ((((1 / 3) * Math.PI * h) * (Math.pow(R, 2) * (R * r) + Math.pow(r, 2))) + (Math.PI * r * r * h));
            System.out.println(filledVolume);
            double consumedVolume;
            consumedVolume = totalVolume - filledVolume;
            System.out.println(consumedVolume);


        } else if (tankType == 4) {
            //4 type : Horizontal Cylinder
            double surfaceArea = (Math.pow(r, 2) * (Math.acos(r - h / r)) - (r - h) * Math.sqrt(2 * r * h - h * h));
            double totalVolume = Math.PI * r * r * l;
            System.out.println(totalVolume);

            double filledVolume = surfaceArea * l;
            System.out.println(filledVolume);

            double consumedVolume;
            consumedVolume = totalVolume - filledVolume;
            System.out.println(consumedVolume);


        } else if (tankType == 5) {
            // 5 tpye : Rectangular
            double totalVolume = l * w * h;
            System.out.println(totalVolume);

            double filledVolume = l * w * h;
            System.out.println(filledVolume);

            double consumedVolume;
            consumedVolume = totalVolume - filledVolume;
            System.out.println(consumedVolume);


        }
        return tankType;
    }
}