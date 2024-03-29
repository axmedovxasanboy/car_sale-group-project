package bean;

public class CarBean extends BaseBean {

    protected String name;
    protected String color;
    protected Integer userId;
    protected Integer price;
    protected Boolean isInStore;

    public CarBean() {
    }

    public CarBean(String name, String color, Integer userId, Integer price) {
        this.name = name;
        this.color = color;
        this.userId = userId;
        this.price = price;
    }

    public CarBean(Integer id, String name, String color, Integer userId, Integer price, boolean isInStore) {
        super.setId(id);
        this.name = name;
        this.color = color;
        this.userId = userId;
        this.price = price;
        this.isInStore = isInStore;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getInStore() {
        return isInStore;
    }

    public void setInStore(Boolean inStore) {
        isInStore = inStore;
    }

    @Override
    public String toString() {
        String store;
        if (isInStore) store = "In Store";
        else store = "not In Store";
        return "Car Info: [" +
                "id=" + id +
                ", car-owner-id=" + userId +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                " || " + store +
                ']';
    }
}
