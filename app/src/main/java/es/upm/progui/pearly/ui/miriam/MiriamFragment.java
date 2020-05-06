package es.upm.progui.pearly.ui.miriam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import es.upm.progui.pearly.R;

public class MiriamFragment extends Fragment {

    private MiriamViewModel miriamViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        miriamViewModel = ViewModelProviders.of(this).get(MiriamViewModel.class);
        View root = inflater.inflate(R.layout.fragment_miriam, container, false);
        return root;
    }
}
