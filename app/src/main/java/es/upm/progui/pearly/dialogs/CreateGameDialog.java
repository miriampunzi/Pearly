package es.upm.progui.pearly.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import es.upm.progui.pearly.R;
import es.upm.progui.pearly.database.Database;
import es.upm.progui.pearly.entities.Game;
import es.upm.progui.pearly.fragments.HomeFragment;

public class CreateGameDialog extends DialogFragment {

    private FragmentActivity fragmentActivity;

    public CreateGameDialog(FragmentActivity fragmentActivity) {
        this.fragmentActivity = fragmentActivity;
    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = requireActivity().getLayoutInflater();
        View dialogCreateGameView = inflater.inflate(R.layout.dialog_create_game, null);

        builder.setTitle("Game saving");

        final EditText newGameName = dialogCreateGameView.findViewById(R.id.editText_dialogCreateGame_newGameName);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Database.GAMES_CREATED.add(new Game(newGameName.getText().toString(), R.drawable.uno));
                fragmentActivity.getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new HomeFragment()).addToBackStack(null).commit();
                dialog.dismiss();
            }
        });

        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.setView(dialogCreateGameView);

        AlertDialog dialog = builder.create();
        return dialog;
    }
}
