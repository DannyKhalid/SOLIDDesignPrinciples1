package notificationService;

import discountStrategy.FestiveDiscount;
import discountStrategy.FlatDiscount;
import discountStrategy.Order;

public class Main {

    public static void main(String[] args) {

        UserNotificationService service = new UserNotificationService();

        service.setNotification(new SMSNotifier());
        System.out.println(service.notifyUser("Your code is 2233"));

        service.setNotification(new EmailNotifier());
        System.out.println(service.notifyUser("Welcome"));




    }
}
