package org.example;

public class Lanzador {
    public static void main() {
        Cuenta cuenta = new Cuenta(10000);

        Thread[] hilosClientes = new Thread[10];

        for (int i = 0; i < hilosClientes.length; i++) {
            hilosClientes[i] = new Thread(new HiloCliente(cuenta));
            hilosClientes[i].start();
        }

        for (Thread thread : hilosClientes) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        double saldoFinal = cuenta.getSaldo();
        if (saldoFinal == 10000) {
            System.out.println("La simulación fue exitosa. El saldo final es 10,000 euros.");
        } else {
            System.out.println("La simulación ha fallado. El saldo final es: " + saldoFinal + " euros.");
        }
    }
}

