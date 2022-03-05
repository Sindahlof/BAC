package Domain;

public class BloodAlcholConcentration {

    public static double currentBac = 0;

    public static void BACCalulator(double weight, double height, double time, double abv, double volume, String gender) {
        double bac;
        double volumeDistribution;

        if (gender.trim().compareToIgnoreCase("female") == 0){
            volumeDistribution = femaleVolumeDistriBution(weight,height);
        } else {
            volumeDistribution = maleVolumeDistriBution(weight,height);
        }

        bac = (BloodAlcholConcentration.calculatorABV(abv,volume)/(weight*1000)*volumeDistribution)*100;

        BloodAlcholConcentration.currentBac += bac;
    }

    public static double maleVolumeDistriBution(double weight, double height) {
        double tall = height/100;
        return 0.8736 - ((0.012127 * weight) / Math.pow(tall,2));
    }

    public static double femaleVolumeDistriBution(double weight, double height) {
        double tall = height/100;
        double volumeDistribution = 0.8736 - ((0.012127 * weight) / Math.pow(tall,2));

        return volumeDistribution;
    }

    public static double calculatorABV(double abv, double volume){
        double percentage = abv * 0.01;

        return volume * percentage;
    }


    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        //System.out.println("How much do you weigh? (pounds)");
        //double weight = scanner.nextDouble();

        // System.out.println("Are you male or female?");
        // String gender = scanner.next();

        //System.out.println("How many hours ago did you start drinking?");
        //double time = scanner.nextDouble();

        // System.out.println("How many drinks did you have?");
        //int numDrinks = scanner.nextInt();

        //int i = 1;
        //double bac = 0;
        // double currentBAC = 0;
        //

        //while (i <= numDrinks) {
        // System.out.println("What was the volume of drink #" + i + "? (ounces)");
        // double volume = scanner.nextDouble();

        // System.out.println("What was the % abv of that drink?");
        //   double abv = (scanner.nextDouble()) / 100;

        // System.out.println("How many times did you have this drink?");
        //double drinkCount = scanner.nextDouble();

        //bac += (volume * abv * 5.14) / (weight * widmark);
        //i += drinkCount;
        //}

        //currentBAC = bac - 0.015 * time;

        //if (currentBAC >= 0) {
        //System.out.println("Your blood alcohol content is probably around " + currentBAC);

        BloodAlcholConcentration.BACCalulator(62,172,0,5,330,"male");
        System.out.println(BloodAlcholConcentration.currentBac);
    }
}



