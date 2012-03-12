package br.com.idit.converter;

import br.com.idit.persistence.dao.ImpressaoMioloDAO;
import br.com.idit.persistence.entity.ImpressaoMiolo;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("impressaoMioloConverter")
public class ImpressaoMioloConverter implements Converter {

    private ImpressaoMioloDAO dao = new ImpressaoMioloDAO();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        ImpressaoMiolo selected = null;
        selected = dao.findByField("dsImpressaoMiolo", String.class, value);
        return selected;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object convert) {
        if (convert != null && convert instanceof ImpressaoMiolo) {
            return ((ImpressaoMiolo) convert).getDsImpressaoMiolo();
        } else {
            return null;
        }
    }
}
