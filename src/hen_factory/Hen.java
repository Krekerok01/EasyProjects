package hen_factory;

public abstract class Hen {

    abstract int getCountOfEggsPerMonth();

    public String getDescription(){
        return "Я - курица.";
    }
}
