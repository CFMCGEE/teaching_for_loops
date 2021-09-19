package tryingtoteach;

import java.util.Arrays;

//class dataType
public class Teaching {
//AccessModifier | instance of a class | returnType(dataType) | name(value)
    public static String hasName(String[] students, String element) {
//for dataType variable = value (statement 1) condition (statement 2) value++ (arithmetic operator) (statement 3)
/*
    What are statements?
*/
        for (int i = 0; i < students.length; i++) {
         //dataType (variable) = value[statement]
            String name = students[i];
          //if name is equal to the element then...
            if (name.equals(element)) {
                return element + " appears to be in the array. Good job.";
            }
        }
        return "There is no element called " + element + " in the array! Try again.";
    }
    public static void main(String[] args) {

//String array
    String[] names = {"Caleb", "Daya", "Jade", "Diego", "Boris", "Lia", "Cece", "Ishemll", "Saahir", "Jordan", "Shannon", "Raul", "Jeremy", "Shafi"};

    //array sorting
     Arrays.sort(names);

     //print out the full string array
        System.out.println(Arrays.toString(names));
     //print out the string array that has the equal element of Jade and whether it is true or false
        System.out.println(hasName(names, "Danny"));

    }
}
