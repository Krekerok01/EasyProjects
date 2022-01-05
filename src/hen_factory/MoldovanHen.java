package hen_factory;

public class MoldovanHen extends Hen {

        public int getCountOfEggsPerMonth(){
            return 12;
        }

        public String getDescription(){
            String s = super.getDescription() + String.format(" Моя страна - %s. Я несу %s яиц в месяц.", Country.MOLDOVA, getCountOfEggsPerMonth());;
            return s;
        }
}
