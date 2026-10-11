package creational.abstractfactory.erp;

import creational.abstractfactory.Developer;
import creational.abstractfactory.ProjectManager;
import creational.abstractfactory.ProjectTeamFactory;
import creational.abstractfactory.Tester;

public class ErpTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new AutoTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new ErpPM();
    }
}
