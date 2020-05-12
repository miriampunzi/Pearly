package es.upm.progui.pearly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import es.upm.progui.pearly.ui.timi.GameDetailFragment;

public class ListGamesAdapter extends RecyclerView.Adapter<ListGamesAdapter.GameItemViewHolder> {

    private Game[] games;
    private FragmentActivity fragmentActivity;

    public ListGamesAdapter(Game[] games, FragmentActivity fragmentActivity) {
        this.games = games;
        this.fragmentActivity = fragmentActivity;
    }

    @NonNull
    @Override
    public GameItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_games, parent, false);
        return new GameItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameItemViewHolder holder, int position) {
        holder.gameTitle.setText(games[position].getName());
        holder.gameImage.setImageResource(games[position].getImageIdResource());

        if (games[position].getName() == "UNO") {
            holder.parentView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fragmentActivity.getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new GameDetailFragment()).commit();
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return games.length;
    }

    public class GameItemViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout parentView;
        TextView gameTitle;
        ImageView gameImage;

        public GameItemViewHolder(@NonNull View itemView) {
            super(itemView);

            parentView = itemView.findViewById(R.id.constraintLayout_itemGame);
            gameTitle = itemView.findViewById(R.id.textView_item_games_gameTitle);
            gameImage = itemView.findViewById(R.id.imageView_item_games_gameImage);
        }
    }
}
