package m.icoolh;

import java.io.Serializable;

public class Message implements Serializable {

    private String msgNo;
    private Object object;

    public Message(String msgNo, Object object) {
        this.msgNo = msgNo;
        this.object = object;
    }

    @Override
    public String toString() {
        return "Message{" +
                "msgNo='" + msgNo + '\'' +
                ", object=" + object +
                '}';
    }
}
