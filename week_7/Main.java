public class Main {
    public static void main(String[] args) {

        // الجهاز الأول: الغسالة
        WashingMachine washingMachine = new WashingMachine("LG");
        washingMachine.displayBrand();
        washingMachine.turnOn();
        washingMachine.operate();
        washingMachine.turnOff();

        System.out.println(); // سطر فارغ بين المخرجات

        // الجهاز الثاني: الثلاجة
        Refrigerator refrigerator = new Refrigerator("Panasonic");
        refrigerator.displayBrand();
        refrigerator.turnOn();
        refrigerator.operate();
        refrigerator.turnOff();
    }
}