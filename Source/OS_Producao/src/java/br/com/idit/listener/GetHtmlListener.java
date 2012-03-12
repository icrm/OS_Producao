package br.com.idit.listener;

import java.io.Writer;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpServletResponse;

public class GetHtmlListener implements PhaseListener {

    @Override
    public void afterPhase(PhaseEvent pe) {
        HttpServletResponse response = (HttpServletResponse) pe.getFacesContext().getExternalContext().getResponse();
        //Writer w = response.getWriter();
    }

    @Override
    public void beforePhase(PhaseEvent pe) {
        System.out.println("Before Phase Listener");
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.RENDER_RESPONSE;
    }
    
}
