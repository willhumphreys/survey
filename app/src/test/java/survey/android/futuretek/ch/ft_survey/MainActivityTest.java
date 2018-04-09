package survey.android.futuretek.ch.ft_survey;

import android.os.Bundle;
import android.view.View;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;

public class MainActivityTest {


    @Test
    public void shouldHandleNameInputCorrectly() {
        MainActivity mainActivity = Mockito.spy(MainActivity.class);

        Bundle bundle = new Bundle();


        doNothing().when(mainActivity).onCreate(bundle);


        mainActivity.onCreate(bundle);



//        View viewById = mainActivity.findViewById(R.id.textLayout);
//
//        viewById.callOnClick();

    }
}