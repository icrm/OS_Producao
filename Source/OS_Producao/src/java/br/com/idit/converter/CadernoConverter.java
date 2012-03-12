package br.com.idit.converter;

import br.com.idit.persistence.dao.CadernosDAO;
import br.com.idit.persistence.entity.Cadernos;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("cadernoConverter")
public class CadernoConverter implements Converter {

    private CadernosDAO dao = new CadernosDAO();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        Cadernos selected = null;
        selected = dao.findByField("dsCadernos", String.class, value);
        return selected;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object convert) {
        if (convert != null && convert instanceof Cadernos) {
            return ((Cadernos) convert).getDsCadernos();
        } else {
            return null;
        }
    }
}
