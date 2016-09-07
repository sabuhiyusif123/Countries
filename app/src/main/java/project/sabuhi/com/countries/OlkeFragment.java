package project.sabuhi.com.countries;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.*;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.UUID;

import project.sabuhi.com.countries.R;

/**
 * Created by Cavid on 4/30/2016.
 */
public class OlkeFragment extends Fragment {
    private Olke mOlke;
    private TextView mNameField;
    private TextView mNameField1;
    private TextView mNameField2;
//    private project.sabuhi.com.olkeler.Toolbar mToolbar;

    public static final String EXTRA_OLKE_ID = "project.sabuhi.com.countries.olke_id";

    public static OlkeFragment newInstance(UUID olkeId){
        Bundle args = new Bundle();

        args.putSerializable(EXTRA_OLKE_ID, olkeId);

        OlkeFragment fragment = new OlkeFragment();

        fragment.setArguments(args);
        return  fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mOlke = new Olke();
        UUID olkeId=(UUID)getArguments().getSerializable(EXTRA_OLKE_ID);
        mOlke =OlkeLab.get(getActivity()).getOlke(olkeId);
//        mToolbar.activateToolbar();


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_olke, parent, false);

        mNameField = (TextView) v.findViewById(R.id.olke_adi);
        mNameField.setText(mOlke.getNameOlke());
        mNameField2 =(TextView) v.findViewById(R.id.paytaxtAdi);
        mNameField2.setText(mOlke.getPaytaxt());


        return v;
    }
}