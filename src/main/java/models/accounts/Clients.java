package models.accounts;

public class Clients {
	
	 private Address address;

	    private String status;

	    private String name;

	    private String client_id;

	    private String type;

	    private String location_id;

	    private String parent_id;

	    public Address getAddress ()
	    {
	        return address;
	    }

	    public void setAddress (Address address)
	    {
	        this.address = address;
	    }

	    public String getStatus ()
	    {
	        return status;
	    }

	    public void setStatus (String status)
	    {
	        this.status = status;
	    }

	    public String getName ()
	    {
	        return name;
	    }

	    public void setName (String name)
	    {
	        this.name = name;
	    }

	    public String getClient_id ()
	    {
	        return client_id;
	    }

	    public void setClient_id (String client_id)
	    {
	        this.client_id = client_id;
	    }

	    public String getType ()
	    {
	        return type;
	    }

	    public void setType (String type)
	    {
	        this.type = type;
	    }

	    public String getLocation_id ()
	    {
	        return location_id;
	    }

	    public void setLocation_id (String location_id)
	    {
	        this.location_id = location_id;
	    }

	    public String getParent_id ()
	    {
	        return parent_id;
	    }

	    public void setParent_id (String parent_id)
	    {
	        this.parent_id = parent_id;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [address = "+address+", status = "+status+", name = "+name+", client_id = "+client_id+", type = "+type+", location_id = "+location_id+", parent_id = "+parent_id+"]";
	    }

}
