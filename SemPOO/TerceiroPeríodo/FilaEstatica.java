package com.atividade;

public class FilaEstatica {
    public Integer[] elementos;
    private Integer primeiro = 0;
    private Integer ultimo = 0;
    private int tamanho;
  
    public FilaEstatica(int tamanho){
        this.tamanho = tamanho;
        elementos = new Integer[tamanho];
    }
    
    public void enqueue(Integer valor){
        if(isFull() != true) {
            elementos[ultimo] = valor;
            ultimo ++;
        }
        if(ultimo == tamanho) {
            ultimo = 0;
        }
    }
    public boolean isFull(){
        if(elementos[ultimo] == null) {
            return false;
        }
        return true;
    }
    public Integer dequeue(){
        if(isEmpty() == true) {
            return -1;
        }
        primeiro++;
        return elementos[primeiro - 1] = null;
        
    }
    public boolean isEmpty(){
        if(ultimo == -1) {
            return true;
        }
        return false;
    }
  }
