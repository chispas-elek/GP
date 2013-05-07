/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tringesInterfaces;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Aaron
 */
@Entity
@Table(name = "clubs", catalog = "tringes", schema = "")
@NamedQueries({
    @NamedQuery(name = "Clubs.findAll", query = "SELECT c FROM Clubs c"),
    @NamedQuery(name = "Clubs.findByNombre", query = "SELECT c FROM Clubs c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Clubs.findByUsuario", query = "SELECT c FROM Clubs c WHERE c.usuario = :usuario"),
    @NamedQuery(name = "Clubs.findByPatrocinador", query = "SELECT c FROM Clubs c WHERE c.patrocinador = :patrocinador"),
    @NamedQuery(name = "Clubs.findByNumperros", query = "SELECT c FROM Clubs c WHERE c.numperros = :numperros")})
public class Clubs implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "nombre")
    private String nombre;
    @Id
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "patrocinador")
    private String patrocinador;
    @Column(name = "numperros")
    private Integer numperros;

    public Clubs() {
    }

    public Clubs(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        String oldUsuario = this.usuario;
        this.usuario = usuario;
        changeSupport.firePropertyChange("usuario", oldUsuario, usuario);
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        String oldPatrocinador = this.patrocinador;
        this.patrocinador = patrocinador;
        changeSupport.firePropertyChange("patrocinador", oldPatrocinador, patrocinador);
    }

    public Integer getNumperros() {
        return numperros;
    }

    public void setNumperros(Integer numperros) {
        Integer oldNumperros = this.numperros;
        this.numperros = numperros;
        changeSupport.firePropertyChange("numperros", oldNumperros, numperros);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuario != null ? usuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clubs)) {
            return false;
        }
        Clubs other = (Clubs) object;
        if ((this.usuario == null && other.usuario != null) || (this.usuario != null && !this.usuario.equals(other.usuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tringesInterfaces.Clubs[ usuario=" + usuario + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
