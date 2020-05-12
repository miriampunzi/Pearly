package es.upm.progui.pearly.ui.themis;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import es.upm.progui.pearly.Card_UNO;
import es.upm.progui.pearly.R;

public class NewCreateCardFragment extends Fragment {

    private EditText rule;
    private String rule_string;
    private ViewModel themisViewModel;
    private ImageView card;
    private int image_resource;
    private Button done;
    Card_UNO card_uno;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        themisViewModel = ViewModelProviders.of(this).get(ThemisViewModel.class);
        View root = inflater.inflate(R.layout.create_card, container, false);

        rule = (EditText) root.findViewById(R.id.write_rule);
        card = (ImageView) root.findViewById(R.id.empty_image);
        done = (Button) root.findViewById(R.id.done_create);

        Bundle bundle = getArguments();
        card_uno = (Card_UNO) bundle.getSerializable("Key_List");
        image_resource = card_uno.getImageIdResource();
        card.setImageResource(image_resource);

        if(rule.requestFocus()) {
            getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
            done.setEnabled(true);
            rule_string = rule.getText().toString();

            card_uno.setRule(rule_string);

            System.out.println(card_uno.getRule());
        }

        return root;
    }
}
