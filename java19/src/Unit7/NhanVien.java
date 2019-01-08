/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit7;

/**
 *
 * @author Hieu Trung
 */
public class NhanVien {
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NhanVien() {
    }

    public NhanVien(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.code+ "-"+ this.name;
    }
    
    
        
            
}
