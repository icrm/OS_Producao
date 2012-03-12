package br.com.idit.converter;

import br.com.idit.persistence.dao.InsercoesDAO;
import br.com.idit.persistence.entity.Insercoes;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("insercaoConverter")
public class InsercaoConverter implements Converter {
    
    private InsercoesDAO dao = new InsercoesDAO();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        Insercoes selected = null;
        selected = dao.findByField("dsInsercoes", String.class, value);
        return selected;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object convert) {
        if (convert != null && convert instanceof Insercoes) {
            return ((Insercoes) convert).getDsInsercoes();
        } else {
            return null;
        }
    }

}
