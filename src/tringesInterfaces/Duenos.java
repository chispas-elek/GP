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
@Table(name = "duenos", catalog = "tringes", schema = "")
@NamedQueries({
    @NamedQuery(name = "Duenos.findAll", query = "SELECT d FROM Duenos d"),
    @NamedQuery(name = "Duenos.findByNombre", query = "SELECT d FROM Duenos d WHERE d.nombre = :nombre"),
    @NamedQuery(name = "Duenos.findByApellidos", query = "SELECT d FROM Duenos d WHERE d.apellidos = :apellidos"),
    @NamedQuery(name = "Duenos.findById", query = "SELECT d FROM Duenos d WHERE d.id = :id"),
    @NamedQuery(name = "Duenos.findByUsuario", query = "SELECT d FROM Duenos d WHERE d.usuario = :usuario")})
public class Duenos implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "usuario")
    private String usuario;

    public Duenos() {
    }

    public Duenos(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        String oldApellidos = this.apellidos;
        this.apellidos = apellidos;
        changeSupport.firePropertyChange("apellidos", oldApellidos, apellidos);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        String oldUsuario = this.usuario;
        this.usuario = usuario;
        changeSupport.firePropertyChange("usuario", oldUsuario, usuario);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Duenos)) {
            return false;
        }
        Duenos other = (Duenos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tringesInterfaces.Duenos[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
