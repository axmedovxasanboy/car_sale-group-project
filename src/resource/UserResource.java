package resource;

import bean.ApiResponse;
import bean.UserBean;
import db.DataBase;

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
        for (UserBean existingUser : DataBase.) {
            if (existingUser.getUsername().equals(user.getUsername()) &&
                    existingUser.getPassword().equals(user.getPassword())) {
                return new ApiResponse(200, "Successfully logged in", existingUser);
            }
        }
        return new ApiResponse(400, "Error-> Username or password is incorrect", null);
    }
}
