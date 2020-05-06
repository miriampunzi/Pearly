package es.upm.progui.pearly.ui.alejandro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import es.upm.progui.pearly.R;

public class AlejandroFragment extends Fragment {

    private AlejandroViewModel alejandroViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        alejandroViewModel = ViewModelProviders.of(this).get(AlejandroViewModel.class);
        View root = inflater.inflate(R.layout.fragment_alejandro, container, false);
        return root;
    }
}
