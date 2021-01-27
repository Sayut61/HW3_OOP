package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ключ авторизации: ");
        String autorsation = in.nextLine();
        if(autorsation.equals("")){
            DocumentWorker documentWorker = new DocumentWorker();
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();
        }
        else if(autorsation.equals("pro")){
            DocumentWorker proDocumentWorker = new ProDocumentWorker();
            proDocumentWorker.openDocument();
            proDocumentWorker.editDocument();
            proDocumentWorker.saveDocument();
        }
        else if(autorsation.equals("exp")){
            DocumentWorker expDocumentWorker = new ExpertDocumentWorker();
            expDocumentWorker.openDocument();
            expDocumentWorker.editDocument();
            expDocumentWorker.saveDocument();
        }

    }

}
