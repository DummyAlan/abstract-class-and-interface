package chickenProps;

public class NumberCombination {

    public int numberOfCock;
    public int numberOfHen;

    public int numberOfChicken;

    public NumberCombination(int numberOfCock){
        this.numberOfCock = numberOfCock;
        this.numberOfHen = (200 - 14*numberOfCock)/8;

    }

    public boolean validate(){
        this.numberOfChicken = 100 - this.numberOfCock - this.numberOfHen;
        if (this.numberOfChicken%3 == 0 && this.numberOfCock%3 == 0){
            if(this.numberOfCock*5+this.numberOfHen*3+this.numberOfChicken/3 == 100);
            return true;
        }
        return false;
    }

}
