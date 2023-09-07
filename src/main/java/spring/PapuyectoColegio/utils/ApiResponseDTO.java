package spring.PapuyectoColegio.utils;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

@Data
public class ApiResponseDTO<T> implements Serializable {
    @SerializedName(value = "state", alternate = {"status"})
    private boolean state = false;
    private String message = null;
    private String code = null;
    private T data = null;

    public void setSuccesTrasaction(T data) {
        this.setMessage(Constants.MESSAGES.SUCCESS_TRANSACTION.getTag());
        this.setCode(Constants.MESSAGES.SUCCESS_TRANSACTION.getCode());
        this.setState(Boolean.TRUE);
        this.setData(data);
    }

    public void setSuccesTrasaction() {
        this.setMessage(Constants.MESSAGES.SUCCESS_TRANSACTION.getTag());
        this.setCode(Constants.MESSAGES.SUCCESS_TRANSACTION.getCode());
        this.setState(Boolean.TRUE);
    }

    public void setSuccesQuery(T data) {
        this.setMessage(Constants.MESSAGES.SUCCESSFUL_QUERY.getTag());
        this.setCode(Constants.MESSAGES.SUCCESSFUL_QUERY.getCode());
        this.setState(Boolean.TRUE);
        this.setData(data);
    }

    public void setSuccesQuery() {
        this.setMessage(Constants.MESSAGES.SUCCESSFUL_QUERY.getTag());
        this.setCode(Constants.MESSAGES.SUCCESSFUL_QUERY.getCode());
        this.setState(Boolean.TRUE);
    }

    public void setSuccessUpdate(T data) {
        this.setMessage(Constants.MESSAGES.SUCCESSFUL_UPDATE.getTag());
        this.setCode(Constants.MESSAGES.SUCCESSFUL_UPDATE.getCode());
        this.setState(Boolean.TRUE);
        this.setData(data);
    }

    public void setSuccessUpdate() {
        this.setMessage(Constants.MESSAGES.SUCCESSFUL_UPDATE.getTag());
        this.setCode(Constants.MESSAGES.SUCCESSFUL_UPDATE.getCode());
        this.setState(Boolean.TRUE);
    }

    public void setSuccessCreation(T data) {
        this.setMessage(Constants.MESSAGES.SUCCESSFUL_REGISTRATION.getTag());
        this.setCode(Constants.MESSAGES.SUCCESSFUL_REGISTRATION.getCode());
        this.setState(Boolean.TRUE);
        this.setData(data);
    }

    public void setSuccessCreation() {
        this.setMessage(Constants.MESSAGES.SUCCESSFUL_REGISTRATION.getTag());
        this.setCode(Constants.MESSAGES.SUCCESSFUL_REGISTRATION.getCode());
        this.setState(Boolean.TRUE);
    }

    public void setIncompleteData() {
        this.setMessage(Constants.MESSAGES.INCOMPLETE_DATA.getTag());
        this.setCode(Constants.MESSAGES.INCOMPLETE_DATA.getCode());
        this.setState(Boolean.FALSE);
    }

    public void setFailService() {
        this.setMessage(Constants.MESSAGES.SYSTEM_FAILURE.getTag());
        this.setCode(Constants.MESSAGES.SYSTEM_FAILURE.getCode());
        this.setState(Boolean.FALSE);
    }

    public void setFailUpdate() {
        this.setMessage(Constants.MESSAGES.FAIL_UPDATE.getTag());
        this.setCode(Constants.MESSAGES.FAIL_UPDATE.getCode());
        this.setState(Boolean.FALSE);
    }

    public void setFailUpdate(T data) {
        this.setMessage(Constants.MESSAGES.FAIL_UPDATE.getTag());
        this.setCode(Constants.MESSAGES.FAIL_UPDATE.getCode());
        this.setState(Boolean.FALSE);
        this.setData(data);
    }

    public void setFailQuery() {
        this.setMessage(Constants.MESSAGES.FAIL_QUERY.getTag());
        this.setCode(Constants.MESSAGES.FAIL_QUERY.getCode());
        this.setState(Boolean.FALSE);
    }

}
