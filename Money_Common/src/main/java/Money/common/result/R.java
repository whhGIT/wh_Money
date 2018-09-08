package Money.common.result;

/**
 * @ClassName R
 * @AuthorAdministrator
 * @Date2018/9/8 0008 11:03
 **/
public class R {
    private int code;

    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public R() {}

    public R(int code, String msg) {
        this.code=code;
        this.msg=msg;
    }

    public static R setOK() {
        return new R(1,"ok");
    }

    public static R setERROR() {
        return new R(2,"ERROR");
    }
}
