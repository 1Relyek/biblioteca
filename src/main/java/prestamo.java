
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab21
 */
public class prestamo extends libro{
    
    private Date iniciop;
    private Date finp;
    private boolean multa;

    public prestamo() {
    }

    public prestamo(Date iniciop, Date finp, boolean multa) {
        this.iniciop = iniciop;
        this.finp = finp;
        this.multa = multa;
    }

    public prestamo(Date iniciop, Date finp, boolean multa, int codLibro, String titulo, String autor, String editorial, int anio) {
        super(codLibro, titulo, autor, editorial, anio);
        this.iniciop = iniciop;
        this.finp = finp;
        this.multa = multa;
    }

    public Date getIniciop() {
        return iniciop;
    }

    public void setIniciop(Date iniciop) {
        this.iniciop = iniciop;
    }

    public Date getFinp() {
        return finp;
    }

    public void setFinp(Date finp) {
        this.finp = finp;
    }

    public boolean isMulta() {
        return multa;
    }

    public void setMulta(boolean multa) {
        this.multa = multa;
    }
    
    
    
}
