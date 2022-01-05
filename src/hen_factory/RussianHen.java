package hen_factory;

public class RussianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 17;
    }

    public String getDescription() {
        String s = super.getDescription() + String.format(" Моя страна - %s. Я несу %s яиц в месяц.", Country.RUSSIA, getCountOfEggsPerMonth());
        return s;
    }
}
