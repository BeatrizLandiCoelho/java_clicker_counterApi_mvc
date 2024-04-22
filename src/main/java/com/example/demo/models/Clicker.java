package com.example.demo.models;

import java.util.Objects;

public class Clicker {
    
        //atributos
    private long id;
    private long clickNumber;
    private String content;

    //construtor
    public Clicker( long id,long clickNumber, String content ){

        this.id = id;
        this.clickNumber = clickNumber;
        this.content = content;
    }

    //getters e setters
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public long getClickNumber(){
        return clickNumber;
    }

    public void setClickNumber(long clickNumber){
        this.clickNumber = clickNumber;
    }

    //metodos
    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj) return true;
    //     if (obj == null || getClass() != obj.getClass()) return false;
    //     Clicker clicker = (Clicker) obj;
    //     return id = clicker.id && clicker.equals(content, clicker.content);
    // }

    @Override
    public int hashCode() {
        return Objects.hash(id, content);
    }

    // Método toString()
    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }

}
