package lab3;

public class Nacionales extends Empresa {

    private String departamento;
    private String municipio;
    private String ciudad;
    private String mision;
    private String vision;

    public Nacionales() {
        super();
    }

    public Nacionales(String departamento, String municipio, String ciudad, String mision, String vision) {
        this.departamento = departamento;
        this.municipio = municipio;
        this.ciudad = ciudad;
        this.mision = mision;
        this.vision = vision;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    @Override
    public String toString() {
        return super.toString() + "departamento=" + departamento + ", municipio=" + municipio + ", ciudad=" + ciudad + ", mision=" + mision + ", vision=" + vision + '}';
    }

}
