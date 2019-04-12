
public class Store {

    public static void main(String[] args) {
        new Store().use();
    }
    private Product product;
    private CashRegister cashRegister;

    public Store() {
        product = new Product("Sticky tape", 200, 2.99);
        cashRegister = new CashRegister(0.00);
    }

    public void use() {
        char choice;
        while ((choice = readUser()) != 'x') {
            switch (choice) {
                case 's':
                    sell();
                    break;
                case 'r':
                    restock();
                    break;
                case 'v':
                    viewStock();
                    break;
                case 'c':
                    viewCash();
                    break;
                default:
                    help();
            }

        }
    }

    private char readUser() {
        System.out.print("Choice (s/r/v/c/x): ");
        return In.nextChar();
    }

    private void sell() {
        System.out.print("Number: ");
        int number = In.nextInt();
        if (product.hasStock(number)) {
            product.sell(number);
            cashRegister.addMoney(number * product.getPrice());
        } else {
            System.out.println("Not enough Stock");
        }

    }

    private void restock() {
        System.out.print("Number: ");
        product.restock(In.nextInt());
    }

    private void viewStock() {
        System.out.println(product.toString());
    }

    private void viewCash() {
        System.out.println(cashRegister.toString());
    }

    private void help() {
        System.out.println("Menu options");
        System.out.println("s = sell");
        System.out.println("r = restock");
        System.out.println("v = view stock");
        System.out.println("c = view cash");
        System.out.println("x = exit");
    }
}
