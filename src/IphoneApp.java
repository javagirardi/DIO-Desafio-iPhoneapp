import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;
import model.Iphone;

public class IphoneApp {
    public static void main(String[] args) throws Exception {
        

        Iphone iphone = new Iphone();

        AparelhoTelefonico aparelho = iphone;
        aparelho.ligar();
        aparelho.atender();
        aparelho.iniciarCorreioVoz();

        NavegadorInternet internet = iphone;
        internet.exibirPagina();
        internet.adicionarNovaAba();
        internet.atualizarPagina();

        ReprodutorMusical itunes = iphone;
        itunes.selecionarMusica();
        itunes.tocar();
        itunes.pausar();
    }
}
