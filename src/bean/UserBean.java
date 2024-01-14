package bean;

public class UserBean extends BaseBean{
    protected String username;
    protected String password;
    protected Integer balance;

    public UserBean() {
    }

    public UserBean(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 1000;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
