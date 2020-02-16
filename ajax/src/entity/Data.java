package entity;

public class Data {
    String msg;
    String keyword;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "Data{" +
                "msg='" + msg + '\'' +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
