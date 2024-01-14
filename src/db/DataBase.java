package db;

import bean.CarBean;
import bean.UserBean;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    protected List<UserBean> users = new ArrayList<UserBean>();
    protected List<CarBean> cars = new ArrayList<CarBean>();

    public List<UserBean> getUsers() {
        return users;
    }

    public void setUsers(List<UserBean> users) {
        this.users = users;
    }

    public List<CarBean> getCars() {
        return cars;
    }

    public void setCars(List<CarBean> cars) {
        this.cars = cars;
    }
}
