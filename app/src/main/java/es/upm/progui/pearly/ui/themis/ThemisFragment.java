package es.upm.progui.pearly.ui.themis;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import es.upm.progui.pearly.Card_UNO;
import es.upm.progui.pearly.R;

public class ThemisFragment extends Fragment {

    private ThemisViewModel themisViewModel;
    private Button btn_add_image;
    private EditText rule;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        themisViewModel = ViewModelProviders.of(this).get(ThemisViewModel.class);
        View root = inflater.inflate(R.layout.create_card, container, false);

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        rule = (EditText) root.findViewById(R.id.write_rule);

        btn_add_image = (Button) root.findViewById(R.id.add_image);

        btn_add_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                AddImageFragment addimage = new AddImageFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.add(R.id.nav_host_fragment, addimage,"Add_Image");
                transaction.addToBackStack("Add_Image");
                transaction.commit();
            }
        });

        Bundle bundle = getArguments();
        Card_UNO card_uno = bundle.getParcelable("Key_List");

        SharedPreferences settings = this.getActivity().getSharedPreferences("PREFS", 0);
        rule.setText(settings.getString("value", ""));

        card_uno.setRule("");

        return root;
    }
}
