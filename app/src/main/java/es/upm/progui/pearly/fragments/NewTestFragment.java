package es.upm.progui.pearly.fragments;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import es.upm.progui.pearly.R;
import es.upm.progui.pearly.database.Database;

public class NewTestFragment extends Fragment {

    private ArrayAdapter<CharSequence> spinner_adapter1;
    private ArrayAdapter<CharSequence> spinner_adapter2;
    private ArrayAdapter<CharSequence> spinner_adapter3;
    private Spinner spinner_1;
    private Spinner spinner_2;
    private Spinner spinner_3;
    private EditText test_name;
    private Button save_test;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.new_test, container, false);

        spinner_1 = root.findViewById(R.id.spinner_1);

        spinner_2 = root.findViewById(R.id.spinner_2);

        spinner_3 = root.findViewById(R.id.spinner_3);

        test_name = root.findViewById(R.id.test_name);

        save_test = root.findViewById(R.id.save_test);

        spinner_adapter1 = ArrayAdapter.createFromResource(this.getActivity(),R.array.options, R.layout.spinner_testing);

        spinner_adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_1.setAdapter(spinner_adapter1);

        spinner_adapter2 = ArrayAdapter.createFromResource(this.getActivity(),R.array.options, R.layout.spinner_testing);

        spinner_adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_2.setAdapter(spinner_adapter2);

        spinner_adapter3 = ArrayAdapter.createFromResource(this.getActivity(),R.array.options, R.layout.spinner_testing);

        spinner_adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_3.setAdapter(spinner_adapter3);

        save_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

                builder.setMessage("Are you sure you want to save test '" + test_name.getText().toString() + "' ?");

                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new GameDetailFragment()).commit();
                        dialog.dismiss();
                    }
                });

                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

                dialog.show();
            }
        });

        return root;
    }
}
