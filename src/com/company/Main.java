package com.company;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa1 = new Pessoa(2, "Ronaldo", 23);
        Pessoa pessoa2 = new Pessoa(3, "Carioca", 25, 240, 1.85);

       pessoa.mostrarInfo();
       pessoa1.mostrarInfo();
       pessoa2.mostrarInfo();

//       System.out.println("A pessoa está " + pessoa2.calcularIMC());

        if (pessoa2.calcularIMC() == -1){
            System.out.println("Seu IMC é abaixo de 20, portanto está abaixo do peso.");
        }else if (pessoa2.calcularIMC() == 0){
            System.out.println("Seu IMC está entre 20 E 25, portanto está no peso correto.");
        }else{
            System.out.println("Seu IMC está acim de 25, portanto está com sobrepeso.");
        }


    }
}
