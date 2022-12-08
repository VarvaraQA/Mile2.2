public class BonusMilesService {
    public int calculate(int cost) {
        int prices = cost;
        int miles = prices / 20;
        return miles;
    }
}