public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 15_000;
        int miles = service.calculate(price); // должно получиться 750
        System.out.println(miles);
    }
}