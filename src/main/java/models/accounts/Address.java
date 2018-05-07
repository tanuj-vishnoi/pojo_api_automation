package models.accounts;

public class Address {
	
	 private String address_3;

	    private String address_4;

	    private String postal_code;

	    private String state;

	    private String address_1;

	    private String address_2;

	    private String country;

	    private String city;

	    public String getAddress_3 ()
	    {
	        return address_3;
	    }

	    public void setAddress_3 (String address_3)
	    {
	        this.address_3 = address_3;
	    }

	    public String getAddress_4 ()
	    {
	        return address_4;
	    }

	    public void setAddress_4 (String address_4)
	    {
	        this.address_4 = address_4;
	    }

	    public String getPostal_code ()
	    {
	        return postal_code;
	    }

	    public void setPostal_code (String postal_code)
	    {
	        this.postal_code = postal_code;
	    }

	    public String getState ()
	    {
	        return state;
	    }

	    public void setState (String state)
	    {
	        this.state = state;
	    }

	    public String getAddress_1 ()
	    {
	        return address_1;
	    }

	    public void setAddress_1 (String address_1)
	    {
	        this.address_1 = address_1;
	    }

	    public String getAddress_2 ()
	    {
	        return address_2;
	    }

	    public void setAddress_2 (String address_2)
	    {
	        this.address_2 = address_2;
	    }

	    public String getCountry ()
	    {
	        return country;
	    }

	    public void setCountry (String country)
	    {
	        this.country = country;
	    }

	    public String getCity ()
	    {
	        return city;
	    }

	    public void setCity (String city)
	    {
	        this.city = city;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [address_3 = "+address_3+", address_4 = "+address_4+", postal_code = "+postal_code+", state = "+state+", address_1 = "+address_1+", address_2 = "+address_2+", country = "+country+", city = "+city+"]";
	    }

}
