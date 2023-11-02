package objeto;

import java.io.Serializable;

public class DataRequest implements Serializable {
    private String requestType;

    public DataRequest(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestType() {
        return requestType;
    }
}
