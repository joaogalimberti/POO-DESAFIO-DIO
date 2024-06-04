// Interface para o Reprodutor Musical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Interface para o Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação do método tocar() para o reprodutor musical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    // Implementação do método selecionarMusica(String musica) para o reprodutor musical
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    // Implementação do método ligar(String numero) para o aparelho telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    // Implementação do método atender() para o aparelho telefônico
    @Override
    public void atender() {
        System.out.println("Atendendo chamada telefônica...");
    }

    // Implementação do método exibirPagina(String url) para o navegador na internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    // Implementação do método adicionarNovaAba() para o navegador na internet
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    // Implementação do método atualizarPagina() para o navegador na internet
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    // Implementação do método pausar() para o reprodutor musical
    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    // Implementação do método iniciarCorreioVoz() para o aparelho telefônico
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
