import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Automato {
    private List<String> conjunto_estados;
    private List<Character> alfabeto;
    private HashMap<String, HashSet<String>> funcoes_transicao;
    private String estado_inicial;
    private List<String> estados_aceitacao;

    public List<String> getConjunto_estados() {
        return conjunto_estados;
    }

    public void setConjunto_estados(List<String> conjunto_estados) {
        this.conjunto_estados = conjunto_estados;
    }

    public List<Character> getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(List<Character> alfabeto) {
        this.alfabeto = alfabeto;
    }

    public HashMap<String, HashSet<String>> getFuncoes_transicao() {
        return funcoes_transicao;
    }

    public void setFuncoes_transicao(HashMap<String, HashSet<String>> funcoes_transicao) {
        this.funcoes_transicao = funcoes_transicao;
    }

    public String getEstado_inicial() {
        return estado_inicial;
    }

    public void setEstado_inicial(String estado_inicial) {
        this.estado_inicial = estado_inicial;
    }

    public List<String> getEstados_aceitacao() {
        return estados_aceitacao;
    }

    public void setEstados_aceitacao(List<String> estados_aceitacao) {
        this.estados_aceitacao = estados_aceitacao;
    }


    public Automato() {
        conjunto_estados = new ArrayList<>();
        alfabeto = new ArrayList<>();
        funcoes_transicao = new HashMap<>();
        estado_inicial = new String();
        estados_aceitacao = new ArrayList<>();

    }

}
