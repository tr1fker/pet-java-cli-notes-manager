package tr1fker;

import tr1fker.models.Note;

import java.util.List;

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

    public void printConsoleInputName(){
        System.out.print("Введите название заметки:");
    }

    public void printConsoleSuccessAdding(){
        System.out.println("Заметка успешно добавлена!");
    }

    public void printConsoleListNotes(List<Note> notes){
        for (Note note : notes){
            System.out.println("Note №" + note.getId() + " Name:" + note.getName());
        }
    }

    public void printConsoleInputId(){
        System.out.print("Введите номер заметки:");
    }

    public void printConsoleInputNewName(){
        System.out.print("Введите новое название:");
    }

    public void printConsoleSuccessEditing(){
        System.out.println("Заметка успешно отредактирована!");
    }

    public void printConsoleSuccessDeleting(){
        System.out.println("Заметка успешно удалена!");
    }
}