package trabajo.modelo;

public class Persona 
{
    
    private String username;
    private String password;

    public Persona(String username, String password){
		this.username = username;
		this.password = password;
    }
    public void setUsuario (String x)
    {
        this.username=x; 
    }

    public String getUsuario ()
    {
        return this.username;                                
    }
     public void setContrase�a (String x)
    {
        this.password=x; 
    }

    public String getContrase�a ()
    {
        return this.password;                                
    }
}
    