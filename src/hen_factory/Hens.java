package hen_factory;

public class Hens {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
    }

    static class HenFactory implements Country {
        static Hen getHen(String country){
            Hen hen = null;
            if (country.equals(Country.BELARUS)){
                hen = new BelarusianHen();
            } else if (country.equals(Country.UKRAINE)){
                hen = new UkrainianHen();
            } else if(country.equals(Country.RUSSIA)){
                hen = new RussianHen();
            } else if(country.equals(Country.MOLDOVA)){
                hen = new MoldovanHen();
            }
            return hen;
        }
    }
}
