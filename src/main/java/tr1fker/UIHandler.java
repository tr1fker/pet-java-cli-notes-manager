package tr1fker;

public class UIHandler {
    private InputHandler inputHandler;
    private OutputHandler outputHandler;

    private boolean isRunning = false;

    public UIHandler(OutputHandler outputHandler, InputHandler inputHandler) {
        this.outputHandler = outputHandler;
        this.inputHandler = inputHandler;
    }

    public void startConsoleUI(){
        this.isRunning = true;

        while(this.isRunning){
            this.outputHandler.printConsoleMenu();

            this.outputHandler.printConsoleInputOption();
            int option = this.inputHandler.inputInteger();

            switch(option){
                case 1:
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
}
