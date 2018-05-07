package models.accounts;

public class Errors {

	
	 private String message;

	    private String error_code;

	    public String getMessage ()
	    {
	        return message;
	    }

	    public void setMessage (String message)
	    {
	        this.message = message;
	    }

	    public String getError_code ()
	    {
	        return error_code;
	    }

	    public void setError_code (String error_code)
	    {
	        this.error_code = error_code;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [message = "+message+", error_code = "+error_code+"]";
	    }
}
