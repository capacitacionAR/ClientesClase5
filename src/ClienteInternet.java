public class ClienteInternet extends Cliente{

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ClienteInternet(int codigo, String nombre, String telefono, String email) {
        super(codigo, nombre, telefono);
        this.email = email;
    }

    @Override
    public String mostrar() {
        return null;
    }

    public String toString(){
        return "Soy cliente de internet";
    }
}
