import bean.ApiResponse;
import bean.CarBean;
import bean.UserBean;
import db.DataBase;
import resource.CarResource;
import resource.UserResource;

import java.util.Scanner;

public class Main {
    static Scanner scannerStr = new Scanner(System.in);
    static Scanner scannerNum = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the online car market");

        while (true) {
            if (DataBase.session == null) {
                System.out.println("0. Exit");
                System.out.println("1. Register");
                System.out.println("2. Log In");
            } else {
                System.out.println("0. Exit");
                System.out.println("1. Add car");
                System.out.println("2. Edit car");
                System.out.println("3. See my cars");
                System.out.println("4. Sell car");
                System.out.println("5. Buy car");
                System.out.println("6. My profile");
                System.out.println("9. Log Out");
            }
            String choice = scannerStr.nextLine();
            if (DataBase.session == null) {
                switch (choice) {
                    case "0" -> {
                        return;
                    }
                    case "1" -> register();
                    case "2" -> login();

                }
            } else {
                switch (choice) {
                    case "0" -> {
                        return;
                    }
                    case "1" -> addCar();
                    case "2" -> editCar();
                    case "3" -> myCarList();
                    case "4" -> sellCar();
                    case "5" -> buyCar();
                    case "6" -> myInfo();
                    case "9" -> logOut();
                }
            }
        }
    }

    private static void logOut() {

    }

    private static void myInfo() {

    }

    private static void buyCar() {

    }

    private static void sellCar() {

    }

    private static void myCarList() {

    }

    private static void editCar() {

    }

    private static void addCar() {
        System.out.println("|| -1: back to menu ||");
        System.out.print("Enter car name: ");
        String carName = scannerStr.nextLine();
        if (carName.equals("-1")) return;

        System.out.print("Enter car color: ");
        String carColor = scannerStr.nextLine();
        if (carColor.equals("-1")) return;

        System.out.print("Enter car price: ");
        int carPrice = scannerNum.nextInt();
        if (carPrice == -1) return;

        if (carPrice <= DataBase.session.getBalance() && carPrice > 0) {
            CarBean car = new CarBean(carName, carColor, DataBase.session.getId(), carPrice);
            CarResource resource = new CarResource();
            ApiResponse api = resource.add(car);
            car.setInStore(false);
            System.out.println(api.getMessage());
            if (api.getCode().equals(400)) {
                addCar();
            }
            DataBase.session.setBalance(DataBase.session.getBalance() - carPrice);
        } else {
            System.out.println("Car price is invalid!");
        }
    }

    private static void login() {
        System.out.println("Back to menu: -1");
        System.out.print("Enter your username: ");
        String username = scannerStr.nextLine();
        if (username.equals("-1")) return;
        System.out.print("Enter your password: ");
        String password = scannerStr.nextLine();

        UserResource resource = new UserResource();
        UserBean user = new UserBean(username, password);
        ApiResponse api = resource.login(user);
        System.out.println(api.getMessage());

        if (api.getCode().equals(200)) DataBase.session = (UserBean) api.getData();
    }

    private static void register() {
        UserResource resource = new UserResource();
        System.out.println("Back to menu: -1");
        System.out.print("Enter your username: ");
        String username = scannerStr.nextLine();
        if (username.equals("-1")) return;
        System.out.print("Enter your password: ");
        String password = scannerStr.nextLine();

        UserBean user = new UserBean(username, password);

        ApiResponse api = resource.add(user);

        System.out.println(api.getMessage());
        if (api.getCode().equals(400)) register();

        else if (api.getCode().equals(200)) DataBase.session = (UserBean) api.getData();
    }
}