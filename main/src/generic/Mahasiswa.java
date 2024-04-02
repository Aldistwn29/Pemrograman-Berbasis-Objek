package generic;

public class Mahasiswa <Nim, Name, StudentClass> {
    private Nim nim;
    private Name name;
    private Integer stundentClass;


    public void setNim(Nim nim){
        this.nim = nim;
    }

    public void setName(Name name){
        this.name = name;
    }

    public void setStudentClass(Integer studentClass){
        this.stundentClass = studentClass;
    }

    public Nim getNim(){
        return nim;
    }

    public Name getName(){
        return name;
    }

    public Integer getStudentClass(){
        return stundentClass;
    }
}
