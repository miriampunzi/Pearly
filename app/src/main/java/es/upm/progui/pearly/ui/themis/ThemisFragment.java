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


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        themisViewModel = ViewModelProviders.of(this).get(ThemisViewModel.class);
        View root = inflater.inflate(R.layout.create_card, container, false);

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
        return root;
    }
}
