package org.lpdql.automaton.sirius.editor;

import org.eclipse.emf.ecore.EObject;
import org.lpdql.automaton.NamedElement;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       if(self instanceof NamedElement) {
    	   NamedElement n = (NamedElement) self;
    	   n.setName("new " + n.getName());
       }
      return self;
    }
}
