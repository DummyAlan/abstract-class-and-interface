package carProps;

public class Driving implements Transport{

    @Override
    public int getPrice(){
        return 500;
    }

    @Override
    public String getName(){
        return "Driving";
    }
}
