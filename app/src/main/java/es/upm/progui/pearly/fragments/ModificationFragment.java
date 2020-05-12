package es.upm.progui.pearly.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import es.upm.progui.pearly.R;
import es.upm.progui.pearly.adapters.UNOCardsAdapter;

public class ModificationFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_modification, container, false);

        RecyclerView UNOCardList = root.findViewById(R.id.recyclerView_fragmentModification_cards);
        UNOCardList.setHasFixedSize(true);
        UNOCardsAdapter adapter = new UNOCardsAdapter(getActivity());
        UNOCardList.setAdapter(adapter);
        GridLayoutManager UNOCardsLayoutManager = new GridLayoutManager(getContext(), 4);
        UNOCardList.setLayoutManager(UNOCardsLayoutManager);

        return root;
    }
}
