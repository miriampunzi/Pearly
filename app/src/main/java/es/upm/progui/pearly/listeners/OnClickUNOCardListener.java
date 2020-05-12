package es.upm.progui.pearly.listeners;

import android.view.View;
import android.widget.AdapterView;

import androidx.fragment.app.FragmentActivity;

import es.upm.progui.pearly.dialogs.DialogSingleUNOCard;
import es.upm.progui.pearly.entities.Card_UNO;

public class OnClickUNOCardListener implements AdapterView.OnClickListener {

    private Card_UNO card;
    private FragmentActivity fragmentActivity;

    public OnClickUNOCardListener(Card_UNO card, FragmentActivity fragmentActivity) {
        this.card = card;
        this.fragmentActivity = fragmentActivity;
    }

    @Override
    public void onClick(View v) {
        DialogSingleUNOCard dialogSingleUNOCard = new DialogSingleUNOCard(card, fragmentActivity);
        dialogSingleUNOCard.show(fragmentActivity.getSupportFragmentManager(), "DELETE DIALOG");
    }
}
