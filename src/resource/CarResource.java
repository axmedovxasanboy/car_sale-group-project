package resource;

import bean.CarBean;
import bean.ApiResponse;
import bean.UserBean;
import db.DataBase;

import java.util.List;

public class CarResource implements BaseCRUDResource<CarBean>{
    @Override
    public ApiResponse add(CarBean bean) {
        Integer id = DataBase.addCar(bean);
        return id == null ? new ApiResponse(400, "Error occurred", null) :
                new ApiResponse(200, "Successfully added!", id);
    }

    @Override
    public ApiResponse get(Integer id) {
        List<CarBean> cars = DataBase.getUserCars(id);
        return cars.isEmpty() ? new ApiResponse(400, "Empty List!", null) :
                new ApiResponse(200, "Car List", cars);
    }

    public ApiResponse delete(Integer carId, Integer userId) {
        Boolean isDeleted = DataBase.deleteCar(carId, userId);
        return isDeleted ? new ApiResponse(200, "Success", true) :
                new ApiResponse(400, "Error occurred", false);
    }

    public ApiResponse sellCar(int id, int newPrice, Integer sessionId) {
        Boolean onSale = DataBase.carSell(id, newPrice, sessionId);
        return onSale ? new ApiResponse(200, "Success", true) :
                new ApiResponse(400, "Error occurred", false);
    }

    public ApiResponse buyCar(Integer carId, UserBean user) {
        Boolean isBuy = DataBase.buyCarUser(carId, user);
        return isBuy ? new ApiResponse(200, "Success", true) :
                new ApiResponse(400, "Error occurred", false);
    }

    public ApiResponse getCarsInStore(Integer userId) {
        /*
         * TODO Fayzullo
         *  Write a logic in carsInStore method which is in Database
         *  Get a variable to that list using carsInStore method
         *  and return new ApiResponse if list is empty "Empty list" with 400 code
         *  and if not return "Car List" with 200 code and list of that cars
         * */
        return null;
    }

    public ApiResponse getCarsNotInStore(Integer userId) {
//        TODO it returns the same as getCarsInStore method (copy paste) (Fayzullo)
        return null;
    }

    public ApiResponse takeCar(int carId, Integer userId) {
        /*
        * TODO Fayzullo
        *  take result of that takeCar method to new variable
        *  and if variable is true return new ApiResponse with 200 code, "Success" message and true as an object
        *  if false code 400, "Error Occurred" message with false object
        *  <<Note takeCar method is written in DataBase class>>
        *  */
        return null;
    }

}
