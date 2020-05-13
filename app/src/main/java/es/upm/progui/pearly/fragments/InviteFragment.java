package es.upm.progui.pearly.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import es.upm.progui.pearly.R;
import es.upm.progui.pearly.activities.GamePlayActivity;

public class InviteFragment extends Fragment {

    public static InviteFragment newInstance() {
        return new InviteFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inviteView = inflater.inflate(R.layout.fragment_invite, container, false);

        final TextView friendsInvited = inviteView.findViewById(R.id.textView_fragmentInvite_friendsInvited);
        final Button startGameButton = inviteView.findViewById(R.id.button_fragmentInvite_startGame);

        CheckBox darthVaderCheckbox = inviteView.findViewById(R.id.checkbox_fragmentInvite_darthVader);
        darthVaderCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                friendsInvited.setText("Friends invited: 1");
                startGameButton.setVisibility(View.VISIBLE);
            }
        });

        startGameButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent( getActivity(), GamePlayActivity.class));
            }
        });

        return inviteView;
    }
}
