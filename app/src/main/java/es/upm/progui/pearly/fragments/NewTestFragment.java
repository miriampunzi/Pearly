package es.upm.progui.pearly.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import es.upm.progui.pearly.R;

public class NewTestFragment extends Fragment {

    private ArrayAdapter<CharSequence> spinner_adapter1;
    private ArrayAdapter<CharSequence> spinner_adapter2;
    private ArrayAdapter<CharSequence> spinner_adapter3;
    private Spinner spinner_1;
    private Spinner spinner_2;
    private Spinner spinner_3;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.new_test, container, false);

        spinner_1 = root.findViewById(R.id.spinner_1);

        spinner_2 = root.findViewById(R.id.spinner_2);

        spinner_3 = root.findViewById(R.id.spinner_3);

        //EditText t = (EditText) root.findViewById(R.id.test_name);

        spinner_adapter1 = ArrayAdapter.createFromResource(this.getActivity(),R.array.options, R.layout.spinner_testing);

        spinner_adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_1.setAdapter(spinner_adapter1);

        spinner_adapter2 = ArrayAdapter.createFromResource(this.getActivity(),R.array.options, R.layout.spinner_testing);

        spinner_adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_2.setAdapter(spinner_adapter2);

        spinner_adapter3 = ArrayAdapter.createFromResource(this.getActivity(),R.array.options, R.layout.spinner_testing);

        spinner_adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_3.setAdapter(spinner_adapter3);

        return root;
    }
}
