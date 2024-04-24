public class EnumExample {
    public enum Laptop {
        HP(200),
        THINKPAD(150),
        DELL(250),
        LENOVO(300);

        private final int price;

        private Laptop(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        for (Laptop laptop : Laptop.values()) {
            System.out.println(laptop + " - Price: $" + laptop.getPrice());
        }
    }
}
