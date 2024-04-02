package generic;

import java.util.ArrayList;

public class Mahasiswaku {
    public static void main(String[] args) {
        Mahasiswa <String,String,Integer> m = new Mahasiswa<>();
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setStudentClass(21);

        ArrayList<Object> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(m.getNim());
        mahasiswaList.add(m.getName());
        mahasiswaList.add(m.getStudentClass());

        System.out.println(mahasiswaList);
    }
}
