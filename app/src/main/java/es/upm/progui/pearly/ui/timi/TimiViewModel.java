package es.upm.progui.pearly.ui.timi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TimiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TimiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is timi fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}