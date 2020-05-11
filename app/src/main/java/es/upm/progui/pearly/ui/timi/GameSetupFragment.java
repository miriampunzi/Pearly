package es.upm.progui.pearly.ui.timi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import es.upm.progui.pearly.R;

public class GameSetupFragment extends Fragment {

    public static GameSetupFragment newInstance() {
        return new GameSetupFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_game_setup, container, false);

        NumberPicker numberPickerCards = root.findViewById(R.id.numberPicker_fragmentGameSetup_numberOfCards);
        numberPickerCards.setMinValue(0);
        numberPickerCards.setMaxValue(10);
        numberPickerCards.setWrapSelectorWheel(true);

        NumberPicker numberPickerPlayers = root.findViewById(R.id.numberPicker_fragmentGameSetup_numberOfPlayers);
        numberPickerPlayers.setMinValue(0);
        numberPickerPlayers.setMaxValue(15);
        numberPickerPlayers.setWrapSelectorWheel(true);

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // TODO: Use the ViewModel
    }

}
