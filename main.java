import carProps.*;
import chickenProps.NumberCombination;

import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        firstQuestion();
        secondQuestion();
    }

    public static void firstQuestion(){

        int numberOfCock = 1;
        int stillPositive = 0;


        ArrayList<NumberCombination> numberCombination = new ArrayList<NumberCombination>();

        while(stillPositive >= 0){
            if ((200 - 14*numberOfCock)%8 == 0){
                numberCombination.add(new NumberCombination(numberOfCock));
            }
            numberOfCock++;
            stillPositive = 200 - 14*numberOfCock;
        }
        if(numberCombination.isEmpty()){
            System.out.println("empty");
        }

        numberCombination.forEach(combination -> {
            if(combination.validate()){
                System.out.println(combination.numberOfCock);
                System.out.println(combination.numberOfHen);
                System.out.println(combination.numberOfChicken);

            }
        });

    }

    public static void secondQuestion(){

        ArrayList<Transport> transports = new ArrayList<Transport>();
        transports.add(new Driving());
        transports.add(new Bus());
        transports.add(new Train());
        transports.add(new Plane());


        transports.forEach( transport -> {
            if(transport.getPrice() <= 500){
                System.out.println("You can use this mean of transport: "+ transport.getName());
            }
        });
    }
}
