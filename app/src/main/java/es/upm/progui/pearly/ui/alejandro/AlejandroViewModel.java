package es.upm.progui.pearly.ui.alejandro;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlejandroViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AlejandroViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is alejandro fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}