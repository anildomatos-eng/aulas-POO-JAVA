package org.example;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(){}

    public Moto(int cilindradas){
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibir_info() {
        super.exibir_info();
        System.out.println(" Cilindradas: "+cilindradas);
    }
}
