package tr1fker;

public class NotesManager {
    private static final String filePath = "notes.json";

    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        OutputHandler outputHandler = new OutputHandler();
        GsonHandler gsonHandler = new GsonHandler(filePath);
        NotesHandler notesHandler = new NotesHandler(gsonHandler);
        UIHandler uIHandler = new UIHandler(outputHandler, inputHandler, notesHandler);

        notesHandler.loadNotes();

        uIHandler.startConsoleUI();

        notesHandler.saveNotes();
    }
}