package br.com.idit.converter;

import br.com.idit.persistence.dao.PapelDAO;
import br.com.idit.persistence.entity.Papel;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("papelConverter")
public class PapelConverter implements Converter {

    private PapelDAO dao = new PapelDAO();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        Papel selected = null;
        selected = dao.findByField("dsPapel", String.class, value);
        return selected;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object convert) {
        if (convert != null && convert instanceof Papel) {
            return ((Papel) convert).getDsPapel();
        } else {
            return null;
        }
    }
}
