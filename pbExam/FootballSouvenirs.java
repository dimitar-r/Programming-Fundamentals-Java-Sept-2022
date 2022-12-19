package pbExam;

import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String typeSouvenirs = scanner.nextLine();
        int countSouvenirs = Integer.parseInt(scanner.nextLine());
        double priceSouvenir = 0;
        boolean invalidCountry = false;
        boolean invalidStock = false;

        switch (country) {
            case "Argentina":
                if (typeSouvenirs.equals("flags")) {
                    priceSouvenir += 3.25;
                } else if (typeSouvenirs.equals("caps")) {
                    priceSouvenir += 7.20;
                } else if (typeSouvenirs.equals("posters")) {
                    priceSouvenir += 5.10;
                } else if (typeSouvenirs.equals("stickers")) {
                    priceSouvenir += 1.25;
                } else {
                    invalidStock = true;
                }
                break;
            case "Brazil":
                if (typeSouvenirs.equals("flags")) {
                    priceSouvenir += 4.20;
                } else if (typeSouvenirs.equals("caps")) {
                    priceSouvenir += 8.50;
                } else if (typeSouvenirs.equals("posters")) {
                    priceSouvenir += 5.35;
                } else if (typeSouvenirs.equals("stickers")) {
                    priceSouvenir += 1.20;
                } else {
                    invalidStock = true;
                }
                break;
            case "Croatia":
                if (typeSouvenirs.equals("flags")) {
                    priceSouvenir += 2.75;
                } else if (typeSouvenirs.equals("caps")) {
                    priceSouvenir += 6.90;
                } else if (typeSouvenirs.equals("posters")) {
                    priceSouvenir += 4.95;
                } else if (typeSouvenirs.equals("stickers")) {
                    priceSouvenir += 1.10;
                }else {
                    invalidStock = true;
                }
                break;
            case "Denmark":
                if (typeSouvenirs.equals("flags")) {
                    priceSouvenir += 3.10;
                } else if (typeSouvenirs.equals("caps")) {
                    priceSouvenir += 6.50;
                } else if (typeSouvenirs.equals("posters")) {
                    priceSouvenir += 4.80;
                } else if (typeSouvenirs.equals("stickers")) {
                    priceSouvenir += 0.90;
                }else {
                    invalidStock = true;
                }
                break;
            default:
                invalidCountry = true;
                break;

        }
            if (invalidCountry) {
                System.out.println("Invalid country!");
            } else if (invalidStock) {
                System.out.println("Invalid stock!");
            } else {
                System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, typeSouvenirs,
                        country, countSouvenirs * priceSouvenir);
            }

        //  if (!(country.equals("Argentina") || country.equals("Brazil") || country.equals("Croatia") || country.equals("Denmark"))) {
        //    System.out.println("Invalid country!");
        //} else if (!(typeSouvenirs.equals("flags") || typeSouvenirs.equals("caps") || typeSouvenirs.equals("posters") || typeSouvenirs.equals("stickers"))) {
        //System.out.println("Invalid stock!");
        //} else
        //System.out.printf("Pepi bought %d %s of %s for %.2f lv.", countSouvenirs, typeSouvenirs, country, countSouvenirs * priceSouvenir);


    }
}
