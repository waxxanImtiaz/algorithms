package test;

public class TransactionException extends Exception {
    private  String errorCode;
    public static final long serialVersionUID = 1L;
    public TransactionException(String errorMessage,String errorCode){
        super(errorMessage);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

}
