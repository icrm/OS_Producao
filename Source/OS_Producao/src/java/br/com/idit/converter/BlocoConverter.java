package br.com.idit.converter;

import br.com.idit.persistence.dao.BlocosDAO;
import br.com.idit.persistence.entity.Blocos;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("blocoConverter")
public class BlocoConverter implements Converter {

    private BlocosDAO dao = new BlocosDAO();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        Blocos selected = null;
        selected = dao.findByField("dsBlocos", String.class, value);
        return selected;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object convert) {
        if (convert != null && convert instanceof Blocos) {
            return ((Blocos) convert).getDsBlocos();
        } else {
            return null;
        }
    }
    
}
