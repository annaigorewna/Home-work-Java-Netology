public class SecondWork {

    public static void main(String[] args) {

        int amount = 100;
        int addedAmount = 1700;


        if (addedAmount > 1000) {
            int bonus = addedAmount / 100;
            int totalAmount = amount + addedAmount + bonus;

            System.out.println("Количество денег на счету: " + totalAmount + " руб.");
        } else {
            int bonus = 0;
            int totalAmount = amount + addedAmount;

            System.out.println("Количество денег на счету: " + totalAmount + " руб.");
        }

    }
}

