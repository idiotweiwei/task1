package net.xiaxin.spring.qs;

public class UpperAction implements Action {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String string) {
        message = string;
    }

    public String excute(String str) {
        return (getMessage() + str).toUpperCase();
    }
}
