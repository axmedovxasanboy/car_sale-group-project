package bean;

public class CarBean extends BaseBean{

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
}
