package iphone;

import iphone.internet.Email;
import iphone.internet.Navegador;
import iphone.internet.apps.Instagram;
import iphone.internet.apps.Safari;
import iphone.ipad.ReprodutorMusical;
import iphone.ipad.apps.Itunes;
import iphone.telefone.Contato;
import iphone.telefone.Telefone;

import java.time.Instant;

public class IphoneApplication {
    public static void main(String[] args) {
        Navegador navegador = null;
        String navegadorEscolhido = "Safari";

        if (navegadorEscolhido.equalsIgnoreCase("Safari")) {
            navegador = new Safari("https://www.google.com");
        } else {
            System.out.println("Navegador não encontrado.");
        }

        if (navegador != null) {
            navegador.exibirPagina();
            navegador.adicionarNovaAba();
            navegador.atualizarPagina();
        }

        Email email = new Email("qualqueremail@email.com");
        email.enviarEmail();
        email.excluirEmail();

        ReprodutorMusical reprodutorMusical = null;
        String reprodutorMusicalEscolhido = "Itunes";

        if (reprodutorMusicalEscolhido.equalsIgnoreCase("Itunes")) {
            reprodutorMusical = new Itunes("DANCER", "IDLES");
        } else {
            System.out.println("Reprodutor musical não encontrado.");
        }

        if (reprodutorMusical != null) {
            reprodutorMusical.tocarMusica();
            reprodutorMusical.pausarMusica();
            reprodutorMusical.selecionarMusica();
        }

        Telefone telefone = new Telefone("44999999999");
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        Contato contato = new Contato("Carlos", "Silva", telefone, email);
        contato.criarContato();

        Instagram instagram = new Instagram("Carlos", "carlos123");
        instagram.tirarFoto();
        instagram.gravarVideo();
    }
}
