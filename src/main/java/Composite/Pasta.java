package Composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends ArquivoSistema {

    private List<ArquivoSistema> arquivos;

    public Pasta(String nome, String descricao) {
        super(nome, descricao);
        this.arquivos = new ArrayList<ArquivoSistema>();
    }

    public void addArquivoSistema(ArquivoSistema arquivoSistema) {
        this.arquivos.add(arquivoSistema);
    }

    public String getArquivoSistema() {
        String saida = "";
        saida = "Pasta: " + this.getNome() +
                " - descrição: " + this.getDescricao() + "\n";

        for (ArquivoSistema arquivoSistema : arquivos) {
            saida += arquivoSistema.getArquivoSistema();
        }

        return saida;
    }
}