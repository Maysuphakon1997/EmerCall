package may.snru.th.ac.th.emercall.fragment;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import may.snru.th.ac.th.emercall.R;

/**
 * Created by Admin on 20/2/2561.
 */

public class MainFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //  For Station 1
        ImageView Station1ImageView = getView().findViewById(R.id.imageViewStation1);

        //  For Station 2

        //  For Station 3

        //  For Station 4



    }// Main Method


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_police, container, false);
        return view;
    }
} //Main Class
