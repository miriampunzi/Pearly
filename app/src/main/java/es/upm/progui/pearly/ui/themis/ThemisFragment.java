package es.upm.progui.pearly.ui.themis;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import es.upm.progui.pearly.R;

public class ThemisFragment extends Fragment {

    private ThemisViewModel themisViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        themisViewModel = ViewModelProviders.of(this).get(ThemisViewModel.class);
        View root = inflater.inflate(R.layout.fragment_themis, container, false);
        return root;
    }
}
