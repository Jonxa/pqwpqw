/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros.ejb;

import libros.exception.GeneroException;
import java.util.Collection;
import javax.ejb.Stateless;

/**
 * Stateless EJB for managing operations with Gender entities.
 * @author Jon Xabier Gimenez
 */
@Stateless
public class GestorGenerosBean implements GestorGenerosBeanLocal {

    @Override
    public Collection getAllGeneros() {
        return null;
    }

    @Override
    public void createGenero() throws GeneroException {
    }

    @Override
    public void deleteGenero() throws GeneroException{
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
