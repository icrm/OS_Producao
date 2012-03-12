package br.com.idit.converter;

import br.com.idit.persistence.dao.AcabamentosDAO;
import br.com.idit.persistence.entity.Acabamentos;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("acabamentoConverter")
public class AcabamentoConverter implements Converter {

    private AcabamentosDAO dao = new AcabamentosDAO();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        Acabamentos selected = null;
        selected = dao.findByField("dsAcabamentos", String.class, value);
        return selected;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object convert) {
        if (convert != null && convert instanceof Acabamentos) {
            return ((Acabamentos) convert).getDsAcabamentos();
        } else {
            return null;
        }
    }
}
