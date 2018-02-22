package may.snru.th.ac.th.emercall.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import may.snru.th.ac.th.emercall.R;
import may.snru.th.ac.th.emercall.utility.HospitalAdapter;

/**
 * Created by Admin on 22/2/2561.
 */

public class HospitalFragment  extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create ListView
        ListView listView = getView(). findViewById(R.id.listViewHopotal);

                int[] ints = new int[] {R.drawable.station1,
                        R.drawable.station2,R.drawable.station3,
                        R.drawable.station4,R.drawable.station1,
                        R.drawable.station2,R.drawable.station3,
                        R.drawable.station4,};

                String[] titleStrings = new String[]{"Hospital","Hospita2",
                        "Hospita3","Hospita4","Hospita5","Hospita6","Hospita7","Hospita8"};

                String[] phoneStrings = new String[]{"111","112","113","114",
                        "115","116","117","118"};

                HospitalAdapter hospitalAdapter = new HospitalAdapter(getActivity(),ints,titleStrings,phoneStrings);
                listView.setAdapter(hospitalAdapter);





    }  //    Main Method

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hospital,container,false);

        return view;
    }
}

    // Main Class
