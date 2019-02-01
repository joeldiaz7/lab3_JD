package lab3;

public class Ingresos {

    private Empresa empresa;
    private Freelance freelance;
    private String dinero;

    public Ingresos() {
    }

    public Ingresos(Empresa empresa, Freelance freelance, String dinero) {
        this.empresa = empresa;
        this.freelance = freelance;
        this.dinero = dinero;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Freelance getFreelance() {
        return freelance;
    }

    public void setFreelance(Freelance freelance) {
        this.freelance = freelance;
    }

    public String getDinero() {
        return dinero;
    }

    public void setDinero(String dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Ingresos{" + "empresa=" + empresa + ", freelance=" + freelance + ", dinero=" + dinero + '}';
    }

}
