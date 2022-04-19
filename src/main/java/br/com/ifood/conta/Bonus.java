package br.com.ifood.conta;

public class Bonus {
    public double getBonus(double valor) {
        if (valor <= 1000) {
            return 0.05D;
        } else if (valor > 1000 && valor < 100000) {
            return 0.04D;
        } else {
            return 0.01D;
        }
    }
}
