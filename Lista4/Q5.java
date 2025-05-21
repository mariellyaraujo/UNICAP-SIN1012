package Lista4;

class Carro {
    String modelo;
    int ano;
    String cor;
}

public class Q5 {
    Carro[] carros = new Carro[10];

    for(int i = 0; i < carros.length; i++){
        carros[i] = new Carro();
    }
}
