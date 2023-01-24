public class Main {
    public static void main(String[] args) {

        SmartPhone xiaomiRedmiNote8 = new SmartPhone(true, 64, "A000000",
                "Android", 5.8, 4, false);
        SmartWatch xiaomiSmartBand = new SmartWatch(true, 2, "A11111",
                "Android", "Marrón", "Cuero");

        System.out.println(xiaomiRedmiNote8.toString());
        System.out.println(xiaomiSmartBand.toString());
    }
}