package com.atividade;

public class PilhaEstatica {
    
    public int[] elementos;
    public int tamanho;
    public int topo = -1;

    public PilhaEstatica(int tamanho){
        this.tamanho = tamanho;
        elementos = new int[tamanho];
    }
    public boolean isFull() {
        if(topo == tamanho) {
            return true;
        }
        return false;
    }

    public void push(int valor){
        if(isFull() != true) {
            topo += 1;
            elementos[topo] = valor;
        }
    }

    public int pop(){
        if(isEmpty() != true) {
            int elemento_removido = elementos[topo];
            topo -= 1;
            return elemento_removido;
        }
        return -1;
    }

    public boolean isEmpty(){
        if(topo == -1) {
            return true;
        }
        return false;

    }

    public int peek(){
        return elementos[topo];
    }
}
