package org.example;

public class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized void depositar(double cantidad) {
        saldo += cantidad;
    }

    public synchronized void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente para retirar " + cantidad + " euros.");
        }
    }

    public synchronized double getSaldo() {
        return saldo;
    }
}

