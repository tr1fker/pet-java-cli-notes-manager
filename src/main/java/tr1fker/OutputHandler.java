package tr1fker;

public class OutputHandler {
    public void printConsoleMenu(){
        System.out.print("""
             Меню            
-----------------------------
1. Добавить заметку
2. Просмотреть список заметок
3. Редактировать заметку
4. Удалить заметку
5. Выйти
-----------------------------
                """);
    }

    public void printConsoleInputOption(){
        System.out.print("Введите номер опции:");
    }

}
