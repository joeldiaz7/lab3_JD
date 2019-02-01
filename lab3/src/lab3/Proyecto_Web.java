package lab3;

public class Proyecto_Web extends Proyecto {

    private Desarrollador_web desarrollador_web;

    public Proyecto_Web() {
        super();
    }

    public Desarrollador_web getDesarrollador_web() {
        return desarrollador_web;
    }

    public void setDesarrollador_web(Desarrollador_web desarrollador_web) {
        this.desarrollador_web = desarrollador_web;
    }

    @Override
    public String toString() {
        return super.toString() + "desarrollador_web=" + desarrollador_web + '}';
    }

}
