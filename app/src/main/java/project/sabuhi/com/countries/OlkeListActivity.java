package project.sabuhi.com.countries;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by SABUHI on 5/2/2016.
 */
public class OlkeListActivity extends SingleFragmentActivity {

    protected Fragment createFragment(){


        return  new OlkeListFragment();
    }
}