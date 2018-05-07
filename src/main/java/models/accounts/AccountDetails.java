package models.accounts;

public class AccountDetails {
	private Errors[] errors;

	private Locations[] locations;

	private Address address;

	private String status;

	private String name;

	private Links[] links;

	private String type;

	private String parent_id;

	public Errors[] getErrors() {
		return errors;
	}

	public void setErrors(Errors[] errors) {
		this.errors = errors;
	}

	public Locations[] getLocations() {
		return locations;
	}

	public void setLocations(Locations[] locations) {
		this.locations = locations;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Links[] getLinks() {
		return links;
	}

	public void setLinks(Links[] links) {
		this.links = links;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	@Override
	public String toString() {
		return "ClassPojo [errors = " + errors + ", locations = " + locations + ", address = " + address + ", status = "
				+ status + ", name = " + name + ", links = " + links + ", type = " + type + ", parent_id = " + parent_id
				+ "]";
	}

}
