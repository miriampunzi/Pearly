package es.upm.progui.pearly.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import es.upm.progui.pearly.R;
import es.upm.progui.pearly.adapters.UNOCardsAdapter;
import es.upm.progui.pearly.dialogs.CreateGameDialog;

public class ModificationFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View modificationView = inflater.inflate(R.layout.fragment_modification, container, false);

        RecyclerView UNOCardList = modificationView.findViewById(R.id.recyclerView_fragmentModification_cards);
        UNOCardsAdapter adapter = new UNOCardsAdapter(getActivity());
        UNOCardList.setAdapter(adapter);
        GridLayoutManager UNOCardsLayoutManager = new GridLayoutManager(getContext(), 4);
        UNOCardList.setLayoutManager(UNOCardsLayoutManager);

        Button applyChangesButton = modificationView.findViewById(R.id.button_fragmentModification_applyChanges);
        applyChangesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateGameDialog createGameDialog = new CreateGameDialog(getActivity());
                createGameDialog.show(getActivity().getSupportFragmentManager(), "CREATE GAME");
            }
        });

        return modificationView;
    }
}
