package resource;

import bean.CarBean;
import bean.ApiResponse;
public  class CarResource implements BaseCRUDResource<CarBean>{
    @Override
    public ApiResponse add(CarBean bean) {
/*
        TODO: Fayzullo
         Databaseda addCar method ochiladi
         bean cars listiga qoshilsin va car id qaytarilsin
         agar id null bolsa 400 code, Error occurred yozuvi va null object qaytarilsin
         id null bolmasa 200 code, Successfully added yozuvi va id qaytarilsin
*/
        return null;
    }

    @Override
    public ApiResponse get(Integer id) {
        return null;
    }

    @Override
    public ApiResponse edit(CarBean bean) {
        return null;
    }

    @Override
    public ApiResponse delete(Integer id) {
        return null;
    }


}
