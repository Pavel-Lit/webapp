public class Product {
    private int id;
    private String name;
    private int cost;

    @Override
    public String toString() {
        return
                "id = " + id +" "+ name + ", cost = " + cost +" "+ "rub";
    }

    public Product(int id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
}
