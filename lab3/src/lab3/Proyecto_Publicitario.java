package lab3;

public class Proyecto_Publicitario extends Proyecto {

    private Freelance freelance;

    public Proyecto_Publicitario() {
        super();
    }

    public Proyecto_Publicitario(Freelance freelance) {
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
