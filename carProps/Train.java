package carProps;

public class Train implements Transport{

    @Override
    public int getPrice(){
        return 400;
    }

    @Override
    public String getName(){
        return "Train";
    }
}
