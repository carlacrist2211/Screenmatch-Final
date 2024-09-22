package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int TempoTotal = 0;

    public int getTempoTotal() {
        return TempoTotal;
    }


//    public void inclui (Filme f) {
//        TempoTotal +=f.getDuracaoEmMinutos();
//
//    }
//
//    public void inclui (Serie s) {
//        TempoTotal +=s.getDuracaoEmMinutos();
//
//    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de" + titulo);
        this.TempoTotal += titulo.getDuracaoEmMinutos();

    }
}
