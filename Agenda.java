/*
 */
package projetoPOO.sisclinica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nikni
 */
public class Agenda {
    
    private List<Consulta> consultas;
    private List<Exame> exames;

    public Agenda() {
        this.exames = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    
    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }
    
    public void adicionaExame(Exame exame){
        this.exames.add(exame);
    }
    
    public void adicionaConsulta(Consulta consulta){
        this.consultas.add(consulta);
    }
    
}
