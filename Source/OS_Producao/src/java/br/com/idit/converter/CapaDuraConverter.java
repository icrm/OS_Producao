package br.com.idit.converter;

import br.com.idit.persistence.dao.CapaDuraDAO;
import br.com.idit.persistence.entity.CapaDura;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("capaDuraConverter")
public class CapaDuraConverter implements Converter {

    private CapaDuraDAO dao = new CapaDuraDAO();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        CapaDura selected = null;
        selected = dao.findByField("dsCapaDura", String.class, value);
        return selected;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object convert) {
        if (convert != null && convert instanceof CapaDura) {
            return ((CapaDura) convert).getDsCapaDura();
        } else {
            return null;
        }
    }
    
}
