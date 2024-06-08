/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_31052024.controller;
import irfan_31052024.Mahasiswa.MataKuliah;
import irfan_31052024.view.FormMataKuliah;
import irfan_31052024.model.MataKuliahDao;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class MataKuliahControler {
    FormMataKuliah formMataKuliah;
    MataKuliah MataKuliah;
    MataKuliahDao MataKuliahDao;
    int index;
    
    public MataKuliahControler(FormMataKuliah formMataKuliah)
    {
        this.formMataKuliah = formMataKuliah;
        MataKuliahDao = new MataKuliahDao();
    }
    
    public void cancel()
    {   int index = formMataKuliah.getTabelMataKuliah().getSelectedRow();
        formMataKuliah.getTxtNama().setText("");
        formMataKuliah.getTxtNobp().setText("");
        formMataKuliah.getTxtkls().setText("");
        formMataKuliah.getTxtMatkul().setText("");
        formMataKuliah.getTxtsks().setText("");
        isiSemester();
    }
    
    public void isiSemester()
    {   int index = formMataKuliah.getTabelMataKuliah().getSelectedRow();
        formMataKuliah.getCboSmt().removeAllItems();
        formMataKuliah.getCboSmt().addItem("1");
        formMataKuliah.getCboSmt().addItem("2");
        formMataKuliah.getCboSmt().addItem("3");
        formMataKuliah.getCboSmt().addItem("4");
        formMataKuliah.getCboSmt().addItem("5");
        formMataKuliah.getCboSmt().addItem("6");
        formMataKuliah.getCboSmt().addItem("7");
        formMataKuliah.getCboSmt().addItem("8");
        
    }
    public void isiJurusan()
    {   int index = formMataKuliah.getTabelMataKuliah().getSelectedRow();
        formMataKuliah.getCbojurusan().removeAllItems();
        formMataKuliah.getCbojurusan().addItem("Sipil");
        formMataKuliah.getCbojurusan().addItem("Elektro");
        formMataKuliah.getCbojurusan().addItem("Mesin");
        formMataKuliah.getCbojurusan().addItem("Teknologi Informasi");
        formMataKuliah.getCbojurusan().addItem("Adminstrasi Niaga");
        formMataKuliah.getCbojurusan().addItem("Akuntasi");
        formMataKuliah.getCbojurusan().addItem("Bahasa Inggris");
   
        
    }
    
    
    public void insert()
    {   int index = formMataKuliah.getTabelMataKuliah().getSelectedRow();
        MataKuliah = new MataKuliah();
        MataKuliah.setNama(formMataKuliah.getTxtNama().getText());
        MataKuliah.setNobp(formMataKuliah.getTxtNobp().getText());
        MataKuliah.setSmt(formMataKuliah.getCboSmt().getSelectedItem().toString());
        MataKuliah.setJurusan(formMataKuliah.getCbojurusan().getSelectedItem().toString());
        MataKuliah.setKelas(formMataKuliah.getTxtMatkul().getText());
        MataKuliah.setMK(formMataKuliah.getTxtMatkul().getText());
        MataKuliah.setSks(formMataKuliah.getTxtsks().getText());
        MataKuliahDao.insert(MataKuliah);
        JOptionPane.showMessageDialog(formMataKuliah, "Entry Data Ok");
    }
    
    public void getMataKuliah(){
        int index = formMataKuliah.getTabelMataKuliah().getSelectedRow();
        MataKuliah = MataKuliahDao.getMataKuliah(index);
        if(MataKuliah != null){
            formMataKuliah.getTxtNama().setText(MataKuliah.getNama());
            formMataKuliah.getTxtNobp().setText(MataKuliah.getNobp());
            formMataKuliah.getCboSmt().setSelectedItem(MataKuliah.getSmt());
            formMataKuliah.getCbojurusan().setSelectedItem(MataKuliah.getJurusan());
            formMataKuliah.getTxtkls().setText(MataKuliah.getKelas());
            formMataKuliah.getTxtMatkul().setText(MataKuliah.getMK());
            formMataKuliah.getTxtsks().setText(MataKuliah.getSks());
           
            
            
              
        }else{
            JOptionPane.showMessageDialog(formMataKuliah, "Data tidak Ditemukan");
        }
    }
    
    public void viewData()
    {   int index = formMataKuliah.getTabelMataKuliah().getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)formMataKuliah.getTabelMataKuliah().getModel();
        model.setNumRows(0);
        List<MataKuliah> list = MataKuliahDao.getAllMataKuliah();
        for(MataKuliah MataKuliah :list)
        {
            Object[] data = 
            {
                MataKuliah.getNama(),
                MataKuliah.getNobp(),
                MataKuliah.getSmt(),
                MataKuliah.getJurusan(),
                MataKuliah.getKelas(),
                MataKuliah.getMK(),
                MataKuliah.getSks()
             
            };
            model.addRow(data);
        }
    }
    
    public void update()
    {   int index = formMataKuliah.getTabelMataKuliah().getSelectedRow();
        MataKuliah.setNama(formMataKuliah.getTxtNama().getText());
        MataKuliah.setNobp(formMataKuliah.getTxtNobp().getText());
        MataKuliah.setSmt(formMataKuliah.getCboSmt().getSelectedItem().toString());
        MataKuliah.setJurusan(formMataKuliah.getCbojurusan().getSelectedItem().toString());
        MataKuliah.setKelas(formMataKuliah.getTxtkls().getText());
        MataKuliah.setMK(formMataKuliah.getTxtMatkul().getText());
        MataKuliah.setSks(formMataKuliah.getTxtsks().getText());
        JOptionPane.showMessageDialog(formMataKuliah, "Update Data OK");
    }
    
    public void delete()
        {   int index = formMataKuliah.getTabelMataKuliah().getSelectedRow();
            MataKuliahDao.delete(index);
            JOptionPane.showMessageDialog(formMataKuliah, "Delete Data Ok");
        }
}
