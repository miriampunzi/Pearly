package es.upm.progui.pearly.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import es.upm.progui.pearly.Database;
import es.upm.progui.pearly.ListGamesAdapter;
import es.upm.progui.pearly.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        // created games list
        RecyclerView createdGamesList = root.findViewById(R.id.recyclerView_fragmentHome_createdGames);
        createdGamesList.setHasFixedSize(true);
        ListGamesAdapter createdGamesAdapter = new ListGamesAdapter(Database.GAMES_CREATED);
        createdGamesList.setAdapter(createdGamesAdapter);
        LinearLayoutManager createdGamesLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        createdGamesList.setLayoutManager(createdGamesLayoutManager);

        // favorite games list
        RecyclerView favoriteGamesList = root.findViewById(R.id.recyclerView_fragmentHome_favoriteGames);
        favoriteGamesList.setHasFixedSize(true);
        ListGamesAdapter favoriteGamesAdapter = new ListGamesAdapter(Database.GAMES_FAVORITES);
        favoriteGamesList.setAdapter(favoriteGamesAdapter);
        LinearLayoutManager favoriteGamesLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        favoriteGamesList.setLayoutManager(favoriteGamesLayoutManager);

        // top 10 games list
        RecyclerView top10GamesList = root.findViewById(R.id.recyclerView_fragmentHome_top10Games);
        top10GamesList.setHasFixedSize(true);
        ListGamesAdapter top10GamesAdapter = new ListGamesAdapter(Database.GAMES_TOP_10);
        top10GamesList.setAdapter(top10GamesAdapter);
        LinearLayoutManager top10GamesLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        top10GamesList.setLayoutManager(top10GamesLayoutManager);

        // classic games list
        RecyclerView classicGamesList = root.findViewById(R.id.recyclerView_fragmentHome_classicGames);
        classicGamesList.setHasFixedSize(true);
        ListGamesAdapter classicGamesAdapter = new ListGamesAdapter(Database.GAME_CLASSIC);
        classicGamesList.setAdapter(classicGamesAdapter);
        LinearLayoutManager classicGamesLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        classicGamesList.setLayoutManager(classicGamesLayoutManager);

        // solitary games list
        RecyclerView solitaryGamesList = root.findViewById(R.id.recyclerView_fragmentHome_solitaryGames);
        solitaryGamesList.setHasFixedSize(true);
        ListGamesAdapter solitaryGamesAdapter = new ListGamesAdapter(Database.GAMES_SOLITARY);
        solitaryGamesList.setAdapter(solitaryGamesAdapter);
        LinearLayoutManager solitaryGamesLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        solitaryGamesList.setLayoutManager(solitaryGamesLayoutManager);

        return root;
    }
}
