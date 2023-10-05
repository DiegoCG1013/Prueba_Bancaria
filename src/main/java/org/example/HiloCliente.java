package org.example;

public class HiloCliente implements Runnable {
    private Cuenta cuenta;

    public HiloCliente(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            cuenta.depositar(100);
            cuenta.retirar(100);
        }
        for (int i = 0; i < 20; i++) {
            cuenta.depositar(50);
            cuenta.retirar(50);
        }
        for (int i = 0; i < 60; i++) {
            cuenta.depositar(20);
            cuenta.retirar(20);
        }
    }
}

