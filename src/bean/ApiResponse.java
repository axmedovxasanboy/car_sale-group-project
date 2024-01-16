package bean;

public class ApiResponse {
    protected Integer code;
    protected String message;

    protected Object data;
/*  Codes
    400 - Bad request, user error (program cannot process due to the something that perceived to be a client error)
    200 - OK, Success
 */


    public ApiResponse() {
    }

    public ApiResponse(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
