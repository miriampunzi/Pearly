package es.upm.progui.pearly.ui.themis;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import es.upm.progui.pearly.Card_UNO;
import es.upm.progui.pearly.R;

public class AddImageFragment extends Fragment {

    private ThemisViewModel themisViewModel;
    private ImageView troll_face;
    private Button done_button;
    private ImageView empty_card;
    private Card_UNO troll_card;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        themisViewModel = ViewModelProviders.of(this).get(ThemisViewModel.class);
        View root = inflater.inflate(R.layout.popup_add_image, container, false);

        troll_face = (ImageView) root.findViewById(R.id.troll_face);
        done_button = (Button) root.findViewById(R.id.done_add);
        empty_card = (ImageView) root.findViewById(R.id.empty_image);

        troll_face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                done_button.setEnabled(true);
                troll_face.setClickable(false);

                done_button.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick (View v){

                       Fragment addimage = getFragmentManager().findFragmentByTag("Add_Image");

                        if (addimage instanceof AddImageFragment && addimage.isVisible()) {
                            if (getFragmentManager().getBackStackEntryCount() != 0) {

                                troll_card =  new Card_UNO(R.drawable.troll_card, "Joker Card", false, -1, null, "BLACK", null);

                                System.out.println(troll_card);

                                Bundle bundle = new Bundle();
                                bundle.putSerializable("Key_List", troll_card);

                                System.out.println(bundle);

                                NewCreateCardFragment newcreatecard = new NewCreateCardFragment();
                                newcreatecard.setArguments(bundle);

                                System.out.println(newcreatecard);

                                getFragmentManager().popBackStack();

                                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                                transaction.add(R.id.nav_host_fragment, newcreatecard,"Create Card");
                                transaction.addToBackStack("Create Card");

                                System.out.println(transaction);

                                transaction.commit();

                                //empty_card.setImageResource(R.drawable.troll_card);
                            }
                        }
                    }
                });
            }
        });
        return root;
    }

}
