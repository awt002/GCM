package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyDLCuqcc_RXK80Z8ttt-eA86gvpH-Po1SQ";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bE1B9b-HGdXbCGkihEEite2nt_Jl5YsPwxkupKX4IAtda2yjpPL5emwJ4DaAIicSIo7SJutnrW9EexKqQddYCCDdPCi2bb0O6pDCvitpkkD5dmXloLeNYoogzKAJqfFMgyicx2_");

        c.createData("Working!!", "Test message");

        return c;
    }
}

