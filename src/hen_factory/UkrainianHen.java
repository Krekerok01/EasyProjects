package hen_factory;

public class UkrainianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 16;
    }

    public String getDescription(){
        String s = super.getDescription() + String.format(" Моя страна - %s. Я несу %s яиц в месяц.", Country.UKRAINE, getCountOfEggsPerMonth());
        return s;
    }
}
