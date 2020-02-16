package entity;

public class Result {
    String info;

    public Result(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Result{" +
                "info='" + info + '\'' +
                '}';
    }
}
