import java.sql.Array;

public class Tester {

    public static void main(String[] args) {
        String [] stringArray = new String[]{"Nissan","Ferrari","Lamborghini","Maserati","Mercedes"};
        System.out.println(stringArray.length);
        System.out.println(stringArray[2]);
        Integer [] primaNumbers = new Integer [6];
        primaNumbers[0]=2;
        primaNumbers[1]=3;
        primaNumbers[2]=5;
        primaNumbers[3]=7;
        primaNumbers[4]=11;
        primaNumbers[5]=13;

        for (Integer a: primaNumbers){
            System.out.println(a);
        }

    }

}

/**
 * define a testing class with a main() method where you:
 * define an array of strings called carBrands that is populated with 5 famous car brand names
 * print in console the number of items of the carBrands array
 * print in console the 3rd item of carBrands array
 * declare an empty array of integers called primeNumbers with a predefined size of 6 items
 * insert one by one the values of the first 6 prime numbers, populating primeNumbers array
 * print in console all the content of the already populated primeNumbers array
 */
