package cn.org.escience.log.api.web.entity.response;

/**
 */
public class Message {
    public static Meta SUCCESS_QUERY = new Meta(30001, "successfully build query!");
    public static Meta EXCEPTION_QUERY = new Meta(30002, "exception occured during query!");
    public static Meta INVALID_CLIENTID = new Meta(30003, "invalid clientid");
    public static Meta INVALID_PASSWORD= new Meta(30004, "user name or password is incorrect");
    public static Meta INVALID_CAPTCHA= new Meta(30005, "invalid captcha or captcha overdue");
    public static Meta INVALID_TOKEN = new Meta(30006, "invalid token");
    public static Meta TOKEN_LOSE = new Meta(30025, "token must be required!");
    public static Meta PARAMS_LOSE = new Meta(30007, "lack request params");
    public static Meta ID_LOSE = new Meta(30008, "lack id");
    public static Meta ID_CONFLICT = new Meta(30009, "id conflict");
    public static Meta LOGIN_ERROR = new Meta(30010, "username or password error!");
    public static Meta NOT_LOGIN = new Meta(30011, "please login!");
    public static Meta NOT_AUTH = new Meta(30012, "have no auth to do this query!");
    public static Meta NOT_FOUND = new Meta(30013, "not found resource!");
    public static Meta INVALID_COOKIE = new Meta(30014, "invalid cookie!");
    public static Meta INVALID_PARAM = new Meta(30015, "invalid param!");
    public static Meta INVALID_JSONFORMAT = new Meta(30016, "invalid json formats!");

    public static Meta EMAIL_NOTFOUND = new Meta(30017, "email not found!");
    public static Meta MOBILE_NOTFOUND = new Meta(30018, "mobile not found!");
    public static Meta DUPLICATE_RESETREQUEST  = new Meta(30019, "there is a reset request alive!");
    public static Meta RESET_OUTOFTIME  = new Meta(30020, "your reset request is out of time!");
    public static Meta error(String err){
        EXCEPTION_QUERY.setMsg(err);
        return EXCEPTION_QUERY;
    }
}
