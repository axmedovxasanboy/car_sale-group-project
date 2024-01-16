package resource;

import bean.ApiResponse;
import bean.UserBean;

public class UserResource implements BaseCRUDResource<UserBean> {
    @Override
    public ApiResponse add(UserBean bean) {
/*
        TODO: Azizbek
         Databaseda addUser method ochiladi
         bean usernamei uniquelikka tekshiring. Keyin users listiga qoshing
         unique bolmasa invalid username error yozuv, 400 code va null object bilan qaytarilsin
         unique bolsa users listiga qoshib successfully added yozuv, 200 code va Userbean object bilan qaytarilsin
*/
        return null;
    }

    @Override
    public ApiResponse get(Integer id) {
        return null;
    }

    @Override
    public ApiResponse edit(UserBean bean) {
        return null;
    }

    @Override
    public ApiResponse delete(Integer id) {
        return null;
    }

    public ApiResponse login(UserBean user) {
/*
        TODO: Azizbek
         userni Database dan username i va password i orqali qidiring
         topilsa 200 code i, Successfully logged in yozuvi va UserBean object bilan qaytarilsin
         topilmasa 400 code i, Error yozuvi va null object bilan qaytarilsin
*/
        return null;
    }
}
