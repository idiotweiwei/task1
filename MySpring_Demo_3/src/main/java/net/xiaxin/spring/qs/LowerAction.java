package net.xiaxin.spring.qs;

public class LowerAction implements Action {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String excute(String str) {
        return (getMessage() + str).toLowerCase();
    }
}
