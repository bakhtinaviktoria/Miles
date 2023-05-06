public class BonusMilesService {
    public int calculate(int price) {
        int rubles = 20; // кол-во рублей для одной бонусной мили
        int result = price / rubles; // расчет миль
        return result;
    }
}

