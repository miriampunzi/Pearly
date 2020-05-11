package es.upm.progui.pearly.ui.timi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import es.upm.progui.pearly.R;

public class TimiFragment extends Fragment {

    private TimiViewModel timiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        timiViewModel = ViewModelProviders.of(this).get(TimiViewModel.class);
        View root = inflater.inflate(R.layout.fragment_game_setup, container, false);
        return root;
    }
}
