package jobs;

import models.User;
import play.Logger;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;

@OnApplicationStart
public class Bootstrap extends Job {

    private static final String INITIAL_DATA_YML = "initial-data.yml";

    public void doJob() {
        // Check if the database is empty
        if (User.count() == 0) {
            Logger.debug("Bootstrap: Initializing %s", INITIAL_DATA_YML);
            Fixtures.delete();  //Bug! Ver: https://groups.google.com/forum/#!topic/play-framework/qwxcw47_TVA
            Fixtures.loadModels(INITIAL_DATA_YML);
        }
    }

}
