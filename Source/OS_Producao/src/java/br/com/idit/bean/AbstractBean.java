package br.com.idit.bean;

import br.com.idit.persistence.dao.AbstractDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.model.SelectItem;

public abstract class AbstractBean<T> implements Serializable {

    protected abstract List<T> getList();
    protected abstract AbstractDAO<T> getDAO();
    protected abstract T getPersistObject();

    public List<SelectItem> getListItems() {
        final List<SelectItem> listItems = new ArrayList<SelectItem>();
        for (T tipo : getList()) {
            listItems.add(new SelectItem(tipo, tipo.toString()));
        }
        return listItems;
    }

    public T insert() {
        return this.getDAO().insert(getPersistObject());
    }

    public T update() {
        return this.getDAO().update(getPersistObject());
    }

    public void delete() {
        this.getDAO().delete(getPersistObject());
    }
}
