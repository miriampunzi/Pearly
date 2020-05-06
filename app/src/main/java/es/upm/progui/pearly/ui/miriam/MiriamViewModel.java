package es.upm.progui.pearly.ui.miriam;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MiriamViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MiriamViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is miriam fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}