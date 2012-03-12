package br.com.idit.converter;

import br.com.idit.persistence.dao.MioloDAO;
import br.com.idit.persistence.entity.Miolo;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("mioloConverter")
public class MioloConverter implements Converter {

    private MioloDAO dao = new MioloDAO();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        Miolo selected = null;
        selected = dao.findByField("dsMiolo", String.class, value);
        return selected;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object convert) {
        if (convert != null && convert instanceof Miolo) {
            return ((Miolo) convert).getDsMiolo();
        } else {
            return null;
        }
    }
    
}
