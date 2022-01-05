package hen_factory;

public class BelarusianHen extends Hen {
        public int getCountOfEggsPerMonth(){
            return 15;
        }

        public String getDescription(){
            String s = super.getDescription() + String.format(" Моя страна - %s. Я несу %s яиц в месяц.", Country.BELARUS, getCountOfEggsPerMonth());;
            return s;
        }
}
