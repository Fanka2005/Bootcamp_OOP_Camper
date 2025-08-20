public class Application {
    public static void main(String[] args) {
        Campsite campsite = new Campsite();

        int i = 0;
        do {
            campsite.simulate();
            i += 1;
        } while (i<6);
    }
}