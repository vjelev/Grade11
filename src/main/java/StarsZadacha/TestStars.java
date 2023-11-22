package StarsZadacha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestStars {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        List<Star> stars= new ArrayList<Star>();
        String[] starInfo = inp.nextLine().split(", ");
        while(stars.size()<2000 && !starInfo[0].equals("end"))
        {
            String starName = starInfo[0];
            double starDistance = Double.parseDouble(starInfo[1]);
            int starClassification = Integer.parseInt(starInfo[2]);
            double starMass = Double.parseDouble(starInfo[3]);
            String constName = starInfo[4];
            int constStars = Integer.parseInt(starInfo[5]);
            double constArea = Double.parseDouble(starInfo[6]);
            Constellation constellation = new Constellation(constName,constStars,constArea);
            Star star = new Star(starName,starDistance,starClassification,starMass,constellation);
            stars.add(star);

            starInfo = inp.nextLine().split(", ");
        }

        Collections.sort(stars);

        for (Star star : stars) {
            System.out.println(star);
        }

        //4
        List<String> constellationNames = new ArrayList<String>();

        for (Star star : stars) {
            if(!constellationNames.contains(star.getConstellation().getName())) {
                constellationNames.add(star.getConstellation().getName());
            }
        }
    }
}

/*
Проксима Кентавър, 10.5, 1, 5.0, Кентавър, 25, 120.5
Алфа Кентавър, 8.3, 2, 3.2, Кентавър, 118, 90.2
Полярна звезда, 15.7, 3, 7.8, Malka mechka, 30, 150.0
Битълджус, 6.9, 1, 4.5, Golqmata mechka, 25, 120.5
Сириус А, 12.1, 2, 6.0, Golqmata mechka, 25, 90.2
Star6, 18.2, 3, 8.2, Constellation3, 30, 150.0
Star7, 9.8, 1, 4.8, Constellation1, 25, 120.5
Star8, 14.3, 2, 7.0, Golqmata mechka, 51, 90.2
Star9, 7.6, 3, 3.5, Malka mechka, 30, 150.0
Star10, 11.4, 1, 5.5, Constellation1, 25, 120.5
end

 */
