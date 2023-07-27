import main.java.edu.lucas.device.iphone.model.Browser1;
import main.java.edu.lucas.device.iphone.model.Browser2;
import main.java.edu.lucas.device.iphone.model.MusicPlayer1;
import main.java.edu.lucas.device.iphone.model.MusicPlayer2;
import main.java.edu.lucas.device.iphone.model.Phone;


public class IPhoneApp {

  public static void main(String[] args) {
    // Criar objetos dos reprodutores musicais
    MusicPlayer1 musicPlayer1 = new MusicPlayer1();
    MusicPlayer2 musicPlayer2 = new MusicPlayer2();
    // Criar objetos dos navegadores
    Browser1 browser1 = new Browser1();
    Browser2 browser2 = new Browser2();
    //Criar objeto do Telefone:
    Phone myPhone = new Phone("iPhone X");


    // Utilizar funcionalidades dos reprodutores musicais
    System.out.println("--- Music Player 1 ---");
    musicPlayer1.play();
    musicPlayer1.pause();
    musicPlayer1.selectSong();

    System.out.println("--- Music Player 2 ---");
    musicPlayer2.play();
    musicPlayer2.pause();
    musicPlayer2.selectSong();

    // Utilizar funcionalidades dos navegadores
    System.out.println("--- Browser 1 ---");
    browser1.displayPage();
    browser1.addNewTab();
    browser1.updatePage();
    browser1.addFavorite();
    browser1.viewHistory();

    System.out.println("--- Browser 2 ---");
    browser2.displayPage();
    browser2.addNewTab();
    browser2.updatePage();
    browser2.addBookmark(); //www.example.org");
    browser2.clearHistory();

    //Utilizar funcionalidade do Telefone:
    myPhone.makeCall();
    myPhone.answerCall();
    myPhone.startVoiceMail();
  }
}
