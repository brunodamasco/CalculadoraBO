package bd.calculadora.model;

public class Calcula {
    private Double n1;
    private Double n2;

    public Calcula() {
    }

    public Calcula(Double n1, Double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public void setN1(String n1) {
        try {
            this.n1 = Double.parseDouble(n1);
        } catch (Exception e) {
            this.n1 = null;
        }
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public void setN2(String n2) {
        try {
            this.n2 = Double.parseDouble(n2);
        } catch (Exception e) {
            this.n2 = null;
        }
    }
}
