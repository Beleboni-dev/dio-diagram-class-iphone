package main.java.edu.lucas.device.iphone.model;

public class Phone {

    private String phoneModel;

    public Phone(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public void makeCall() {
        System.out.println("Fazendo a chamada da instancia: " + phoneModel);
    }

    public void answerCall() {
        System.out.println("Atendendo a chamada da instancia: " + phoneModel);
    }

    public void startVoiceMail() {
        System.out.println("Iniciando correio de voz da instancia: " + phoneModel);
    }
}
