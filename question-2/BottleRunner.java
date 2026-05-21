public class Main {
    public static void main(String [] args) {
        System.out.println("Hello, world!");

        double amt;
        Bottle water = new Bottle(1000.0);
        amt = water.updateAmount(400.0);
        IO.println(amt);
        amt = water.updateAmount(100.0);
        IO.println(amt);
        amt = water.updateAmount(300.0);
        IO.println(amt);

        Bottle shampoo = new Bottle(40.0);
        amt = shampoo.updateAmount(30.0);
        IO.println(amt);
        amt = shampoo.updateAmount(1.0);
        IO.println(amt);
    }
}
