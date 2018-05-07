package models.auth;

public class AccountInfo
{
    private String resource_id;

    private String transcript_required;

    private String account_id;

    private String is_active;

    private String description;

    private String prefix;

    private String name;

    public String getResource_id ()
    {
        return resource_id;
    }

    public void setResource_id (String resource_id)
    {
        this.resource_id = resource_id;
    }

    public String getTranscript_required ()
    {
        return transcript_required;
    }

    public void setTranscript_required (String transcript_required)
    {
        this.transcript_required = transcript_required;
    }

    public String getAccount_id ()
    {
        return account_id;
    }

    public void setAccount_id (String account_id)
    {
        this.account_id = account_id;
    }

    public String getIs_active ()
    {
        return is_active;
    }

    public void setIs_active (String is_active)
    {
        this.is_active = is_active;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getPrefix ()
    {
        return prefix;
    }

    public void setPrefix (String prefix)
    {
        this.prefix = prefix;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [resource_id = "+resource_id+", transcript_required = "+transcript_required+", account_id = "+account_id+", is_active = "+is_active+", description = "+description+", prefix = "+prefix+", name = "+name+"]";
    }
}