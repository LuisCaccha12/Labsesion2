/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion.pkg2.newpackage;

/**
 *
 * @author Estudiante
 */
public class Enemigo {
    
    private int vidas;
    private int nivel;
    private int tipo;
    
    public Enemigo (){}
    
    public Enemigo(int vidas, int nivel, int tipo) {
        this.vidas = vidas;
        this.nivel = nivel;
        this.tipo = tipo;
    }

    /**
     * @return las vidas del enemigo
     */
    public int getVidas() {
        return vidas;
    }

    /**
     * @param vidas the vidas to set
     */
    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    /**
     * @return the vias
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param vias the vias to set
     */
    public void setNivel(int vias) {
        this.nivel = nivel;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
