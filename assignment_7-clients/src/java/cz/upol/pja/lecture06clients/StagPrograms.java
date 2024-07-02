
package cz.upol.pja.lecture06clients;

import cz.zcu.stag_ws.ProgramInfoListType;
import cz.zcu.stag_ws.ProgramInfoType;
import cz.zcu.stag_ws.ProgramyService;
import cz.zcu.stag_ws.ProgramyServiceImplService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.xml.ws.WebServiceRef;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
@Named("stagQuery")
public class StagPrograms {

    @WebServiceRef(ProgramyServiceImplService.class)
    private ProgramyService programyService;
    
    private String dept = "fakulta";
    private List<String> programs = new ArrayList<>();
    
    public StagPrograms() {
        super();
    }
    
    public String listCourses() {
        
        ProgramInfoListType programy = programyService.getStudijniProgramy("fakulta", null, null, null, null, null, null, null, null);
        for (ProgramInfoType pk : programy.getProgramInfo()) {
            String program = pk.getNazev();
                programs.add(program);
        }

        return "";
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public List<String> getPrograms() {
        return programs;
    }

    public void setPrograms(List<String> programs) {
        this.programs = programs;
    }
}