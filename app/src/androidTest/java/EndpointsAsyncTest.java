import android.test.AndroidTestCase;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

/**
 * Created by i57198 on 6/16/17.
 */

public class EndpointsAsyncTest extends AndroidTestCase {

    public void testResultNotNull() {
        String result = null;
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        task.execute(getContext());

        try {
            result = task.get();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        assertNotNull(result);
    }
}
