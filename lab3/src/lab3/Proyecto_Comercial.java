package lab3;

public class Proyecto_Comercial extends Proyecto {

    private Freelance freelance;

    public Proyecto_Comercial() {
        super();
    }

    public Proyecto_Comercial(Freelance freelance) {
        this.freelance = freelance;
    }

    public Freelance getFreelance() {
        return freelance;
    }

    public void setFreelance(Freelance freelance) {
        this.freelance = freelance;
    }

    @Override
    public String toString() {
        return super.toString() + "freelance=" + freelance + '}';
    }

}
