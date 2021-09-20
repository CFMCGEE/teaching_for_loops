package tryingtoteach;

import java.util.Arrays;

//class dataType
public class Enhancing {

    public static void main(String[] args) {
//String array
        String[] names = {"Caleb", "Daya", "Jade", "Diego", "Boris", "Lia", "Cece", "Ishemll", "Saahir", "Jordan", "Shannon", "Raul", "Jeremy", "Shafi"};

        //array sorting (descending order)
        Arrays.sort(names);

        //for dataType (variable) : array or collection
        for (String n : names) {
            //loops through every element and prints them out
            System.out.println(n);
        }
    }
}

