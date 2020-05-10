package es.upm.progui.pearly;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;

public class OnDeleteCardClickListener implements AdapterView.OnClickListener {

    private Card_UNO card;
    private FragmentActivity fragmentActivity;

    public OnDeleteCardClickListener(Card_UNO card, FragmentActivity fragmentActivity) {
        this.card = card;
        this.fragmentActivity = fragmentActivity;
    }

    @Override
    public void onClick(View v) {
        DeleteCardConfirmationDialog deleteCardConfirmationDialog = new DeleteCardConfirmationDialog(card, fragmentActivity);
        deleteCardConfirmationDialog.show(fragmentActivity.getSupportFragmentManager(), "DELETE DIALOG");
    }
}
