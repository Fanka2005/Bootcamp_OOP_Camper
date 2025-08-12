public class Campsite {
    private Camper camper = new Camper("Fauzanda");
    public void simulate() {
        System.out.println("Welcome to FIT2099 Camping Site");
        System.out.println("Here are the Items that " + camper.getCamperName() + " has in the backpack:");

        camper.checkAllItems();

        System.out.println("Glad that you enjoy your time here!");
    }
}
