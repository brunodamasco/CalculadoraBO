package bd.calculadora.model;

public class CalculaBO {
    private Calcula calcula;
    private Integer cont = 0;
    private Double total = 0.0;

    public CalculaBO() {
    }

    public CalculaBO(Calcula calcula) {
        this.calcula = calcula;
    }

    public Calcula getCalcula() {
        return calcula;
    }

    public void setCalcula(Calcula calcula) {
        this.calcula = calcula;
    }

    public static boolean validaN1(Calcula c) {
        return c.getN1() != null;
    }

    public static boolean validaN2(Calcula c) {
        return c.getN2() != null;
    }

    public Double soma() {
        return calcula.getN1() + calcula.getN2();
    }
    public Double subtracao() {
        return calcula.getN1() - calcula.getN2();
    }

    public Double multiplicacao() {
        return calcula.getN1() * calcula.getN2();
    }

    public Double divisao() {
        return calcula.getN1() / calcula.getN2();
    }

    public void getCont() {
        cont++;
    }


    @Override
    public String toString() {
        return "Resultado: " + calcula.getN1() + " " + calcula.getN2() + " = " + soma();
    }

}
