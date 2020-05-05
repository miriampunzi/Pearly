package es.upm.progui.pearly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListGamesAdapter extends RecyclerView.Adapter<ListGamesAdapter.GameItemViewHolder> {

    private Game[] games;

    public ListGamesAdapter(Game[] games) {
        this.games = games;
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
    }

    @Override
    public int getItemCount() {
        return games.length;
    }

    public class GameItemViewHolder extends RecyclerView.ViewHolder {

        TextView gameTitle;
        ImageView gameImage;

        public GameItemViewHolder(@NonNull View itemView) {
            super(itemView);

            gameTitle = itemView.findViewById(R.id.textView_item_games_gameTitle);
            gameImage = itemView.findViewById(R.id.imageView_item_games_gameImage);
        }
    }
}
