/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan_31052024.controller;

import irfan_31052024.Mahasiswa.Dosen;
import irfan_31052024.view.FormDosen;
import irfan_31052024.model.DosenDao;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class DosenControler 
{
    FormDosen formDosen;
    Dosen dosen;
    DosenDao dosendao;
    int index;
    
    public DosenControler(FormDosen formDosen)
    {
        this.formDosen = formDosen;
        dosendao = new DosenDao();
    }
    
    public void cancel()
    {   int index = formDosen.getTabelDosen().getSelectedRow();
        formDosen.getTxtNm().setText("");
        formDosen.getTxtNip().setText("");
        formDosen.getTxtAlmt().setText("");
        formDosen.getTxtNohp().setText("");
        formDosen.getTxtEmail().setText("");
        formDosen.getTxtTgllhr().setText("");
        isiJenisKelamin();
    }
    
    public void isiJenisKelamin()
    {   int index = formDosen.getTabelDosen().getSelectedRow();
        formDosen.getCboJk().removeAllItems();
        formDosen.getCboJk().addItem("L");
        formDosen.getCboJk().addItem("P");
    }
    
    public void insert()
    {   int index = formDosen.getTabelDosen().getSelectedRow();
        dosen = new Dosen();
        dosen.setNip(formDosen.getTxtNip().getText());
        dosen.setNama(formDosen.getTxtNm().getText());
        dosen.setAlamat(formDosen.getTxtAlmt().getText());
        dosen.setNohp(formDosen.getTxtNohp().getText());
        dosen.setEmail(formDosen.getTxtEmail().getText());
        dosen.setTglalhir(formDosen.getTxtTgllhr().getText());
        dosen.setJenisKelamin(formDosen.getCboJk().getSelectedItem().toString());
        dosendao.insert(dosen);
        JOptionPane.showMessageDialog(formDosen, "Entry Data Ok");
    }
    
    public void getDosen(){
        int index = formDosen.getTabelDosen().getSelectedRow();
        dosen = dosendao.getDosen(index);
        if(dosen != null){
            formDosen.getTxtNm().setText(dosen.getNama());
            formDosen.getTxtNip().setText(dosen.getNip());
            formDosen.getTxtAlmt().setText(dosen.getAlamat());
            formDosen.getTxtNohp().setText(dosen.getNohp());
            formDosen.getTxtEmail().setText(dosen.getEmail());
            formDosen.getTxtTgllhr().setText(dosen.getTgllahir());
            formDosen.getCboJk().setSelectedItem(dosen.getJenisKelamin());
            
            
              
        }else{
            JOptionPane.showMessageDialog(formDosen, "Data tidak ditemukan ");
        }
    }
    
    public void viewData()
    {   int index = formDosen.getTabelDosen().getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)formDosen.getTabelDosen().getModel();
        model.setNumRows(0);
        List<Dosen> list = dosendao.getAllDosen();
        for(Dosen dosen :list)
        {
            Object[] data = 
            {   
                dosen.getNama(),
                dosen.getNip(),
                dosen.getAlamat(),
                dosen.getNohp(),
                dosen.getEmail(),
                dosen.getTgllahir(),
                dosen.getJenisKelamin()
                
            };
            model.addRow(data);
        }
    }
    
    public void update()
    {   int index = formDosen.getTabelDosen().getSelectedRow();
        dosen.setNip(formDosen.getTxtNip().getText());
        dosen.setNama(formDosen.getTxtNm().getText());
        dosen.setAlamat(formDosen.getTxtAlmt().getText());
        dosen.setNohp(formDosen.getTxtNohp().getText());
        dosen.setEmail(formDosen.getTxtEmail().getText());
        dosen.setTglalhir(formDosen.getTxtTgllhr().getText());
        dosen.setJenisKelamin(formDosen.getCboJk().getSelectedItem().toString());
        
        JOptionPane.showMessageDialog(formDosen, "Update Data OK");
    }
    
    public void delete()
        {   int index = formDosen.getTabelDosen().getSelectedRow();
            dosendao.delete(index);
            JOptionPane.showMessageDialog(formDosen, "Delete Data Ok");
        }
}
