/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_31052024.model;

import irfan_31052024.Mahasiswa.Dosen;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class DosenDao {
     private List<Dosen> data = new ArrayList<Dosen>();
    
    public DosenDao()
    {
        data.add(new Dosen("ali","2918301475","Padang","034127834612","alieeiufksdh@gmail.com","L","23-02-1006"));
        data.add(new Dosen("ani","4574673903","Pekanbaru","875234654102","aniau@gmail.com","P","26-06-1990"));
        data.add(new Dosen("budi","9523678475","solok","135858043265","abudih@gmail.com","L","7-03-1945"));
    }
    
    public void insert(Dosen d)
    {
        data.add(d);
    }
    
    public void update(int index, Dosen d)
    {
        data.set(index, d);
    }
    
    public void delete(int index)
    {
        data.remove(index);
    }

    public Dosen getDosen(int index)
    {
        return data.get(index);
    }

    public List<Dosen> getAllDosen() 
    {
        return data;
    }
    
}
