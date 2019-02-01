package lab3;

public class Extranjero extends Empresa {

    private String pais;
    private String pagina_web;
    private String ciudad;

    public Extranjero() {
        super();
    }

    public Extranjero(String pais, String pagina_web, String ciudad) {
        this.pais = pais;
        this.pagina_web = pagina_web;
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPagina_web() {
        return pagina_web;
    }

    public void setPagina_web(String pagina_web) {
        this.pagina_web = pagina_web;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return super.toString() + "pais=" + pais + ", pagina_web=" + pagina_web + ", ciudad=" + ciudad + '}';
    }

}
