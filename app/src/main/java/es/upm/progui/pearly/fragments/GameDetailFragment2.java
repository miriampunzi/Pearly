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

public class GameDetailFragment2 extends Fragment {

    public static GameDetailFragment2 newInstance() {
        return new GameDetailFragment2();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View gameDetailView = inflater.inflate(R.layout.fragment_game_detail2, container, false);

        Button startGameButton = gameDetailView.findViewById(R.id.button_fragmentGameDetail_startGame);


        startGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new GameSetupFragment()).addToBackStack(null).commit();
            }
        });

        Button modifyGameButton = gameDetailView.findViewById(R.id.button_fragmentGameDetail_modifyGame);
        modifyGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new ModificationFragment()).addToBackStack(null).commit();
            }
        });

        Button testButton = gameDetailView.findViewById(R.id.button_test);
         testButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new TestingFragment()).addToBackStack(null).commit();
             }
         });


        return gameDetailView;
    }

}
