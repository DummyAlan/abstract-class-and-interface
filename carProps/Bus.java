package carProps;

public class Bus implements Transport{

    @Override
    public int getPrice(){
        return 300;
    }

    @Override
    public String getName(){
        return "Bus";
    }
}
