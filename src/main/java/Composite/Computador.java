package Composite;

public class Computador {

    private ArquivoSistema diretorioRaiz;

    public void setDiretorioRaiz(ArquivoSistema diretorioRaiz) {
        this.diretorioRaiz = diretorioRaiz;
    }

    public String getDiretorioRaiz() {
        if (this.diretorioRaiz == null) {
            throw new NullPointerException("Computador sem diretório raiz");
        }
        return this.diretorioRaiz.getArquivoSistema();
    }
}