package tr1fker;

import tr1fker.models.Note;

import java.util.ArrayList;
import java.util.List;

public class NotesHandler {
    private List<Note> notes;
    private int maxIdNote;

    private GsonHandler gsonHandler;

    public NotesHandler(GsonHandler gsonHandler) {
        this.gsonHandler = gsonHandler;

        this.notes = new ArrayList<>();
        this.maxIdNote = 0;
    }


    public void addNote(Note note) {
        if (note.getId() == -1){
            note.setId(++maxIdNote);
        }

        this.notes.add(note);
    }

    public void setNote(int id, String name) {
        for (Note note : this.notes) {
            if (note.getId() == id) {
                note.setName(name);
            }
        }
    }

    public void removeNote(int id){
        for (Note note : this.notes) {
            if (note.getId() == id) {
                this.notes.remove(note);
                break;
            }
        }
    }

    public List<Note> getNotes(){
        return this.notes;
    }


    public void loadNotes(){
        this.notes = this.gsonHandler.loadNotes();
        for (Note note : this.notes){
            note.setId(++this.maxIdNote);
        }
    }

    public void saveNotes(){
        this.gsonHandler.saveNotes(this.notes);
    }
}
