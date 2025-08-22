package tr1fker.models;

public class Note {
    private int id;
    private String name;

    public Note(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Note(String name){
        this.id = -1;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }


    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
}

