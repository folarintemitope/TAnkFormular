package Tankvolume;

import java.util.Scanner;

public class TankFormula {

    public static double verticalCylinderVolume(double baseArea, double height, int type) {
        type = 1;
        double volume = baseArea * height;
        return volume;
    }

    public static double verticalCylinderTotal(double r, double h) {

       double totalVolume = Math.PI * r * r * h;
        return totalVolume;
    }
    public static double verticalCylinderFilled(double r, double h) {
        double filledVolume = Math.PI * r * r * h;
        return filledVolume;
    }
    public static double verticalCylinderCopnsumed(double totalVolume, double filledVolume) {
        double consumedVolume;
        consumedVolume = totalVolume - filledVolume;
        return consumedVolume;

    }

    public static double verticalCylinderConeBottomTotal( double R, double r, double h) {
        double totalVolume =((((1 / 3) * Math.PI * h) * (Math.pow(R, 2) * (R * r) + Math.pow(r, 2))) + (Math.PI * r * r * h));
        return totalVolume;
    }
    public static double verticalCylinderConeBottomFilled( double R ,double r, double h) {
        double filledVolume = ((((1 / 3) * Math.PI * h) * (Math.pow(R, 2) * (R * r) + Math.pow(r, 2))) + (Math.PI * r * r * h));
        return filledVolume;
    }
    public static double verticalCylinderConeBottomCopnsumed(double totalVolume, double filledVolume) {
        double consumedVolume;
        consumedVolume = totalVolume - filledVolume;
        return consumedVolume;

    }
    public static double verticalCylinderConeTopTotal( double R, double r, double h) {
        double totalVolume =((((1 / 3) * Math.PI * h) * (Math.pow(R, 2) * (R * r) + Math.pow(r, 2))) + (Math.PI * r * r * h));
        return totalVolume;
    }
    public static double verticalCylinderConeTopFilled( double R ,double r, double h) {
        double filledVolume = ((((1 / 3) * Math.PI * h) * (Math.pow(R, 2) * (R * r) + Math.pow(r, 2))) + (Math.PI * r * r * h));
        return filledVolume;
    }
    public static double verticalCylinderConeTopCopnsumed(double totalVolume, double filledVolume) {
        double consumedVolume;
        consumedVolume = totalVolume - filledVolume;
        return consumedVolume;

    }
    public static double horizontalCylinderTotal(double r, double h, double l) {
       double surfaceArea = (Math.pow(r, 2) * (Math.acos(r - h / r)) - (r - h) * Math.sqrt(2 * r * h - h * h));
       double totalVolume = Math.PI * r * r * l;
        return totalVolume;
    }
    public static double horizontalCylinderFilled( double surfaceArea, double l) {
        double filledVolume = surfaceArea * l;
        return filledVolume;
    }
    public static double horizontalCylinderCopnsumed(double totalVolume, double filledVolume) {
        double consumedVolume;
        consumedVolume = totalVolume - filledVolume;
        return consumedVolume;

    }
    public static double rectangularTankTotal( double l, double w, double h) {
       double totalVolume = l * w * h;
        return totalVolume;
    }
    public static double rectangularTankFilled( double l, double w, double h) {
        double filledVolume = l * w * h;
        return filledVolume;
    }
    public static double rectangularTankCopnsumed(double totalVolume, double filledVolume) {
        double consumedVolume;
        consumedVolume = totalVolume - filledVolume;
        return consumedVolume;
    }

}
