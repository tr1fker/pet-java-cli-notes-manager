package tr1fker;

import tr1fker.models.Note;

import java.util.ArrayList;
import java.util.List;

public class NotesHandler {
    private List<Note> notes;
    private int maxIdNote;

    public NotesHandler() {
        this.notes = new ArrayList<>();
        this.maxIdNote = 0;
    }


    public void addNote(Note note) {
        if (note.getId() == -1){
            note.setId(++maxIdNote);
        }

        this.notes.add(note);
    }
}
