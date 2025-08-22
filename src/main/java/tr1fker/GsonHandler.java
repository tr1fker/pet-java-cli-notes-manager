package tr1fker;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import tr1fker.models.Note;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class GsonHandler {
    private Gson gson;
    private String filePath;

    public GsonHandler(String filPath) {
        this.gson = new Gson();
        this.filePath = filPath;
    }


    public void saveNotes(List<Note> notes){
        try (Writer writer = new FileWriter(filePath)) {
            gson.toJson(notes, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Note> loadNotes(){
        try (Reader reader = new FileReader(filePath)) {
            Type listType = new TypeToken<List<Note>>() {}.getType();
            List<Note> notes = gson.fromJson(reader, listType);
            return notes;
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
