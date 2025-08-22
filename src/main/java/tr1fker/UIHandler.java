package tr1fker;

import tr1fker.models.Note;

public class UIHandler {
    private InputHandler inputHandler;
    private OutputHandler outputHandler;
    private NotesHandler notesHandler;

    private boolean isRunning = false;

    public UIHandler(OutputHandler outputHandler, InputHandler inputHandler, NotesHandler notesHandler) {
        this.outputHandler = outputHandler;
        this.inputHandler = inputHandler;
        this.notesHandler = notesHandler;
    }

    public void startConsoleUI(){
        this.isRunning = true;

        while(this.isRunning){
            this.outputHandler.printConsoleMenu();

            this.outputHandler.printConsoleInputOption();
            int option = this.inputHandler.inputInteger();

            switch(option){
                case 1:
                    this.createNote();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    this.isRunning = false;
                    break;
            }
        }

    }

    public void createNote(){
        this.outputHandler.printConsoleInputName();
        String name = this.inputHandler.inputString();
        this.notesHandler.addNote(new Note(name));
        this.outputHandler.printConsoleSuccessAdding();
    }
}
