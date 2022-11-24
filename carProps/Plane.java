package carProps;

public class Plane implements Transport{

    @Override
    public int getPrice(){
        return 1000;
    }

    @Override
    public String getName(){
        return "Plane";
    }
}
