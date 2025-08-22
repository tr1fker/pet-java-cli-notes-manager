package tr1fker;

public class NotesManager {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        OutputHandler outputHandler = new OutputHandler();
        UIHandler uIHandler = new UIHandler(outputHandler, inputHandler);

        uIHandler.startConsoleUI();

    }
}