package com.company;

public class Pessoa {

    private int id;
    private String nome;
    private int idade;

    private int peso;
    private double altura;

    public Pessoa (){}

    public Pessoa (int id, String nome, int idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa (int id, String nome, int idade, int peso, double altura){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC() {
//        peso = this.peso;
        int formulaResultado = 0;
        String indiceIMC = "";

        double formula = peso / (altura * 2);

        if (formula < 20) {
            formulaResultado = -1;
        } else if (formula >= 20 || formula <= 25) {
            formulaResultado = 0;
        } else if (formula >= 25) {
            formulaResultado = 1;
        }
        return formulaResultado;

//        switch(formulaResultado){
//            case -1:
//                indiceIMC = "Baixo peso";
//                break;
//            case 0:
//                indiceIMC = "Peso saudavel";
//                break;
//            case 1:
//                indiceIMC = "Sobrepeso";
//                break;
//        }
//       return indiceIMC;
    }

    public boolean eMaiorDeIdade (int idade){
        idade = this.idade;
            if (idade < 18){
                return true;
            }
            else {
                return false;
            }
    }


    public void mostrarInfo(){
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getAltura());
        System.out.println(getPeso());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", peso='" + peso + '\'' +
                ", altura='" + altura + '\'' +
                '}';
    }

}
