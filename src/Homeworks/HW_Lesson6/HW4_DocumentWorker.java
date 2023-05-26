package Homeworks.HW_Lesson6;

public class HW4_DocumentWorker {
    public void openDocument() {
        System.out.println("The document is open");
    }

    public void editDocument() {
        System.out.println("Document editing is available in the Pro version");
    }

    public void saveDocument() {
        System.out.println("Document saving is available in the Pro version");
    }
}

class ProDocumentWorker extends HW4_DocumentWorker {
    @Override
    public void editDocument() {
        System.out.println("The document has been edited");
    }

    @Override
    public void saveDocument() {
        System.out.println("The document is saved in the old format, saving in other formats is available in the Expert version");
    }
}

class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    public void saveDocument() {
        System.out.println("The document is saved in a new format");
    }
}
