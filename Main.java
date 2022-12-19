package Interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(2356421);

        timsPhone.powerOn();
        timsPhone.callPhone(2356421);
        timsPhone.answer();

        timsPhone = new MobilePhone(444444);
        //timsPhone.powerOn();
        timsPhone.callPhone(444444);
        timsPhone.answer();

    }
}
