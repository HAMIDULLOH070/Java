package creational.abstractfactory.learning;

import creational.abstractfactory.Developer;
import creational.abstractfactory.ProjectManager;
import creational.abstractfactory.ProjectTeamFactory;
import creational.abstractfactory.Tester;

public class LearningTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new LearningPM();
    }
}
