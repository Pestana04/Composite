package Composite;

public class Arquivo extends ArquivoSistema {

    private String extensao;
    private int tamanho;

    public Arquivo(String nome, String descricao, String extensao, int tamanho) {
        super(nome, descricao);
        this.extensao = extensao;
        this.tamanho = tamanho;
    }

    public String getExtensao() {
        return extensao;
    }

    public void setExtensao(String extensao) {
        this.extensao = extensao;
    }


    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }


    public String getArquivoSistema() {
        return "Arquivo: " + this.getNome() +
                " - descrição: " + this.getDescricao() +
                " - extensão: " + this.extensao +
                " - tamanho: " + this.tamanho + "MB\n";
    }
}