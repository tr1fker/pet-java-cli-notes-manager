package tr1fker;

import tr1fker.models.Note;

import java.util.List;

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
                    this.showListNotes();
                    break;
                case 3:
                    this.editNote();
                    break;
                case 4:
                    this.removeNote();
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

    public void showListNotes(){
        List<Note> notes = this.notesHandler.getNotes();
        this.outputHandler.printConsoleListNotes(notes);
    }

    public void editNote(){
        this.outputHandler.printConsoleInputId();
        int id = this.inputHandler.inputInteger();
        this.outputHandler.printConsoleInputNewName();
        String name = this.inputHandler.inputString();
        this.notesHandler.setNote(id, name);
        this.outputHandler.printConsoleSuccessEditing();
    }

    public void removeNote(){
        this.outputHandler.printConsoleInputId();
        int id = this.inputHandler.inputInteger();
        this.notesHandler.removeNote(id);
        this.outputHandler.printConsoleSuccessDeleting();
    }
}