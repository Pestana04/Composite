package Composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputadorTest {

    @Test
    void deveRetornarDiretorioRaiz() {
        Pasta documentos = new Pasta("Documentos", "Pasta de documentos pessoais");

        Arquivo trabalho = new Arquivo(
                "trabalho-padroes",
                "Trabalho de padrões de projeto",
                "docx",
                2
        );

        Arquivo resumo = new Arquivo(
                "resumo-aula",
                "Resumo da aula de composite",
                "pdf",
                1
        );

        documentos.addArquivoSistema(trabalho);
        documentos.addArquivoSistema(resumo);

        Computador computador = new Computador();
        computador.setDiretorioRaiz(documentos);

        assertEquals(
                "Pasta: Documentos - descrição: Pasta de documentos pessoais\n" +
                        "Arquivo: trabalho-padroes - descrição: Trabalho de padrões de projeto - extensão: docx - tamanho: 2MB\n" +
                        "Arquivo: resumo-aula - descrição: Resumo da aula de composite - extensão: pdf - tamanho: 1MB\n",
                computador.getDiretorioRaiz()
        );
    }

    @Test
    void deveRetornarDiretorioComSubpasta() {
        Pasta documentos = new Pasta("Documentos", "Pasta de documentos pessoais");
        Pasta imagens = new Pasta("Imagens", "Pasta de imagens");

        Arquivo diagrama = new Arquivo(
                "diagrama-classe",
                "Diagrama UML do padrão Composite",
                "png",
                1
        );

        Arquivo relatorio = new Arquivo(
                "relatorio",
                "Relatório final",
                "pdf",
                3
        );

        imagens.addArquivoSistema(diagrama);
        documentos.addArquivoSistema(imagens);
        documentos.addArquivoSistema(relatorio);

        Computador computador = new Computador();
        computador.setDiretorioRaiz(documentos);

        assertEquals(
                "Pasta: Documentos - descrição: Pasta de documentos pessoais\n" +
                        "Pasta: Imagens - descrição: Pasta de imagens\n" +
                        "Arquivo: diagrama-classe - descrição: Diagrama UML do padrão Composite - extensão: png - tamanho: 1MB\n" +
                        "Arquivo: relatorio - descrição: Relatório final - extensão: pdf - tamanho: 3MB\n",
                computador.getDiretorioRaiz()
        );
    }

    @Test
    void deveRetornarExcecaoComputadorSemDiretorioRaiz() {
        try {
            Computador computador = new Computador();
            computador.getDiretorioRaiz();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Computador sem diretório raiz", e.getMessage());
        }
    }
}