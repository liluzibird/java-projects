/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m13;

/**
 *
 * @author ACC
 */
public class CW3 {
    public static void main(String[] args) {
        String[] countryName = {"US of A", "Uganda", "Australia", "Canada", "Brazil", "Germany", 
                "South Africa", "Israel", "Iran", "Saudi Arabia", "Egypt", "India"}; //declare the country


        Double[] populationSize = {20.0, 35.0, 74.0, 26.0, 64.0, 29.0, 
                57.0, 96.0, 29.0, 58.0, 23.0, 58.0}; // declare the population

        // A parallel array are when the position match each other ex usa postion 0 and 327 position 0

        for (int i = 0; i <=11; i++ ) {
            System.out.printf("Country: %s, Population: %.2f \n", countryName[i], populationSize [i]);
        }
    }
    
}
