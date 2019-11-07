/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan51.gajikaryawan;

/**
 *
 * @author PC
 */
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        return kehadiran*10000;
    }
    
    public float tunjanganJabatan(String jabatan){
        int tunjab;
        if(jabatan.equals("Manager")) tunjab = 2000000;
        else if(jabatan.equals("Kabag")) tunjab = 1000000;
        else tunjab = 0;
        return tunjab;
    }
    
    public float tunjanganGolongan(int golongan){
      int tungol;
      if(golongan == 1) tungol = 500000;
      else if (golongan == 2) tungol = 1000000;
      else if (golongan == 3) tungol = 1500000;
      else tungol = 0;
      return tungol;
    }
    
    public float gajiTotal(){
        return tunjanganGolongan(golongan)+ tunjanganJabatan(jabatan)+ tunjanganKehadiran(kehadiran);
    }
}
