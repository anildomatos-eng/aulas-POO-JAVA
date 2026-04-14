package org.example;

public class Carro extends Veiculo{
    private int numero_portas;

    public Carro(){}

    public Carro(int numero_portas){
        this.numero_portas = numero_portas;
    }

    public int getNumero_portas() {
        return numero_portas;
    }

    public void setNumero_portas(int numero_portas) {
        this.numero_portas = numero_portas;
    }

    @Override
    public void exibir_info() {
        super.exibir_info();
        System.out.println("Portas: "+numero_portas);
    }

}
