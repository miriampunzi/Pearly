package es.upm.progui.pearly.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import es.upm.progui.pearly.R;

public class GameSetupFragment extends Fragment {

    public static GameSetupFragment newInstance() {
        return new GameSetupFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View gameSetupView = inflater.inflate(R.layout.fragment_game_setup, container, false);

        Button inviteFromFriendListButton = gameSetupView.findViewById(R.id.button_fragmentGameSetup_inviteFromFriendList);
        inviteFromFriendListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new InviteFragment()).addToBackStack(null).commit();
            }
        });

        return gameSetupView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // TODO: Use the ViewModel
    }

}
