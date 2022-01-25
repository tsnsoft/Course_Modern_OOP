package TSN_JAVA_OOP_MINI;

public interface ITelephone {
    boolean sendSMS(String number, String sms);
    void call(String number);
}
