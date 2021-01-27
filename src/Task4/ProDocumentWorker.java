package Task4;

public class ProDocumentWorker extends DocumentWorker{
    @Override
    void openDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    void editDocument() {
        System.out.println("Документ сохранен в старом формате");
    }

    @Override
    void saveDocument() {
        System.out.println("сохранение в остальных форматах доступно в версии Эксперт");
    }
}
